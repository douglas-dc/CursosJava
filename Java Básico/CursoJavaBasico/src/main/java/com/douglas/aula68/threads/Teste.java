
package com.douglas.aula68.threads;

public class Teste {

    public static void main(String[] args) {
        MinhaThreadRunnable t1 = new MinhaThreadRunnable("Thread do Douglas", 1000);
        
        MinhaThreadRunnable t2 = new MinhaThreadRunnable("Thread do 2", 500);
        
        MinhaThreadRunnable t3 = new MinhaThreadRunnable("Thread do 3", 1500);
        
        MinhaThreadRunnable t4 = new MinhaThreadRunnable("Thread do 4", 2000);

    }
}
