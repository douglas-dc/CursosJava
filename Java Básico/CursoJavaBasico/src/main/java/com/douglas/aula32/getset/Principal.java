
package com.douglas.aula32.getset;

public class Principal {
    public static void main(String[] args) {
        Carro4 caminhao = new Carro4();
        
        caminhao.setMarca("Mercedes");
        caminhao.setModelo("Actros");
        System.out.println(caminhao.getMarca());
        System.out.println(caminhao.getModelo());
    }
}
