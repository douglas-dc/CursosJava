
package com.douglas.estruturadados.pilha;

import java.util.Stack;

public class Exercicio03 {
    
    public static void main(String[] args) {
        
        Livro l1 = new Livro("Código Limpo", "Robert Cecil Martin", "9780136083252", "2008");
        Livro l2 = new Livro("A Arte da Guerra", "Sun Tzu", "9780691179780", "2018");
        Livro l3 = new Livro("Steve Jobs: The Exclusive Biography", "Walter Isaacson", " 9781408703748", "2011");
        Livro l4 = new Livro("Livro 4", "Autor 4", "4444444444444", "2004");
        Livro l5 = new Livro("Livro 5", "Autor 5", "5555555555555", "2005");
        Livro l6 = new Livro("Livro 6", "Autor 6", "6666666666666", "2006");
        
        Stack<Livro> livros = new Stack<Livro>();
        
        /* livros.setSize(20); a pilha já tem o tamanho da quantidade de elementos, se utilizado aqui 
          fará com que os primeiros elementos sejam null (adiciona sempre no topo)*/
        
        System.out.println("Pilha criada, está vazia? " + livros.isEmpty());
       
        livros.push(l1);
        livros.push(l2);
        livros.push(l3);
        livros.push(l4);
        livros.push(l5);
        livros.push(l6);
        
        System.out.println(livros.size() + " livros foram empilhados.");
        
        System.out.println(livros);
        
        System.out.println("Espiando o topo da pilha: " + livros.peek());
        
        System.out.println("Removendo todos os livros da pilha: ");
        
        while(!(livros.isEmpty())){
            System.out.println("Desempilhando livros da pilha: " + livros.pop());
        }
        
         System.out.println("A pilha está vazia? " + livros.isEmpty());
        
        
        
        
        
      
        
    }
}
