package br.com.dao;

import br.com.model.Profissional;
import java.util.List;

public interface ProfissionalDao {

    public void salvarProfissional(Profissional profissional);

    public void alterarProfissional(Profissional profissional);

    public void excluirProfissional(int id);

    public List<Profissional> getProfissionais();
    
    public int buscarId(String nome, int matricula, String cargo);

    public String buscarNome(int id);
}
