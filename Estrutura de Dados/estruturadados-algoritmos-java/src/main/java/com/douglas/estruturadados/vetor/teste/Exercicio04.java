
package com.douglas.estruturadados.vetor.teste;

import com.douglas.estruturadados.vetor.Lista;

public class Exercicio04 {
   
    public static void main(String[] args) {
        
        Lista<String> lista = new Lista<String>(4);
        
        lista.adiciona("ALJA");
        lista.adiciona("HOO");
        lista.adiciona("ALPA");
        lista.adiciona("CINO");
        
        
        System.out.println(lista.busca(2));
        System.out.println(lista.busca(3));
        System.out.println(lista.busca(1));
        
        
        
    }
}
