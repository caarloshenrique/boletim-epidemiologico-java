package br.com.dao;

import br.com.connection.Conexao;
import br.com.model.Profissional;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProfissionalDaoImpl implements ProfissionalDao {

    Connection conexao = null;
    PreparedStatement pstm = null;

    @Override
    public void salvarProfissional(Profissional profissional) {
        conexao = new Conexao().getConnection();
        String sqlinsert = "INSERT INTO tb_profissional(nome, matricula, cargo) VALUES(?,?,?)";
        try {
            pstm = conexao.prepareStatement(sqlinsert);
            pstm.setString(1, profissional.getNome());
            pstm.setInt(2, profissional.getMatricula());
            pstm.setString(3, profissional.getCargo());
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
    public void alterarProfissional(Profissional profissional) {
        conexao = new Conexao().getConnection();
        String query = "UPDATE tb_profissional SET nome=?, matricula=?, cargo=? WHERE id=?";
        try {
            pstm = conexao.prepareStatement(query);
            pstm.setString(1, profissional.getNome());
            pstm.setInt(2, profissional.getMatricula());
            pstm.setString(3, profissional.getCargo());
            pstm.setInt(4, profissional.getId());
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
    public void excluirProfissional(int id) {
        conexao = new Conexao().getConnection();
        String query = "DELETE FROM tb_profissional WHERE id=?";
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
    public List<Profissional> getProfissionais() {
        ResultSet rs = null;
        List<Profissional> lista = new ArrayList<Profissional>();
        conexao = new Conexao().getConnection();
        String query = "SELECT* FROM tb_profissional";
        try {
            pstm = conexao.prepareStatement(query);
            rs = pstm.executeQuery();
            rs.first();
            do {
                Profissional profissional = new Profissional();
                profissional.setId(rs.getInt("id"));
                profissional.setNome(rs.getString("nome"));
                profissional.setMatricula(rs.getInt("matricula"));
                profissional.setCargo(rs.getString("cargo"));

                lista.add(profissional);

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

    @Override
    public int buscarId(String nome, int matricula, String cargo) {
        ResultSet rs = null;
        conexao = new Conexao().getConnection();
        String query = "SELECT* FROM tb_profissional WHERE nome=? AND matricula=? AND cargo=?";
        int id = 0;
        try {
            pstm = conexao.prepareStatement(query);
            pstm.setString(1, nome);
            pstm.setInt(2, matricula);
            pstm.setString(3, cargo);
            rs = pstm.executeQuery();
            rs.first();
            id = rs.getInt("id");
        } catch (SQLException findid) {
            System.out.println("Erro: " + findid);
        } finally {
            try {
                conexao.close();
            } catch (SQLException findidclose) {
                System.out.println("Erro: " + findidclose);
            }
        }
        return id;
    }

    @Override
    public String buscarNome(int id) {
        ResultSet rs = null;
        conexao = new Conexao().getConnection();
        String query = "SELECT* FROM tb_profissional WHERE id=?";
        String nome = null;
        try {
            pstm = conexao.prepareStatement(query);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            rs.first();
            nome = rs.getString("nome");
        } catch (SQLException findname) {
            System.out.println("Erro: " + findname);
        } finally {
            try {
                conexao.close();
            } catch (SQLException findnameclose) {
                System.out.println("Erro: " + findnameclose);
            }
        }
        return nome;
    }

}
