
package com.douglas.estruturadados.fila;

public class Aula24 {
    
    public static void main(String[] args) {
        
        FilaComPrioridade<Paciente> p = new FilaComPrioridade<>();
        
        p.enfileira(new Paciente("Carlos", 5));
        p.enfileira(new Paciente("José", 1));
        p.enfileira(new Paciente("Maria", 6));
        p.enfileira(new Paciente("Flávia", 3));
        p.enfileira(new Paciente("Antônio", 4));
        p.enfileira(new Paciente("Zohan", 2));
        
        System.out.println(p);
        
        FilaComPrioridade<Integer> fila = new FilaComPrioridade<>();
        
        fila.enfileira(5);
        fila.enfileira(1);
        fila.enfileira(3);
        fila.enfileira(2);
        fila.enfileira(4);
        
        System.out.println(fila);
        
       
    }
}
