
package com.douglas.aula46.exercicio2;

public class Circulo extends Figura2D {
    
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        double area = 3.14 * (Math.pow(raio, 2));
        return area;
    }
}
