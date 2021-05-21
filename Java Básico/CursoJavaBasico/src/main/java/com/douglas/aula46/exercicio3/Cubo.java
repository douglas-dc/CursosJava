//
package com.douglas.aula46.exercicio3;

public class Cubo extends Figura3D {
    
    private int aresta;

    public int getAresta() {
        return aresta;
    }

    public void setAresta(int aresta) {
        this.aresta = aresta;
    }

    @Override
    public double calcularArea() {
       return  6 * (Math.pow(aresta, 2));
    }

    @Override
    public double calcularVolume() {
       return Math.pow(aresta, 3);
    }

    @Override
    public String toString() {
        return "Área do cubo: " + this.calcularArea() +
               "\nVolume do cubo: " + this.calcularVolume();
    }
    
}
