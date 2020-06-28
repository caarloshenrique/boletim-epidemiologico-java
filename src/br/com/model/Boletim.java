package br.com.model;

public class Boletim {

    private int id;
    private int suspeitos;
    private int confirmados;
    private int descartados;
    private int obitos;
    private int recuperados;

    public Boletim() {
    }

    public Boletim(int id, int suspeitos, int confirmados, int descartados, int obitos, int recuperados) {
        this.id = id;
        this.suspeitos = suspeitos;
        this.confirmados = confirmados;
        this.descartados = descartados;
        this.obitos = obitos;
        this.recuperados = recuperados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSuspeitos() {
        return suspeitos;
    }

    public void setSuspeitos(int suspeitos) {
        this.suspeitos = suspeitos;
    }

    public int getConfirmados() {
        return confirmados;
    }

    public void setConfirmados(int confirmados) {
        this.confirmados = confirmados;
    }

    public int getDescartados() {
        return descartados;
    }

    public void setDescartados(int descartados) {
        this.descartados = descartados;
    }

    public int getObitos() {
        return obitos;
    }

    public void setObitos(int obitos) {
        this.obitos = obitos;
    }

    public int getRecuperados() {
        return recuperados;
    }

    public void setRecuperados(int recuperados) {
        this.recuperados = recuperados;
    }

}

