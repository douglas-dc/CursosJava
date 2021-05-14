
package com.douglas.aula30.construtorthis;

public class Carro3 {
    
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    public Carro3(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Construtor com 3 parâmetros");
    }

    public Carro3(String marca, String modelo) {
        this(marca, modelo, 8); 
        System.out.println("Construtor com 2 parâmetros");
    }
    
    
    
}
