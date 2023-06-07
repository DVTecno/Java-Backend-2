package com.mycompany.guia12.entidades;

public class EdificioDeOficinas extends Edificio {

    private int numeroDeOfina;
    private int cantidadDePersonasPorOfina;
    private int numeroDePisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numeroDeOfina, int cantidadDePersonasPorOfina, int numeroDePisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numeroDeOfina = numeroDeOfina;
        this.cantidadDePersonasPorOfina = cantidadDePersonasPorOfina;
        this.numeroDePisos = numeroDePisos;
    }

    public int getNumeroDeOfina() {
        return numeroDeOfina;
    }

    public void setNumeroDeOfina(int numeroDeOfina) {
        this.numeroDeOfina = numeroDeOfina;
    }

    public int getCantidadDePersonasPorOfina() {
        return cantidadDePersonasPorOfina;
    }

    public void setCantidadDePersonasPorOfina(int cantidadDePersonasPorOfina) {
        this.cantidadDePersonasPorOfina = cantidadDePersonasPorOfina;
    }

    public int getNumeroDePisos() {
        return numeroDePisos;
    }

    public void setNumeroDePisos(int numeroDePisos) {
        this.numeroDePisos = numeroDePisos;
    }

    @Override
    public double calcularSuperficie() {
        return 2 * (super.ancho * super.largo + super.ancho * super.alto + super.largo * super.alto);
    }

    @Override
    public double calcularVolumen() {
        return super.ancho * super.largo * super.alto;
    }

    public void cantPersonas() {
        System.out.println("Personas por piso: " + this.cantidadDePersonasPorOfina * this.numeroDeOfina);
        System.out.println("Personas en todo el edificio: " + (this.cantidadDePersonasPorOfina * this.numeroDeOfina) * this.numeroDePisos);
    }

    @Override
    public String toString() {
        return super.toString() + " EdificioDeOficinas{" + "numeroDeOfina=" + numeroDeOfina + ", cantidadDePersonasPorOfina=" + cantidadDePersonasPorOfina + ", numeroDePisos=" + numeroDePisos + '}';
    }

}
