
package com.douglas.estruturadados.fila;

public class Pessoa {
    
    private String nome;
    private Senha tipoSenha;

    public Pessoa(String nome, Senha tipoSenha) {
        this.nome = nome;
        this.tipoSenha = tipoSenha;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Senha getTipoSenha() {
        return tipoSenha;
    }

    public void setTipoSenha(Senha tipoSenha) {
        this.tipoSenha = tipoSenha;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " Senha: " + tipoSenha;
    }

    
    
    
}
