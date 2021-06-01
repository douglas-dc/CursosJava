
package com.douglas.estruturadados.vetor.teste;

import com.douglas.estruturadados.vetor.Lista;

public class Exercicio01 {
    
    public static void main(String[] args) {
        
        Lista<String> vetor = new Lista(2);
        
        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        
        System.out.println(vetor);        
        System.out.println(vetor.contem("A"));
    }
    
}
