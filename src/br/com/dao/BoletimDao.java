package br.com.dao;

import java.sql.ResultSet;
import java.util.HashMap;

public interface BoletimDao {

    public void atualizarSuspeitos(int numero);

    public void atualizarConfirmados(int numero);

    public void atualizarDescartados(int numero);

    public void atualizarObitos(int numero);

    public void atualizarRecuperados(int numero);

    public void gerarBoletimEpidemiologico(ResultSet rs, HashMap filtro, String CAMINHO_RELATORIO);
}
