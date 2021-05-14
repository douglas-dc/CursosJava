
package com.douglas.aula33.overload;

public class CalculadoraPrincipal {
    public static void main(String[] args) {
        Calculadora c1 = new Calculadora();
        
        System.out.println(c1.soma(5.0, 5));
        System.out.println(c1.soma(5, 5));
        System.out.println(c1.soma(5, 5));
        System.out.println(c1.soma(5, 2.4));
        
    }
}
