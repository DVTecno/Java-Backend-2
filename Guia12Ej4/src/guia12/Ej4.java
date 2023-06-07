package guia12;

import guia12.entidades.Circulo;
import guia12.entidades.Rectangulo;

public class Ej4 {

    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(8, 6);
        System.out.println("Circulo = " + circulo.calcularArea());
        System.out.println("Circulo = " + circulo.calcularPerimetro());
        System.out.println("rectangulo = " + rectangulo.calcularArea());
        System.out.println("rectangulo = " + rectangulo.calcularPerimetro());
    }
}
