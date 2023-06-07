package guia12.entidades;

import java.util.Scanner;

public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
        this.precio = 1000;
        this.color = "BLANCO";
        this.peso = 0.0;
        this.consumoEnergetico = 'F';
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(char letra) {
        if (letra >= 'A' && letra <= 'F') {
            consumoEnergetico = letra;
        } else {
            consumoEnergetico = 'F';
        }
    }

    public void comprobarColor(String color) {
        color = color.toUpperCase();
        switch (color) {
            case "NEGRO":
            case "AZUL":
            case "ROJO":
            case "GRIS":
                this.color = color;
                break;
            default:
                this.color = "BLANCO";
        }
    }

    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Color del Producto: ");
        String colorAux = leer.next();
        comprobarColor(colorAux);
        System.out.print("Consumo energetico: [A a F] ");
        //char consumoEnergeticoAux;
        comprobarConsumoEnergetico(leer.next().toUpperCase().charAt(0));
        System.out.print("Peso del Producto: ");
        this.peso = leer.nextDouble();
        //consumoEnergeticoAux = leer.next().toUpperCase().charAt(0);
        //comprobarConsumoEnergetico(consumoEnergeticoAux);
    }

//    public double precioFinal() {
//        double precioFinal = this.precio;
//        
//        switch (consumoEnergetico) {
//            case 'A' -> precioFinal += 1000;
//            case 'B' -> precioFinal += 800;
//            case 'C' -> precioFinal += 600;
//            case 'D' -> precioFinal += 500;
//            case 'E' -> precioFinal += 300;
//            case 'F' -> precioFinal += 100;
//        }
//        if (peso >= 1 && peso <= 19) {
//            precioFinal += 100;
//        } else if (peso >= 20 && peso <= 49) {
//            precioFinal += 500;
//        } else if (peso >= 50 && peso <= 79) {
//            precioFinal += 800;
//        } else if (peso >= 80) {
//            precioFinal += 1000;
//        }
//
//        return precioFinal;
//    }
    public double precioFinal() {
        double precioFinal = this.precio;
        precioFinal += (consumoEnergetico == 'A') ? 1000
                : (consumoEnergetico == 'B') ? 800
                        : (consumoEnergetico == 'C') ? 600
                                : (consumoEnergetico == 'D') ? 500
                                        : (consumoEnergetico == 'E') ? 300
                                                : (consumoEnergetico == 'F') ? 100
                                                        : 0;
        precioFinal += (peso >= 1 && peso <= 19) ? 100 : (peso >= 20 && peso <= 49) ? 500 : (peso >= 50 && peso <= 79) ? 800 : (peso >= 80) ? 1000 : 0;
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
}
