package guia12.entidades;

public class Gato extends Animal {

    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        super.alimentarse();
        System.out.println("Hola soy un gato y me alimento con croquetas!");
    }
    

}
