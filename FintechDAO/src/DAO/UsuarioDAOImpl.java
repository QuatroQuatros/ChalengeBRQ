package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;


import Models.Usuario;
import br.com.quatroquatros.ConnectionManager;
import br.com.quatroquatros.Helpers;

public class UsuarioDAOImpl implements UsuarioDAO {
    private Connection conn;

    public UsuarioDAOImpl() {
        this.conn = ConnectionManager.getInstance().getConnection();
    }

    @Override
    public void inserirUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuarios (nome, email, senha, data_nascimento, foto, cpf) " +
                     "VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getSenha());
            stmt.setDate(4, new java.sql.Date(usuario.getDataNascimento().getTime()));
            stmt.setString(5, usuario.getFoto());
            stmt.setString(6, usuario.getCpf());
            stmt.executeUpdate();
            conn.commit();
            System.out.println("usuario criado");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Usuario buscarUsuarioPorId(int id) {
        String sql = "SELECT * FROM usuarios WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return criarUsuarioAPartirDoResultSet(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Usuario buscarUsuarioPorEmail(String email) {
        String sql = "SELECT * FROM usuarios WHERE email = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, email);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return criarUsuarioAPartirDoResultSet(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Usuario> listarTodosUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";
        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                usuarios.add(criarUsuarioAPartirDoResultSet(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    @Override
    public void atualizarUsuario(Usuario usuario) {
        String sql = "UPDATE usuarios SET nome = ?, email = ?, senha = ?, data_nascimento = ?, foto = ?, cpf = ? " +
                     "WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getSenha());
            stmt.setDate(4, new java.sql.Date(usuario.getDataNascimento().getTime()));
            stmt.setString(5, usuario.getFoto());
            stmt.setString(6, usuario.getCpf());
            stmt.setInt(7, usuario.getId());
            stmt.executeUpdate();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletarUsuario(int id) {
        String sql = "DELETE FROM usuarios WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Usuario criarUsuarioAPartirDoResultSet(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String nome = rs.getString("nome");
        String email = rs.getString("email");
        String senha = rs.getString("senha");
        Date dataNascimento = Helpers.formatDatabaseDate(rs.getString("data_nascimento"));
//        Date dataNascimento = rs.getDate("data_nascimento");
        String foto = rs.getString("foto");
        String cpf = rs.getString("cpf");

        return new Usuario(id, nome, email, senha, dataNascimento, foto, cpf);
    }
}
