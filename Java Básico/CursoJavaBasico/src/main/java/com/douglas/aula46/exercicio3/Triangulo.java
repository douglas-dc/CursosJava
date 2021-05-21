
package com.douglas.aula46.exercicio3;

public class Triangulo extends Figura2D {
    
    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() { 
        return (this.base * this.altura) / 2;
    }
    
    @Override
    public String toString() {
        return "Área do triângulo: " + this.calcularArea();     
    }
}
