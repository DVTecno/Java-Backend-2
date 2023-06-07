package guia12;
import guia12.entidades.Lavadora;
import guia12.entidades.Televisor;
public class Ej2 {
    public static void main(String[] args) {
       Lavadora lavarropa = new Lavadora();
       Televisor tv = new Televisor();
       
       lavarropa.crearLavadora();
       lavarropa.precioFinal();
        System.out.println(lavarropa);
        System.out.println("=============================");
       tv.crearTelevisor();
       tv.precioFinal();
        System.out.println(tv);
        System.out.println("=============================");
    }
}
