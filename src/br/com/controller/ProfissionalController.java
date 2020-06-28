package br.com.controller;

import br.com.dao.ProfissionalDao;
import br.com.dao.ProfissionalDaoImpl;
import br.com.model.Profissional;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProfissionalController {

    ProfissionalDao profissionalDao = new ProfissionalDaoImpl();

    public void salvarProfissional(Profissional profissional) {
        if (profissional != null && !profissional.getNome().equals("")
                && profissional.getMatricula() != 0 && !profissional.getCargo().equals("")) {
            profissionalDao.salvarProfissional(profissional);
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios!");
        }
    }

    public void alterarProfissional(Profissional profissional) {
        if (profissional != null && !profissional.getNome().equals("")
                && profissional.getMatricula() != 0 && !profissional.getCargo().equals("")) {
            profissionalDao.alterarProfissional(profissional);
            JOptionPane.showMessageDialog(null, "Editado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios!");
        }
    }

    public void excluirProfissional(int id) {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente exluir o registro?");
        if (resp == 1) {
            JOptionPane.showMessageDialog(null, "Você não excluiu o registro");
        } else {
            if (id != 0) {
                profissionalDao.excluirProfissional(id);
                JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Informe um profissional para ser excluída!");
            }
        }
    }

    public List<Profissional> getProfissionais() {
        List<Profissional> lista = new ArrayList<Profissional>();
        lista = profissionalDao.getProfissionais();
        return lista;
    }

    public int buscarId(String nome, int matricula, String cargo) {
        int id = profissionalDao.buscarId(nome, matricula, cargo);
        return id;
    }

    public String buscarNome(int id) {
        String nome = profissionalDao.buscarNome(id);
        return nome;
    }
}
