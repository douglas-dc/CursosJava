
package com.douglas.estruturadados.pilha;

import java.util.Stack;

public class Exercicio07decimalparabinario {
    
    public static void main(String[] args) {
       
        imprimeBinario(25);
        imprimeQualquerBase(1000, 16);
        imprimeQualquerBase(241, 16);
        imprimeQualquerBase(500, 8);
    }
    
    public static void imprimeBinario(int numero){
        System.out.println("O número " + numero + " em binário é: " + decimalBinario(numero));
    }
    
    public static void imprimeQualquerBase(int numero, int base){
        System.out.println("O número decimal " + numero + " na base " + base 
                + " é " + decimalQualquerBase(numero, base));
    }
   
     public static String decimalQualquerBase(int numero, int base){
    
        Stack<Integer> pilha = new Stack();
        
        int resto;
        String numeroBase = "";
        String bases = "0123456789ABCDEF";
        
        while (numero > 0) {
            resto = numero % base;
            pilha.push(resto);
            numero /= base;
        }
        
        while (!pilha.isEmpty()) {
            numeroBase += bases.charAt(pilha.pop());
        }
        
        return numeroBase;
    }
    
    public static String decimalBinario(int numero){
    
        Stack<Integer> pilha = new Stack();
        
        int resto;
        
        while (numero > 0) {
            resto = numero % 2;
            pilha.push(resto);
            numero /= 2;
        }
        
        String numerobinario = "";
        
        while (!pilha.isEmpty()) {
            numerobinario += pilha.pop();
        }
        
        return numerobinario;
    }
    
    
}
