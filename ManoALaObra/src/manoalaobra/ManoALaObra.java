package manoalaobra;

import manoalaobra.entidades.Dni;
import manoalaobra.entidades.Persona;

public class ManoALaObra {

    public static void main(String[] args) {
        Persona persona = new Persona("Julio", "Vargas", new Dni('D', 22766717));
        System.out.println("La serie del dni de: " + persona.getNombre() + " es: " + persona.getDni().getSerie()+" numero: "+persona.getDni().getNumero());

    }

}
