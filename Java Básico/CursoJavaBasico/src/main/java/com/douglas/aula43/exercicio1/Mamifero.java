
package com.douglas.aula43.exercicio1;

public class Mamifero extends Animal {

    private String alimento;
    
    public Mamifero() {
        super();
        this.setCor("Castanho");
        this.alimento = "Mel";
        this.setAmbiente("Terra");
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    
    @Override
    public String toString() {
        String s = super.toString();
        s += "\nAlimento: " + alimento;
        return s;
    }
    
}
