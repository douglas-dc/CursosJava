
package com.douglas.estruturadados.fila;

public enum Senha {
   
    VERDE(3),
    VERMELHO(1),
    AMARELO(2);
    
    private final int valorPrioridade;

    private Senha(int valorPrioridade) {
        this.valorPrioridade = valorPrioridade;
    }

    public int getValorPrioridade() {
        return valorPrioridade;
    }
    
}
