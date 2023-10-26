package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

import Models.Meta;
import Models.Recorrencia;
import Models.Usuario;
import br.com.quatroquatros.ConnectionManager;
import br.com.quatroquatros.Helpers;

public class MetaDAOImpl implements MetaDAO {
    private Connection conn;

    public MetaDAOImpl() {
        this.conn = ConnectionManager.getInstance().getConnection();
    }

    @Override
    public void inserirMeta(Meta meta) {
        String sql = "INSERT INTO metas (id_usuario, descricao, valor, data_conclusao_estimada, data_conclusao, status)" + 
                    "VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, meta.getIdUsuario());
            stmt.setString(2, meta.getDescricao());
            stmt.setDouble(3, meta.getValor());
            stmt.setDate(4, new java.sql.Date(meta.getDataConclusaoEstimada().getTime()));
            stmt.setDate(5, new java.sql.Date(meta.getDataConclusao().getTime()));
            stmt.setInt(6, meta.getStatus());

            stmt.executeUpdate();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Meta buscarMetaPorId(int id) {
        String sql = "SELECT * FROM metas WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                	int idUsuario = rs.getInt("id_usuario");
                    String descricao = rs.getString("descricao");
                    double valor = rs.getDouble("valor");
                    Date dataConclusaoEstimada = Helpers.formatDatabaseDate(rs.getString("data_conclusao_estimada"));
                    Date dataConclusao = Helpers.formatDatabaseDate(rs.getString("data_conclusao"));
                    int status = rs.getInt("status");
                    Timestamp createdAt = rs.getTimestamp("created_at");
                    Timestamp updatedAt = rs.getTimestamp("updated_at");
                    return new Meta(id, idUsuario, descricao, valor, dataConclusaoEstimada, dataConclusao, status, createdAt, updatedAt);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
}