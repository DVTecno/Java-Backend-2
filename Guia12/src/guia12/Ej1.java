package guia12;

import guia12.entidades.Animal;
import guia12.entidades.Caballo;
import guia12.entidades.Gato;
import guia12.entidades.Perro;
import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Animal perruno = new Perro("Chiquito", "carnivoro", 5, "doberman");
        Animal gatuno = new Gato("tom", "carnivoro", 4, "callejero");
        Animal semental = new Caballo("Spart", "vegetareano", 8, "bayo");

        perruno.alimentarse();
        gatuno.alimentarse();
        semental.alimentarse();

    }

}
