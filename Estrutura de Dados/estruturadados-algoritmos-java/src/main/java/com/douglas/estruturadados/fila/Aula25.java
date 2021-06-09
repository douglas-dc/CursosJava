
package com.douglas.estruturadados.fila;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25 {
    
    public static void main(String[] args) {
        
        Queue<Integer> filaComPrioridade = new PriorityQueue<>();
        
        filaComPrioridade.add(2);
        filaComPrioridade.add(1);
        filaComPrioridade.add(3);
        
        System.out.println(filaComPrioridade);
        
        Queue<Paciente> filaPacientePrioridade = new PriorityQueue<>();
           /* new Comparator<Paciente>() {
                @Override
                public int compare(Paciente p1, Paciente p2) {
                    if (p1.getPrioridade() > p2.getPrioridade()) {
                        return 1;
                    } else if (p1.getPrioridade() < p2.getPrioridade()) {
                        return -1;
                    }
                    return 0;
                }
            }
        );*/
          
        filaPacientePrioridade.add(new Paciente("Mariane", 2));
        filaPacientePrioridade.add(new Paciente("Clint", 3));
        filaPacientePrioridade.add(new Paciente("Douglas", 1));
        
        System.out.println(filaPacientePrioridade);
    }
}
