package br.com.dao;

import br.com.model.Paciente;
import java.util.List;

public interface PacienteDao {

    public void salvarPaciente(Paciente paciente);

    public void alterarPaciente(Paciente paciente);

    public void excluirPaciente(int id);

    public List<Paciente> getPacientes();
}
