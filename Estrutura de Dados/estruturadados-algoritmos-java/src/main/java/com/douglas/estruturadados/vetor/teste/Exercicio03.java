
package com.douglas.estruturadados.vetor.teste;

import com.douglas.estruturadados.vetor.Lista;

public class Exercicio03 {
    
    public static void main(String[] args) {
      
        Lista<String> lista = new Lista<String>(5);
        
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("A");
        
        lista.remove("A");
        lista.remove("D");
        System.out.println(lista);
    }
}
