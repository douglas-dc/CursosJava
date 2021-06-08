
package com.douglas.estruturadados.pilha;

public class Livro {
    
    private String nome;
    private String autor;
    private String isbn;
    private String ano;
    

    public Livro() {
    }

    public Livro(String nome, String autor, String isbn, String ano) {
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
        this.ano = ano;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Livro{" + "nome=" + nome + ", autor=" + autor + ", isbn=" + isbn + ", ano=" + ano + '}';
    }
    
}
