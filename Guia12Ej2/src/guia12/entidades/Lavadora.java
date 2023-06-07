package guia12.entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    private double carga;

    public Lavadora() {
    }

    public Lavadora(double carga) {
        this.carga = carga;
    }

    public Lavadora(double carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }
  

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        crearElectrodomestico();
        System.out.print("Ingrese la carga de la lavadora: ");
        this.carga = leer.nextDouble();
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        return carga > 30 ? precioFinal += 500 : precioFinal; // use el ternario para devolver el precio final, si supera los 30 kilos se le suma 500 si es <= 30 solo se retornal precio sin icrenmentar su valor
    }

    @Override
    public String toString() {
         double precio = precioFinal();
        super.toString();
        return "Lavadora{"
                + "Precio $" + precio
                + ", Color '" + color + '\''
                + ", ConsumoEnergetico " + consumoEnergetico
                + ", Peso " + peso
                + ", Carga " + carga
                + '}';
    }
    

}
