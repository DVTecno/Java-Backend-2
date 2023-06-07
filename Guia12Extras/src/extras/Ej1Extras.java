package extras;

import extras.entidades.Alquiler;
import extras.entidades.BarcoMotor;
import extras.entidades.Velero;
import extras.entidades.YateLujo;
import java.util.HashMap;

public class Ej1Extras {

    public static void main(String[] args) {

        BarcoMotor lancha = new BarcoMotor(150, "ABC123", 8.2, 2015);
        YateLujo yate = new YateLujo(4, 350, "DEF456", 15.0, 2010);
        Velero velero = new Velero(2, "GHI789", 10, 2008);

        Alquiler alquiler1 = new Alquiler("Juan Pérez", 123456789, "01/06/2023", 0, lancha);
        Alquiler alquiler2 = new Alquiler("María Gómez", 987654321, "02/06/2023", 0, yate);
        Alquiler alquiler3 = new Alquiler("Carlos Rodríguez", 543216789, "27/05/2023", 0, velero);
        HashMap<String, Alquiler> amarres = new HashMap();

        //aca defino el contador que se incrementa automaticamente
        int contadorAmarre = 1;

        amarres.put("Amarre " + contadorAmarre, alquiler1);
        alquiler1.setPosicionAmarre(contadorAmarre);
        contadorAmarre++;

        amarres.put("Amarre " + contadorAmarre, alquiler2);
        alquiler2.setPosicionAmarre(contadorAmarre);
        contadorAmarre++;

        amarres.put("Amarre " + contadorAmarre, alquiler3);
        alquiler3.setPosicionAmarre(contadorAmarre);
        contadorAmarre++;
        System.out.println("--------------------------------------------------------------------------------");
        amarres.forEach((amarre, alquiler) -> {
            System.out.println("Amarre: " + amarre);
            System.out.println("Barco: " + alquiler.getBarco());
            System.out.println("Amarre posición: " + alquiler.getPosicionAmarre());
            System.out.println("Precio del alquiler: " + alquiler.precioFinal(alquiler.getBarco()));
            System.out.println();
        System.out.println("--------------------------------------------------------------------------------");
        });
    }
}
