
package com.douglas.aula29.construtores;

public class Principal {
    public static void main(String[] args) {
        Carro2 van = new Carro2("Fiat", "Ducato", 10, 100, 0.5);
        
        System.out.println(van.capCombustivel);
        System.out.println(van.consumoCombustivel);
        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println(van.numPassageiros);
        
        
        
        
    }
    
}
