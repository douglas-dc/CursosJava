
package com.douglas.aula52.exercicio01;

import java.util.Scanner;

public class Teste {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int opcao = obterOpcao(scan);
    
    }
    
    public static int obterOpcao(Scanner scan) {
        
        boolean entradaValida = false;
        int opcao = 3;
        
        while (!entradaValida){
            System.out.println("Digite a opção desejada:");
            System.out.println("1: Consultar contato");
            System.out.println("2: Adicionar novo contato");
            System.out.println("3: Sair"); 
            
            try {
                String entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);
           
                if(opcao == 1 || opcao ==2 || opcao == 3){
                    entradaValida = true;
                } else {
                    throw new Exception("Entrada inválida"); 
                }          
            }
            catch (Exception e) {
                System.out.println("Entrada inválida. Digite novamente.");
            }   
        }
        return opcao;
    }
    
}
