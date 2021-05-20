
package com.douglas.aula43.exercicio2;

public class PessoaJuridica extends Contribuinte{

    @Override
    public double calcularImposto() {
        
        return this.getRendaBruta() * 0.1;
    }
    
    public PessoaJuridica(){
        
    }
    
    public PessoaJuridica(String nome, double rendaBruta) {
        super();
        super.setNome(nome);
        super.setRendaBruta(rendaBruta);   
    }

    @Override
    public String toString() {
        return super.toString() + "\nImposto a ser pago: R$" + calcularImposto();
    }
 
}
