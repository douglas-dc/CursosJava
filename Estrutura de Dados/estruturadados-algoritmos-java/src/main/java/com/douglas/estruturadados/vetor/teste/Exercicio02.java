
package com.douglas.estruturadados.vetor.teste;

import com.douglas.estruturadados.vetor.Lista;
import java.util.NoSuchElementException;

public class Exercicio02 {
    
    public static void main(String[] args) throws Exception {
        
        Lista<String> vetor = new Lista(5);
        
        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("A");
        vetor.adiciona("D");
        vetor.adiciona("B");
        vetor.adiciona("A");
        vetor.adiciona("E");
        
        System.out.println(vetor.busca(4));
        vetor.ultimoIndice("Z");
        System.out.println(vetor.busca(3));
        
        
    }
}

