
package com.douglas.estruturadados.pilha;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio02 {
    
    public static void main(String[] args) {
        Stack<Integer> par = new Stack<Integer>();
        Stack<Integer> impar = new Stack<Integer>();
        
        Scanner scan = new Scanner(System.in);
        
        for (int i=1; i<11; i++){
            
            System.out.println("Entre com um número: ");
            
            int num = scan.nextInt();
            if (num == 0) {
                if (!(par.isEmpty())){
                    System.out.println("Desempilhando número na pilha par: " + par.pop());
                } else {
                    System.out.println("Pilha par vazia.");
                }
                if (!(impar.isEmpty())){
                    System.out.println("Desempilhando número na pilha ímpar: " + impar.pop());
                } else {
                   System.out.println("Pilha ímpar vazia."); 
                }              
            } else if (num % 2 == 0){
                System.out.println("Empilhando na pilha par: " + par.push(num));
            } else if (!(num % 2 == 0)) {              
                System.out.println("Empilhando na pilha ímpar: " + impar.push(num)); 
            } else if (par.isEmpty() || impar.isEmpty()) {
                System.out.println("Erro: alguma pilha está vazia.");
            }
        } 
        
        while (!(par.isEmpty())) {
            System.out.println("Elemento par desempilhado: " + par.pop()); 
        }
        while (!(impar.isEmpty())) {
            System.out.println("Elemento ímpar desempilhado: " + impar.pop());
        }
        /*if (par.isEmpty() == false && impar.isEmpty() == false) {
            System.out.println("Todos os números lidos, desempilhando todos: ");
            for (int i=10; i>-1; i--){
                if(!(par.isEmpty()|| impar.isEmpty())){
                    System.out.println("Elemento par desempilhado: " + par.pop());
                    System.out.println("Elemento ímpar desempilhado: " + impar.pop());
                }
            }
        }*/
    }  
}

