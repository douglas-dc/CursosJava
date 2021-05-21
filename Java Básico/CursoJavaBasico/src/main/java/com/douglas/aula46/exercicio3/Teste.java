
package com.douglas.aula46.exercicio3;

public class Teste {
    
    public static void main(String[] args) {
        Cilindro  cilindro = new Cilindro();
        cilindro.setNome("Cilindro");
        cilindro.setAltura(10);
        cilindro.setRaio(6);
        
        Circulo circulo = new Circulo();
        circulo.setRaio(8);
        circulo.setNome("Círculo");
        
        Cubo cubo = new Cubo();
        cubo.setAresta(4);
        cubo.setNome("Cubo");

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(8);
        quadrado.setNome("Quadrado");
        
        Piramide piramide = new Piramide();
        piramide.setAltura(10);
        piramide.setApotema(2);
        piramide.setArestaBase(3);
        piramide.setBase(quadrado);
        piramide.setNome("Pirâmide");
        
        Triangulo triangulo = new Triangulo();
        triangulo.setAltura(10);
        triangulo.setBase(5);
        triangulo.setNome("Triângulo");

        FiguraGeometrica[] figuras = new FiguraGeometrica[6];
        figuras[0] = cilindro;
        figuras[1] = circulo;
        figuras[2] = cubo;
        figuras[3] = quadrado;
        figuras[4] = triangulo;
        figuras[5] = piramide;
     
        for (FiguraGeometrica figura : figuras){
            System.out.println(figura.getNome());
            if (figura instanceof Figura2D){
                Figura2D  f2d = (Figura2D) figura;
                System.out.println("Área: " + f2d.calcularArea() + "\n");
            }
            if (figura instanceof Figura3D){
                Figura3D  f3d = (Figura3D) figura;
                System.out.println("Área: " + f3d.calcularArea());
                System.out.println("Volume: " + f3d.calcularVolume() + "\n");
            }
        }
    }
}