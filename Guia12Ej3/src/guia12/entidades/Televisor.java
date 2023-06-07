package guia12.entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico {

    private double pulgadas;
    private boolean sintonizadorTDT;

    public Televisor() {
        this.sintonizadorTDT = false;
    }

    public Televisor(double pulgadas, boolean sintonizadorTDT) {
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor(double pulgadas, boolean sintonizadorTDT, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void crearTelevisor() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        crearElectrodomestico();
        System.out.print("Ingresa la pulgada del tv: ");
        this.pulgadas = leer.nextDouble();
        System.out.println("Tiene un sintonizador TDT incorporado?, SI/NO: ");
        sintonizadorTDT = !leer.next().equalsIgnoreCase("NO");
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();

        if (pulgadas > 40) {
            precioFinal *= 1.30;
        }
        if (sintonizadorTDT) {
            precioFinal += 500;
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        super.toString();
        double precio = precioFinal();
        return "Televisor{"
                + "Precio $" + precio
                + ", Color '" + color + '\''
                + ", ConsumoEnergetico " + consumoEnergetico
                + ", Peso " + peso
                + ", Pulgadas " + pulgadas
                + ", Sintonizador TDT " + sintonizadorTDT
                + '}';
    }

}
