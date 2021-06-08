
package com.douglas.estruturadados.fila;

import java.util.LinkedList;
import java.util.Queue;

public class Aula23 {
    
    public static void main(String[] args) {
        
        //apenas os métodos que tem na Interface1
        Queue<Integer> fila = new LinkedList<>();
        
        fila.add(1); //enqueue
        fila.add(2); //enqueue
        fila.add(3); //enqueue
        fila.add(4); //enqueue
        
        System.out.println(fila);
        
        System.out.println(fila.peek());
        
        System.out.println(fila.remove());
        
        System.out.println(fila);
        
    }
}
