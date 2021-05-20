
package com.douglas.aula43.exercicio2;

public class Teste {
    
    public static void main(String[] args) {
   
        PessoaJuridica p1 = new PessoaJuridica("Russo Ltda", 5700);
        
        PessoaFisica p2 = new PessoaFisica();
        p2.setNome("Carleta T.");
        p2.setRendaBruta(3500);
        
        PessoaJuridica p3 = new PessoaJuridica("Quitanda do Zé", 8000);
        
        PessoaJuridica p4 = new PessoaJuridica("Criciuma E.C.", 12000);
        
        PessoaFisica p5 = new PessoaFisica();
        p5.setNome("Roberval M.");
        p5.setRendaBruta(5000);
        
        PessoaFisica p6 = new PessoaFisica();
        p6.setNome("Gisnaldo J.");
        p6.setRendaBruta(1500);
     
        Contribuinte[] contribuintes = new Contribuinte[6];
        contribuintes[0] = p1;
        contribuintes[1] = p2;
        contribuintes[2] = p3;
        contribuintes[3] = p4;
        contribuintes[4] = p5;
        contribuintes[5] = p6;
        
        for (Contribuinte c : contribuintes){
            System.out.println(c.toString()+ "\n");
        }
    }     
}

