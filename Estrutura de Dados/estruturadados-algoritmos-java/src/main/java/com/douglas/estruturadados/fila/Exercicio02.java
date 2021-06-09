package com.douglas.estruturadados.fila;

import java.util.PriorityQueue;
import java.util.Queue;

public class Exercicio02 {

    public static void main(String[] args) {

        Queue<String> filaRegular = new PriorityQueue<>();
        Queue<String> filaPrioridade = new PriorityQueue<>((s1, s2)
                -> Long.valueOf(s1.split(" ")[1]).compareTo(Long.valueOf(s2.split(" ")[1])));

        final int MAX_PRIORIDADE = 3;

        filaRegular.add("Pessoa 1");
        filaRegular.add("Pessoa 2");
        filaPrioridade.add("Pessoa 1");
        filaPrioridade.add("Pessoa 2");
        filaPrioridade.add("Pessoa 3");
        filaPrioridade.add("Pessoa 4");
        filaPrioridade.add("Pessoa 5");
        filaRegular.add("Pessoa 3");
        filaRegular.add("Pessoa 4");
        filaPrioridade.add("Pessoa 6");
        filaPrioridade.add("Pessoa 7");
        filaRegular.add("Pessoa 5");
        filaRegular.add("Pessoa 6");
        filaRegular.add("Pessoa 7");
        filaRegular.add("Pessoa 8");
        filaRegular.add("Pessoa 9");
        filaPrioridade.add("Pessoa 8");
        filaPrioridade.add("Pessoa 9");
        filaPrioridade.add("Pessoa 10");
        filaPrioridade.add("Pessoa 11");
        filaRegular.add("Pessoa 1");
        filaRegular.add("Pessoa 11");
        filaRegular.add("Pessoa 12");
        filaPrioridade.add("Pessoa 12");
        filaPrioridade.add("Pessoa 13");

        while (!(filaRegular.isEmpty() || filaPrioridade.isEmpty())) {
            while (!filaPrioridade.isEmpty()) {
                for (int i = 0; i < MAX_PRIORIDADE && !filaPrioridade.isEmpty(); i++) {
                    System.out.println("Removendo da fila prioridade: " + filaPrioridade.remove());
                }
                System.out.println("Removendo da fila regular: " + filaRegular.remove());
            }
            while (!filaRegular.isEmpty() && filaPrioridade.isEmpty()) {
                System.out.println("Removendo da fila regular: " + filaRegular.remove());
            }
        }
    }
}
