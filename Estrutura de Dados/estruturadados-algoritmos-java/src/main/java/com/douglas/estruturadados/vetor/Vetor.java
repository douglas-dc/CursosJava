
package com.douglas.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {
    
    private String[] elementos;
    private int tamanho;
    
    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }
    
    /*public void adiciona(String elemento){
        for (int i=0; i<this.elementos.length; i++){
            if (this.elementos[i] == null){
                this.elementos[i] = elemento;
                break; //utilizado para frear o loop
            }
        }
    }*/
    
    /*public void adiciona(String elemento) throws Exception{
        
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception ("Vetor cheio, não é possível adicionar mais elementos!");
        }
    }*/
    
    public boolean adiciona(String elemento) {
        
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean adiciona(int posicao, String elemento){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        
        //mover todos os elementos
        for (int i=tamanho-1; i>=posicao; i--){
            elementos[i+1] = elementos[i];
        }
        
        this.elementos[posicao] = elemento;
        this.tamanho++; 
        
        return false;
    }
    
    public int tamanho() {
        return this.tamanho;
    }

    public String busca(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }
    
    public int busca(String elemento){
        for(int i=0; i<tamanho; i++){
            if (this.elementos[i].equals(elemento)){
                    return i;
            }
        }
        return -1;
    }
    
    
    @Override
    public String toString() {
        
        StringBuilder s = new StringBuilder();
        s.append("[");
        
        for (int i=0; i<this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }
        
        if (this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }
        
        s.append("]");
        
        return s.toString();
    }
    
}
