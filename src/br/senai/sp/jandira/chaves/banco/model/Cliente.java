package br.senai.sp.jandira.chaves.banco.model;

public class Cliente {
    private String nome;
    private String telefone;
    private String cpf;

    public String getNome(){
    return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
    this.telefone = telefone;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
