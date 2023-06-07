package guia12;

import guia12.entidades.Electrodomestico;
import guia12.entidades.Lavadora;
import guia12.entidades.Televisor;
import java.util.ArrayList;
import java.util.List;

public class Ej3 {

    public static void main(String[] args) {
        Lavadora lavarropa1 = new Lavadora();
        Lavadora lavarropa2 = new Lavadora();
        Televisor tv1 = new Televisor();
        Televisor tv2 = new Televisor();
        lavarropa1.crearLavadora();
        lavarropa2.crearLavadora();
        tv1.crearTelevisor();
        tv2.crearTelevisor();
        List<Electrodomestico> electrodomesticos = new ArrayList<>();
        lavarropa1.precioFinal();
        lavarropa2.precioFinal();
        electrodomesticos.add(tv1);
        electrodomesticos.add(tv2);
        electrodomesticos.add(lavarropa1);
        electrodomesticos.add(lavarropa2);
        //electrodomesticos.stream().forEach((producto)-> System.out.println("Precio de los productos: "+producto.precioFinal()));
        double precioTotal = 0.0, precioTvs = 0.0, precioLavadoras = 0.0;
        for (Electrodomestico electrodomestico : electrodomesticos) {
            precioTotal+= electrodomestico.precioFinal();
            if (electrodomestico instanceof Televisor) {
                precioTvs+=electrodomestico.precioFinal();   
            }else if (electrodomestico instanceof Lavadora) {
                precioLavadoras+=electrodomestico.precioFinal();   
            }
        }
        System.out.println("Precio total de los electrodomesticos: "+precioTotal);
        System.out.println("Precio total de los Televisores: "+precioTvs);
        System.out.println("Precio total de los lavadoras: "+precioLavadoras);

//        double precioTotal = electrodomesticos.stream().mapToDouble(Electrodomestico::precioFinal).sum();
//        double precioTelevisores = electrodomesticos.stream()
//                .filter(e -> e instanceof Televisor)
//                .mapToDouble(Electrodomestico::precioFinal)
//                .sum();
//        System.out.println("Precio total de los electrodomésticos: " + precioTotal);
//        System.out.println("Precio total de los televisores: " + precioTelevisores);
//        System.out.println("Precio total de las lavadoras: " + precioLavadoras);
    }
}
