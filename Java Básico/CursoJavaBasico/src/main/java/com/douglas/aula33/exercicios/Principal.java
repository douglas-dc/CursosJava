
package com.douglas.aula33.exercicios;

public class Principal {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(123456789, 2000, true, 3500);

        c1.consultarSaldo();
        c1.sacar(2300);
        c1.consultarSaldo();
        c1.depositar(500);
        c1.consultarSaldo();
        c1.chequeEspecial();
    }
}
