
package com.douglas.estruturadados.pilha;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio01 {
    
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<Integer>();
        
        /*for (int i=1; i<11; i++){
            if (i % 2 == 0){
                stack.push(i);
            } else if (!(stack.isEmpty())){
                stack.pop();
            } else {
                System.out.println("A pilha (stack) está vazia.");
            } 
        }*/

        Scanner scan = new Scanner(System.in);
        
        for (int i=1; i<11; i++){
            
            System.out.println("Entre com um número: ");
            
            int num = scan.nextInt();
            
            if (num % 2 == 0){
                System.out.println("Empilhando o número: " + stack.push(num));
            } else if (!(stack.isEmpty())){
                System.out.println("Número ímpar, desempilhando número: " + stack.pop());
            } else {
                System.out.println("A pilha (stack) está vazia.");
            } 
        }  
        
        System.out.println(stack);
        
        if (stack.isEmpty() == false) {
            System.out.println("Todos os números foram lidos. Desempilhando todos os números: ");
            for (int i=stack.size()-1; i>-1; i--){
                System.out.println("Elemento desempilhado: " + stack.pop());
            }
        }
        
        System.out.println(stack);
    }
}
