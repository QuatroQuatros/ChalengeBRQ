package Models;

import java.util.Date;
import java.sql.Timestamp;

public class Despesas {
    private int id;
    private int id_usuario;
    private int id_tipo_despesa;
    private int id_recorrencia;
    private float valor;
    private String descricao;
    private Date data_vencimento;
    private Timestamp created_at;
    private Timestamp updated_at;

    public Despesas() {
        // Construtor vazio, você pode adicionar seus próprios construtores, se
        // necessário.
    }

    public Despesas(int id_usuario, int id_tipo_despesa, int id_recorrencia, float valor, String descricao,
            Date data_vencimento) {
        this.id_usuario = id_usuario;
        this.id_tipo_despesa = id_tipo_despesa;
        this.id_recorrencia = id_recorrencia;
        this.valor = valor;
        this.descricao = descricao;
        this.data_vencimento = data_vencimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_tipo_despesa() {
        return id_tipo_despesa;
    }

    public void setId_tipo_despesa(int id_tipo_despesa) {
        this.id_tipo_despesa = id_tipo_despesa;
    }

    public int getId_recorrencia() {
        return id_recorrencia;
    }

    public void setId_recorrencia(int id_recorrencia) {
        this.id_recorrencia = id_recorrencia;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData_vencimento() {
        return data_vencimento;
    }

    public void setData_vencimento(Date data_vencimento) {
        this.data_vencimento = data_vencimento;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    @Override
    public String toString() {
        return "Despesas{" +
                "id=" + id +
                ", id_usuario=" + id_usuario +
                ", id_tipo_despesa=" + id_tipo_despesa +
                ", id_recorrencia=" + id_recorrencia +
                ", valor=" + valor +
                ", descricao='" + descricao + '\'' +
                ", data_vencimento=" + data_vencimento +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
