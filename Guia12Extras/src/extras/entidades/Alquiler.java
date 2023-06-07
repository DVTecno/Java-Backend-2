package extras.entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Alquiler {

    private String nombreCliente;
    private long dniCliente;
    private String fechaAlquiler;
    private LocalDate fechaDevolucion;
    private int posicionAmarre;
    private Barco barco;

    public Alquiler() {
        barco = new Barco();
        this.fechaDevolucion = LocalDate.now();
    }

    public Alquiler(String nombreCliente, long dniCliente, String fechaAlquiler, int posicionAmarre, Barco barco) {
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = LocalDate.now();
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public String getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(String fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public int diasAlquilados() {
        DateTimeFormatter formatoString = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaAlquiler = LocalDate.parse(this.fechaAlquiler, formatoString);

        return (int) ChronoUnit.DAYS.between(fechaAlquiler, this.fechaDevolucion);
    }

    public double precioFinal(Barco barco) {
        return diasAlquilados() * barco.moduloDeCadaBarco();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nombreCliente);
        hash = 97 * hash + (int) (this.dniCliente ^ (this.dniCliente >>> 32));
        hash = 97 * hash + Objects.hashCode(this.fechaAlquiler);
        hash = 97 * hash + Objects.hashCode(this.fechaDevolucion);
        hash = 97 * hash + this.posicionAmarre;
        hash = 97 * hash + Objects.hashCode(this.barco);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alquiler other = (Alquiler) obj;
        if (this.dniCliente != other.dniCliente) {
            return false;
        }
        if (this.posicionAmarre != other.posicionAmarre) {
            return false;
        }
        if (!Objects.equals(this.nombreCliente, other.nombreCliente)) {
            return false;
        }
        if (!Objects.equals(this.fechaAlquiler, other.fechaAlquiler)) {
            return false;
        }
        if (!Objects.equals(this.fechaDevolucion, other.fechaDevolucion)) {
            return false;
        }
        return Objects.equals(this.barco, other.barco);
    }
    

    @Override
    public String toString() {
        return "Alquiler{"
                + "nombreCliente='" + nombreCliente + '\''
                + ", dniCliente=" + dniCliente
                + ", fechaAlquiler='" + fechaAlquiler + '\''
                + ", fechaDevolucion='" + fechaDevolucion + '\''
                + ", posicionAmarre=" + posicionAmarre
                + ", barco=" + barco.getClass().getSimpleName() + " " + barco.toString();
    }

}
