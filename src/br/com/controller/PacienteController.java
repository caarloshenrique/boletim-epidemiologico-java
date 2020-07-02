package br.com.controller;

import br.com.dao.PacienteDao;
import br.com.dao.PacienteDaoImpl;
import br.com.model.Paciente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;

public class PacienteController {

    PacienteDao pacienteDao = new PacienteDaoImpl();

    public void salvarPaciente(Paciente paciente) {
        if (paciente != null && !paciente.getNome().equals("")
                && !paciente.getCpf().equals("")
                && !paciente.getTelefone().equals("")
                && !paciente.getEmail().equals("")
                && !paciente.getEndereco().equals("")
                && !paciente.getStatus().equals("--Selecione--")) {
            pacienteDao.salvarPaciente(paciente);
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios!");
        }
    }

    public void alterarPaciente(Paciente paciente) {
        if (paciente != null && !paciente.getNome().equals("")
                && !paciente.getCpf().equals("")
                && !paciente.getTelefone().equals("")
                && !paciente.getEmail().equals("")
                && !paciente.getEndereco().equals("")
                && !paciente.getStatus().equals("--Selecione--")) {
            pacienteDao.alterarPaciente(paciente);
            JOptionPane.showMessageDialog(null, "Editado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios!");
        }
    }

    public void excluirPaciente(int id) {
        if (id != 0) {
            int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente exluir o registro?");
            if (resp == 1) {
                JOptionPane.showMessageDialog(null, "Você não excluiu o registro");
            } else {
                pacienteDao.excluirPaciente(id);
                JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Informe um paciente para ser excluído!");
        }
    }

    public List<Paciente> getPacientes() {
        List<Paciente> lista = new ArrayList<Paciente>();
        lista = pacienteDao.getPacientes();
        return lista;
    }

    public Paciente buscarPaciente(int id) {
        Paciente paciente = new Paciente();
        paciente = pacienteDao.buscarPaciente(id);
        return paciente;
    }

    public int buscarUltimoId() {
        List<Paciente> pacientes = new ArrayList<Paciente>();
        pacientes = getPacientes();

        if (pacientes.isEmpty()) {
            return 0;
        } else {
            int id = pacientes.get(pacientes.size() - 1).getId();
            return id;
        }
    }
    
    public void gerarRelatorioPacientesConfirmados() throws JRException {
        String status = "Confirmado";
        String CAMINHO_RELATORIO = "C:\\Users\\Carlos\\Documents\\NetBeansProjects\\BoletimEpidemiologico\\src\\br\\com\\report\\ReportPacientesConfirmados.jasper";
        List<Paciente> lista = new ArrayList<Paciente>();
        lista = pacienteDao.getPacientesConfirmados();
        pacienteDao.gerarRelatorioPacientesConfirmados(lista, status, CAMINHO_RELATORIO);
    }

}
