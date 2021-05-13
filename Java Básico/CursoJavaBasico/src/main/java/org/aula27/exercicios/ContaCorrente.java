
package org.aula27.exercicios;

public class ContaCorrente {
    int numeroConta;
    double saldo;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;
    
    boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
            return true;
        } else if (especial) {
            double limite = limiteEspecial - saldo; 
            if (limite >= valor) {
                saldo -= valor;
                System.out.println("Saque realizado com sucesso.");
                return true;
            } else {
                return false;
            } 
        } else {
            System.out.println("Saldo insuficiente para realizar operação.");
            return false;
        }
    }
    
    void depositar(double valor) {
        saldo += valor; 
        System.out.println("Depósito realizado com sucesso.");
    }
    
    void consultarSaldo() {
        System.out.println("O seu saldo é de: " + saldo + " reais.");
    }
    
    boolean chequeEspecial() {
        if (saldo < 0) {
            System.out.println("O cliente está utilizando o cheque especial");
            return true;
        } else {
            System.out.println("O cliente não está utilizando o cheque especial");
            return false;
        }
    }
}
