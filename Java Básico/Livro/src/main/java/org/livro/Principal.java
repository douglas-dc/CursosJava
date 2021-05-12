
package org.livro;

public class Principal {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.nomeAutor = "Robert Cecil Martin";
        livro1.tituloLivro = "Clean Code";
        livro1.numPaginas = 456;
        
        System.out.println(livro1.tituloLivro + "\t" + livro1.nomeAutor + "\t" + livro1.numPaginas);
    }
}
