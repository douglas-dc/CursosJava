
package com.douglas.testeenum;

public class Teste {
   
    public static void main(String[] args) {
        
        DiaSemana dia = Enum.valueOf(DiaSemana.class, "SEXTA");

        System.out.println(dia);
        
        DiaSemana dia2 = DiaSemana.valueOf("SABADO");
        
        System.out.println(dia2);
        
        DiaSemana dia3 = DiaSemana.QUARTA;
        
        System.out.println(dia.getValor()); // pega o valor atribuído
                
    }
}
