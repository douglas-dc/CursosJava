
package org.livro;

public class Principal {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.nomeAutor = "Robert Cecil Martin";
        livro1.tituloLivro = "Clean Code";
        livro1.numPaginas = 456;
        
        Livro livro2 = new Livro();
        livro2.nomeAutor = "Kai-fu Lee";
        livro2.tituloLivro = "Inteligência Artificial";
        livro2.numPaginas = 292;
        
        System.out.println("Título: " + livro1.tituloLivro + "\t" + "Autor: " + livro1.nomeAutor + "\t" + "Num. páginas: " + livro1.numPaginas);
        System.out.println("Título: " + livro2.tituloLivro + "\t" + "Autor: " + livro2.nomeAutor + "\t" + "Num. páginas: " + livro2.numPaginas);
    }
}
