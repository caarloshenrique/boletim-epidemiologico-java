package br.com.dao;

import br.com.connection.Conexao;
import br.com.model.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PacienteDaoImpl implements PacienteDao {

    Connection conexao = null;
    PreparedStatement pstm = null;

    @Override
    public void salvarPaciente(Paciente paciente) {
        conexao = new Conexao().getConnection();
        String sqlinsert = "INSERT INTO tb_paciente(nome, cpf, telefone, email, endereco, status, quarentena) VALUES(?,?,?,?,?,?,?)";
        try {
            pstm = conexao.prepareStatement(sqlinsert);
            pstm.setString(1, paciente.getNome());
            pstm.setInt(2, paciente.getCpf());
            pstm.setInt(3, paciente.getTelefone());
            pstm.setString(4, paciente.getEmail());
            pstm.setString(5, paciente.getEndereco());
            pstm.setString(6, paciente.getStatus());
            pstm.setBoolean(7, paciente.isQuarentena());
            pstm.execute();
            pstm.close();
        } catch (SQLException insert) {
            System.out.println("Erro: " + insert);
        } finally {
            try {
                conexao.close();
            } catch (SQLException insertclose) {
                System.out.println("Erro: " + insertclose);
            }
        }
    }

    @Override
    public void alterarPaciente(Paciente paciente) {
        conexao = new Conexao().getConnection();
        String query = "UPDATE tb_paciente SET nome=?, cpf=?, telefone=?, email=?, endereco=?, status=?, quarentena=? WHERE id=?";
        try {
            pstm = conexao.prepareStatement(query);
            pstm.setString(1, paciente.getNome());
            pstm.setInt(2, paciente.getCpf());
            pstm.setInt(3, paciente.getTelefone());
            pstm.setString(4, paciente.getEmail());
            pstm.setString(5, paciente.getEndereco());
            pstm.setString(6, paciente.getStatus());
            pstm.setBoolean(7, paciente.isQuarentena());
            pstm.setInt(8, paciente.getId());
            pstm.execute();
            pstm.close();
        } catch (SQLException update) {
            System.out.println("Erro: " + update);
        } finally {
            try {
                conexao.close();
            } catch (SQLException updateclose) {
                System.out.println("Erro: " + updateclose);
            }
        }
    }

    @Override
    public void excluirPaciente(int id) {
        conexao = new Conexao().getConnection();
        String query = "DELETE FROM tb_paciente WHERE id=?";
        try {
            pstm = conexao.prepareStatement(query);
            pstm.setInt(1, id);
            pstm.execute();
            pstm.close();
        } catch (SQLException delete) {
            System.out.println("Erro: " + delete);
        } finally {
            try {
                conexao.close();
            } catch (SQLException deleteclose) {
                System.out.println("Erro: " + deleteclose);
            }
        }
    }

    @Override
    public List<Paciente> getPacientes() {
        ResultSet rs = null;
        List<Paciente> lista = new ArrayList<Paciente>();
        conexao = new Conexao().getConnection();
        String query = "SELECT* FROM tb_paciente";
        try {
            pstm = conexao.prepareStatement(query);
            rs = pstm.executeQuery();
            rs.first();
            do {
                Paciente paciente = new Paciente();
                paciente.setId(rs.getInt("id"));
                paciente.setNome(rs.getString("nome"));
                paciente.setCpf(rs.getInt("cpf"));
                paciente.setTelefone(rs.getInt("telefone"));
                paciente.setEmail(rs.getString("email"));
                paciente.setEndereco(rs.getString("endereco"));
                paciente.setStatus(rs.getString("status"));
                paciente.setQuarentena(rs.getBoolean("quarentena"));

                lista.add(paciente);

            } while (rs.next());
        } catch (SQLException list) {
            System.out.println("Erro: " + list);
        } finally {
            try {
                conexao.close();
            } catch (SQLException listclose) {
                System.out.println("Erro: " + listclose);
            }
        }
        return lista;
    }

}
