package com.mycompany.guia12;

import com.mycompany.guia12.entidades.Edificio;
import com.mycompany.guia12.entidades.EdificioDeOficinas;
import com.mycompany.guia12.entidades.Polideportivo;
import java.util.ArrayList;
import java.util.List;

public class Guia12ExtrasEj2 {

    public static void main(String[] args) {
        List<Edificio> complejo = new ArrayList();
        Polideportivo poli1 = new Polideportivo("ECD 5", true, 10d, 5.0d, 20d);
        complejo.add(poli1);
        Polideportivo poli2 = new Polideportivo("CEF 1", false, 20d, 5.5d, 40d);
        complejo.add(poli2);
        EdificioDeOficinas edificio1 = new EdificioDeOficinas(40, 60, 5, 20d, 30d, 40d);
        complejo.add(edificio1);
        EdificioDeOficinas edificio2 = new EdificioDeOficinas(70, 80, 10, 30d, 60d, 50d);
        complejo.add(edificio2);
        System.out.println("----------------------------------------------------------------");
        int cont = 1;
        for (Edificio edificio : complejo) {
            if (edificio instanceof Polideportivo) {
                System.out.println("------------------------------------------------");
                System.out.println("Polideportivo " + ((Polideportivo) edificio).getNombre());
                System.out.println(edificio.calcularSuperficie());
                System.out.println(edificio.calcularVolumen());
                if (((Polideportivo) edificio).isTechadoAbierto()) {
                    System.out.println("El polideportivo es techado");
                } else {
                    System.out.println("El polideportivo no es techado");
                }
                System.out.println("------------------------------------------------");
            }
            if (edificio instanceof EdificioDeOficinas) {
                System.out.println("------------------------------------------------");
                System.out.println("Edificio de Oficina " + cont);
                System.out.println(edificio.calcularSuperficie());
                System.out.println(edificio.calcularVolumen());
                ((EdificioDeOficinas) edificio).cantPersonas();
                System.out.println("------------------------------------------------");
                cont++;
            }

        }

    }
}
