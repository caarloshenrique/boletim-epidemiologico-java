package br.com.controller;

import br.com.dao.BoletimDao;
import br.com.dao.BoletimDaoImpl;
import br.com.model.Boletim;
import java.util.ArrayList;
import java.util.List;

public class BoletimController {

    BoletimDao boletimDao = new BoletimDaoImpl();

    public void atualizarSuspeitos(int numero) {
        boletimDao.atualizarSuspeitos(numero);
    }

    public void atualizarConfirmados(int numero) {
        boletimDao.atualizarConfirmados(numero);
    }

    public void atualizarDescartados(int numero) {
        boletimDao.atualizarDescartados(numero);
    }

    public void atualizarObitos(int numero) {
        boletimDao.atualizarObitos(numero);
    }

    public void atualizarRecuperados(int numero) {
        boletimDao.atualizarRecuperados(numero);
    }

    public int buscarSuspeitos() {
        int numero = boletimDao.buscarSuspeitos();
        return numero;
    }

    public int buscarConfirmados() {
        int numero = boletimDao.buscarConfirmados();
        return numero;
    }

    public int buscarDescartados() {
        int numero = boletimDao.buscarDescartados();
        return numero;
    }

    public int buscarObitos() {
        int numero = boletimDao.buscarObitos();
        return numero;
    }

    public int buscarRecuperados() {
        int numero = boletimDao.buscarRecuperados();
        return numero;
    }

    public void gerarBoletimEpidemiologico() {
        String CAMINHO_RELATORIO = "C:\\Users\\Carlos\\Documents\\NetBeansProjects\\BoletimEpidemiologico\\src\\br\\com\\report\\ReportBoletim.jasper";
        List<Boletim> boletim = new ArrayList<Boletim>();
        boletim.add(getBoletim());
        boletimDao.gerarBoletimEpidemiologico(boletim, CAMINHO_RELATORIO);
    }

    public Boletim getBoletim() {
        Boletim boletim = new Boletim();
        boletim = boletimDao.getBoletim();
        return boletim;
    }

    public void criarBoletim() {
        if (getBoletim().getId() == 0) {
            Boletim novoBoletim = new Boletim();
            novoBoletim.setSuspeitos(0);
            novoBoletim.setConfirmados(0);
            novoBoletim.setDescartados(0);
            novoBoletim.setObitos(0);
            novoBoletim.setRecuperados(0);
            boletimDao.criarBoletim(novoBoletim);
        }
    }
}
