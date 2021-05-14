
package com.douglas.aula33.overload;

public class Calculadora {
    
    int soma(int num1, int num2) {
        return num1 + num2;
    }
    
    double soma(double num1, int num2) {
        return num1 + num2;
    }
    
    double soma(double num1, double num2) {
        return num1 + num2;
    }
    
}
