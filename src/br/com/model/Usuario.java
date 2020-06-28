package br.com.model;

public class Usuario {

    private int id;
    private String email;
    private String senha;
    private int profissionalId;

    public Usuario() {
    }

    public Usuario(int id, String email, String senha, int profissionalId) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.profissionalId = profissionalId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getProfissionalId() {
        return profissionalId;
    }

    public void setProfissionalId(int profissionalId) {
        this.profissionalId = profissionalId;
    }

}
