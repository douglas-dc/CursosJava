
package com.douglas.estruturadados.fila;

import com.douglas.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }
    
    public void enfileira(T elemento) {
        this.adiciona(elemento);
    }
    
    // 0 1 2 3
    // A B C D  tamanho 4
    // B C D    tamanho 3
    public T desenfileira() {
        
        final int POS = 0;
       
        if (this.estaVazia()){
            return null;
        }
  
        T elementoAserRemovido = this.elementos[POS];
        
        this.remove(POS);
         
        return elementoAserRemovido;
    }
    
    public T espiar() {
        
        if (this.estaVazia()){
            return null;
        }
 
        return this.elementos[0]; 
    } 
}
