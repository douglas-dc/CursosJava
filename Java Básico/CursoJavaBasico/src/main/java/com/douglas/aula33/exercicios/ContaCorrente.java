
package com.douglas.aula33.exercicios;

public class ContaCorrente {
    
    private int numeroConta;
    private double saldo;
    private boolean especial;
    private double limiteEspecial;
    
    public ContaCorrente(int numeroConta, double saldo, boolean especial, double limiteEspecial) {
        this.numeroConta = numeroConta;
        this.especial = especial;
        this.limiteEspecial = limiteEspecial;
        this.saldo = saldo;   
    }
    
    ContaCorrente() {
        
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }
    
    public boolean sacar(double valor) {
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
            }
        } 
        System.out.println("Saldo insuficiente para realizar operação.");
        return false;
    }
    
    
    public void depositar(double valor) {
        saldo += valor; 
        System.out.println("Depósito realizado com sucesso.");
    }
    
    public void consultarSaldo() {
        System.out.println("O seu saldo é de: " + saldo + " reais.");
    }
    
    public boolean chequeEspecial() {
        if (saldo < 0) {
            System.out.println("O cliente está utilizando o cheque especial");
            return true;
        } else {
            System.out.println("O cliente não está utilizando o cheque especial");
            return false;
        }
    }
    
   
    
}
