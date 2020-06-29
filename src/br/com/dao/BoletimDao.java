package br.com.dao;

import br.com.model.Boletim;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;

public interface BoletimDao {

    public void atualizarSuspeitos(int numero);

    public void atualizarConfirmados(int numero);

    public void atualizarDescartados(int numero);

    public void atualizarObitos(int numero);

    public void atualizarRecuperados(int numero);

    public int buscarSuspeitos();

    public int buscarConfirmados();

    public int buscarDescartados();

    public int buscarObitos();

    public int buscarRecuperados();

    public void gerarBoletimEpidemiologico(List<Boletim> boletim, String CAMINHO_RELATORIO);

    public Boletim getBoletim();

    public void criarBoletim(Boletim boletim);
}
