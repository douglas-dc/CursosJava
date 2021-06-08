
package com.douglas.estruturadados.fila;

public class Teste {
    
    public static void main(String[] args) {
        Fila<String> fila = new Fila();
        
        fila.enfileira("A");
        fila.enfileira("B");
        fila.enfileira("C");
        fila.enfileira("D");
        fila.enfileira("E");
        
        System.out.println(fila);
        System.out.println(fila.espiar());
        System.out.println(fila.desenfileira());
        System.out.println(fila);
    }
    
}
