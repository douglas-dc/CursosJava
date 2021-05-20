
package com.douglas.aula43.exercicio1;

public class TesteZoologico {
    
    public static void main(String[] args) {
        
        Animal camelo = new Animal();
        camelo.setNome("Camelo");
        camelo.setComprimento(150);
        camelo.setPatas(4);
        camelo.setCor("Amarelo");
        camelo.setAmbiente("Terra");
        camelo.setVelocidade(2.0);
        
        Peixe tubarao = new Peixe();
        tubarao.setComprimento(300);
        tubarao.setNome("Tubarão");
        tubarao.setPatas(0);
        tubarao.setVelocidade(1.5);
        
        Mamifero urso = new Mamifero();
        urso.setNome("Urso-do-canadá");
        urso.setComprimento(180);
        urso.setCor("Vermelho");
        urso.setVelocidade(0.5);
        
        Animal[] animais = new Animal[3];
        animais[0] = camelo;
        animais[1] = tubarao;
        animais[2] = urso;
        
        System.out.println("------------");
        for (Animal animal : animais) {
            System.out.println(animal);
            System.out.println("------------");
        }
        
       
        
        
    }
}
