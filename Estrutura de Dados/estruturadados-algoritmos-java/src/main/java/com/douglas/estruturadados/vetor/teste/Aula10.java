
package com.douglas.estruturadados.vetor.teste;

import com.douglas.estruturadados.vetor.VetorObjetos;

public class Aula10 {
    
    public static void main(String[] args) {
        
        VetorObjetos vetor = new VetorObjetos(3);
        
        Contato c1 = new Contato("Contato 1", "1234-5678", "contato1@gmail.com");
        Contato c2 = new Contato("Contato 2", "5678-1234", "contato2@gmail.com");
        Contato c3 = new Contato("Contato 3", "8765-4321", "contato3@gmail.com");
        
        Contato c4 = new Contato("Contato 3", "8765-4321", "contato3@gmail.com");
        
        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);
        
        int pos = vetor.busca(c4);
        
        if (pos > -1){
            System.out.println("Elemento existe no vetor");
        } else {
            System.out.println("Elemento não existe no vetor");
        }
        
        System.out.println("Tamanho = " + vetor.tamanho());
        System.out.println(vetor);
        
    }
}
