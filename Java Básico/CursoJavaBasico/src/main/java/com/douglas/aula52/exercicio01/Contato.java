
package com.douglas.aula52.exercicio01;

public class Contato {
    
    private static int contador = 0;
    private String nome;
    private String telefone;
    private int id;
    
    public Contato() {
       contador++;
       id = contador;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + 
                "\nTelefone: " + telefone +
                "\nId: " + id;
    }
    
    

}
