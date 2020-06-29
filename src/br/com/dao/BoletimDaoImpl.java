package br.com.dao;

import br.com.connection.Conexao;
import br.com.model.Boletim;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class BoletimDaoImpl implements BoletimDao {

    Connection conexao = null;
    PreparedStatement pstm = null;

    @Override
    public void atualizarSuspeitos(int numero) {
        conexao = new Conexao().getConnection();
        String query = "UPDATE tb_boletim SET suspeitos=?";
        try {
            pstm = conexao.prepareStatement(query);
            pstm.setInt(1, numero);
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
    public void atualizarConfirmados(int numero) {
        conexao = new Conexao().getConnection();
        String query = "UPDATE tb_boletim SET confirmados=?";
        try {
            pstm = conexao.prepareStatement(query);
            pstm.setInt(1, numero);
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
    public void atualizarDescartados(int numero) {
        conexao = new Conexao().getConnection();
        String query = "UPDATE tb_boletim SET descartados=?";
        try {
            pstm = conexao.prepareStatement(query);
            pstm.setInt(1, numero);
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
    public void atualizarObitos(int numero) {
        conexao = new Conexao().getConnection();
        String query = "UPDATE tb_boletim SET obitos=?";
        try {
            pstm = conexao.prepareStatement(query);
            pstm.setInt(1, numero);
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
    public void atualizarRecuperados(int numero) {
        conexao = new Conexao().getConnection();
        String query = "UPDATE tb_boletim SET recuperados=?";
        try {
            pstm = conexao.prepareStatement(query);
            pstm.setInt(1, numero);
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
    public int buscarSuspeitos() {
        int numero = getBoletim().getSuspeitos();
        return numero;
    }

    @Override
    public int buscarConfirmados() {
        int numero = getBoletim().getConfirmados();
        return numero;
    }

    @Override
    public int buscarDescartados() {
        int numero = getBoletim().getDescartados();
        return numero;
    }

    @Override
    public int buscarObitos() {
        int numero = getBoletim().getObitos();
        return numero;
    }

    @Override
    public int buscarRecuperados() {
        int numero = getBoletim().getRecuperados();
        return numero;
    }

    @Override
    public void gerarBoletimEpidemiologico(List<Boletim> boletim, String CAMINHO_RELATORIO) {
        HashMap filtro = new HashMap();
        JRBeanCollectionDataSource colecao = new JRBeanCollectionDataSource(boletim, false);

        JasperPrint imprimir = null;
        try {
            imprimir = JasperFillManager.fillReport(CAMINHO_RELATORIO, filtro, colecao);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
        JasperViewer visualizar = new JasperViewer(imprimir, false);
        visualizar.setVisible(true);
    }

    @Override
    public Boletim getBoletim() {
        ResultSet rs = null;
        Boletim boletim = new Boletim();
        conexao = new Conexao().getConnection();
        String query = "SELECT* FROM tb_boletim";
        try {
            pstm = conexao.prepareStatement(query);
            rs = pstm.executeQuery();
            rs.first();

            boletim.setId(rs.getInt("id"));
            boletim.setSuspeitos(rs.getInt("suspeitos"));
            boletim.setConfirmados(rs.getInt("confirmados"));
            boletim.setDescartados(rs.getInt("descartados"));
            boletim.setObitos(rs.getInt("obitos"));
            boletim.setRecuperados(rs.getInt("recuperados"));

        } catch (SQLException object) {
            System.out.println("Erro: " + object);
        } finally {
            try {
                conexao.close();
            } catch (SQLException objectclose) {
                System.out.println("Erro: " + objectclose);
            }
        }
        return boletim;
    }

    @Override
    public void criarBoletim(Boletim boletim) {
        conexao = new Conexao().getConnection();
        String sqlinsert = "INSERT INTO tb_boletim(suspeitos, confirmados, descartados, obitos, recuperados) VALUES(?,?,?,?,?)";
        try {
            pstm = conexao.prepareStatement(sqlinsert);
            pstm.setInt(1, boletim.getSuspeitos());
            pstm.setInt(2, boletim.getConfirmados());
            pstm.setInt(3, boletim.getDescartados());
            pstm.setInt(4, boletim.getObitos());
            pstm.setInt(5, boletim.getRecuperados());
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

}
