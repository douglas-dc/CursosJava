
package com.douglas.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {
    
    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<String>();
        
        arrayList.add("A");
        arrayList.add("C");
        
        System.out.println(arrayList);
        
        arrayList.add(1, "B"); //adiciona por posição e elemento
        
        System.out.println(arrayList);
        
        boolean existe = arrayList.contains("A"); //verificando se contém elemento
        
        if (existe){
            System.out.println("Elemento existe no vetor");
        } else {
            System.out.println("Elemento não existe no vetor");
        }
        
        int pos = arrayList.indexOf("D"); //busca por elemento
        if (pos > -1){
             System.out.println("Elemento existe no vetor na posição " + pos);
        } else {
            System.out.println("Elemento não existe no vetor " + pos);
        }
                
        System.out.println(arrayList.get(2)); //busca por posição
        
        arrayList.remove(1); //remover por índice
        arrayList.remove("C"); //remover por elemento
        
        System.out.println(arrayList);
        
        System.out.println(arrayList.size()); //tamanho
        
        
        
    }
}
