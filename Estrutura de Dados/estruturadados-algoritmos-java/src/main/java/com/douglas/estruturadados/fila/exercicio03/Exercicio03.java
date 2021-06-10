
package com.douglas.estruturadados.fila.exercicio03;

import java.util.PriorityQueue;
import java.util.Queue;

public class Exercicio03 {
 
    public static void main(String[] args) {
        
        Queue<Integer> fila = new PriorityQueue<>();
        
        Pessoa p1 = new Pessoa("Pedro", Senha.VERMELHO); //1
        Pessoa p2 = new Pessoa("Ana", Senha.VERDE); //5
        Pessoa p3 = new Pessoa("Carla", Senha.AMARELO);//4
        Pessoa p4 = new Pessoa("Maria", Senha.VERMELHO); //2
        Pessoa p5 = new Pessoa("João", Senha.VERDE);//6
        Pessoa p6 = new Pessoa("João", Senha.VERMELHO);//3
        
        Pessoa[] pessoas = new Pessoa[6];
        pessoas[0] = p1;
        pessoas[1] = p2;
        pessoas[2] = p3;
        pessoas[3] = p4;
        pessoas[4] = p5;
        pessoas[5] = p6;

        fila.add(p1.getTipoSenha().getValorPrioridade());
        fila.add(p2.getTipoSenha().getValorPrioridade());
        fila.add(p3.getTipoSenha().getValorPrioridade());
        fila.add(p4.getTipoSenha().getValorPrioridade());
        fila.add(p5.getTipoSenha().getValorPrioridade());
        fila.add(p6.getTipoSenha().getValorPrioridade());
        
        
        System.out.println(fila);
    }
    
   
}
