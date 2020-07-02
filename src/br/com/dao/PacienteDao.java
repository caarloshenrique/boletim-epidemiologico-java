package br.com.dao;

import br.com.model.Paciente;
import java.util.List;
import net.sf.jasperreports.engine.JRException;

public interface PacienteDao {

    public void salvarPaciente(Paciente paciente);

    public void alterarPaciente(Paciente paciente);

    public void excluirPaciente(int id);

    public List<Paciente> getPacientes();

    public Paciente buscarPaciente(int id);
    
    public List<Paciente> getPacientesConfirmados();
    
    public void gerarRelatorioPacientesConfirmados(List<Paciente> pacientes, String status, String CAMINHO_RELATORIO) throws JRException;
}
