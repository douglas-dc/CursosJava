
package com.douglas.aula27.exercicios;

public class Principal {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();
        conta1.numeroConta = 123456789;
        conta1.limiteEspecial = 5000;
        conta1.saldo = 1000;
        conta1.especial = true;
        
        conta1.sacar(2000);
        conta1.consultarSaldo();
        conta1.chequeEspecial();
    }
}
