
package com.douglas.estruturadados.fila;

import com.douglas.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

    public Fila() {
    }

    public Fila(int capacidade) {
        super(capacidade);
    }
    
    public void enfileira(T elemento) {
        super.adiciona(elemento);
    }
    
    // 0 1 2 3
    // A B C D  tamanho 4
    // B C D    tamanho 3
    public T desenfileira() {
       
        if (this.estaVazia()){
            return null;
        }
  
        if (this.tamanho < this.elementos.length){
            
        }
        //return this.elementos[0];
    }
    
    public T espiar() {
        
        if (this.estaVazia()){
            return null;
        }
        
        
        return this.elementos[0];
        
    } 
}
