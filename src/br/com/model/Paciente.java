package br.com.model;

public class Paciente {

    private int id;
    private String nome;
    private int cpf;
    private int telefone;
    private String email;
    private String endereco;
    private String status;
    private boolean quarentena;

    public Paciente() {
    }

    public Paciente(int id, String nome, int cpf, int telefone, String email, String endereco, String status, boolean quarentena) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.status = status;
        this.quarentena = quarentena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isQuarentena() {
        return quarentena;
    }

    public void setQuarentena(boolean quarentena) {
        this.quarentena = quarentena;
    }

}
