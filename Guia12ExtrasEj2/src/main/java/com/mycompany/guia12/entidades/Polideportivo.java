package com.mycompany.guia12.entidades;

public class Polideportivo extends Edificio {
    private String nombre;
    private boolean techadoAbierto;

    public Polideportivo() {
    }


    public Polideportivo(String nombre, boolean techadoAbierto, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techadoAbierto = techadoAbierto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechadoAbierto() {
        return techadoAbierto;
    }

    public void setTechadoAbierto(boolean techadoAbierto) {
        this.techadoAbierto = techadoAbierto;
    }
    

    @Override
    public double calcularSuperficie() {
        return  2 * (super.ancho * super.largo + super.ancho * super.alto + super.largo * super.alto);
    }

    @Override
    public double calcularVolumen() {
        return super.ancho*super.largo*super.alto;
    }

    @Override
    public String toString() {
        return super.toString() + " Polideportivo{" + "nombre=" + nombre + ", techadoAbierto=" + techadoAbierto + '}';
    }   
}
