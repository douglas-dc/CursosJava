package com.douglas.estruturadados.fila;

public class Aula22 {

    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>();

        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        fila.enfileira(4);
        fila.enfileira(5);

        System.out.println(fila);
        System.out.println("Desenfileirando elemento: " + fila.desenfileira());
        System.out.println(fila);
        System.out.println("Desenfileirando elemento: " + fila.desenfileira());
        System.out.println(fila);
    }
}
