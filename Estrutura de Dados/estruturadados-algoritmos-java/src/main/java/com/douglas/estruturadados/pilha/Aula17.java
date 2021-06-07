
package com.douglas.estruturadados.pilha;

public class Aula17 {
    
    public static void main(String[] args) {
        
        Pilha<Integer> pilha = new Pilha<Integer>();
        
        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);
        pilha.empilha(4);
        pilha.empilha(5);
        pilha.empilha(6);
        
        System.out.println("Elemento desempilhado " + pilha.desempilha());
        
        System.out.println("Elemento no topo da pilha " + pilha.topo());
        System.out.println(pilha);
    }
}
