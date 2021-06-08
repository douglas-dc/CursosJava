
package com.douglas.estruturadados.fila;

public class Aula21 {
    
    public static void main(String[] args) {
        
        Fila<Integer> fila = new Fila<>();
        
        System.out.println(fila.espiar()); //null
        
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        
        System.out.println(fila.espiar()); //1  
    }
}
