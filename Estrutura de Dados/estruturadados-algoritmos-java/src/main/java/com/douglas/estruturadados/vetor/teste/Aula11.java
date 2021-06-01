
package com.douglas.estruturadados.vetor.teste;

import com.douglas.estruturadados.vetor.Lista;

public class Aula11 {
    
    public static void main(String[] args) {
        
        Lista<String> vetor = new Lista(1); // só pode utilizar String
        
        vetor.adiciona("Elemento 1");
        
        System.out.println(vetor);
        
        
        Lista<Contato> vetor2 = new Lista(1); // só pode utilizar um Contato
         
        Contato c1 = new Contato("Contato 1", "1234-5678", "contato1@gmail.com");
         
        vetor2.adiciona(c1); 
        
        System.out.println(vetor2);
    }
}
