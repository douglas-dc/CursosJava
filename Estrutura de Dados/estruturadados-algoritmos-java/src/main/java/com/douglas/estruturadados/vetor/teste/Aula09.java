
package com.douglas.estruturadados.vetor.teste;

import com.douglas.estruturadados.vetor.Vetor;

public class Aula09 {
    
    public static void main(String[] args) {
        
        Vetor vetor = new Vetor(10);
    
        vetor.adiciona("B");
        vetor.adiciona("G");
        vetor.adiciona("D");
        vetor.adiciona("E");
        vetor.adiciona("F");
        
        vetor.remove(1);
        
        int pos = vetor.busca("E");
        if (pos > -1){
            vetor.remove(pos);  
        } else {
            System.out.println("Elemento não existe no vetor");
        }
         
        System.out.println(vetor);
    }
    
}
