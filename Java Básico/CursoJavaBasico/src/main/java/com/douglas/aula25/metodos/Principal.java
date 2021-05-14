
package com.douglas.aula25.metodos;

public class Principal {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "volkswagen";
        van.modelo = "kombi";
        van.numPassageiros = 7;
        van.capCombustivel = 45;
        van.consumoCombustivel = 10.4;
        
        System.out.println(van.marca);
        System.out.println(van.modelo);
        
        van.exibirAutonomia();
        
        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia do carro em km é: " + autonomia);
        System.out.println("A autonomia do carro em km é: " + van.obterAutonomia());
        
        double qtdCombustivel100 = van.calcularCombustivel(100);
        System.out.println("Para percorrer 100km precisamos de " + qtdCombustivel100 + " litros de gasolina.");
        
        
    }
    
}
