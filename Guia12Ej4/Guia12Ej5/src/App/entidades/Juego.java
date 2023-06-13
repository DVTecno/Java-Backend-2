package App.entidades;
public class Juego {

    private int numeroAdinar;
    private int numerojugador;
    private int countIntento;
    private boolean encontrado;

    public Juego() {
        this.countIntento=0;
        this.encontrado = false;
    }

    public Juego(int numerojugador) {
        this.numerojugador = numerojugador;
        this.countIntento = 0;
        this.encontrado = false;
    }

    public boolean isEncontrado() {
        return encontrado;
    }

    public void setEncontrado(boolean encontrado) {
        this.encontrado = encontrado;
    }


    public int getNumeroAdinar() {
        return numeroAdinar;
    }

    public void setNumeroAdinar(int numeroAdinar) {
        this.numeroAdinar = numeroAdinar;
    }

    public int getNumerojugador() {
        return numerojugador;
    }

    public void setNumerojugador(int numerojugador) {
        this.numerojugador = numerojugador;
    }

    public int getCountIntento() {
        return countIntento;
    }

    public void setCountIntento(int countIntento) {
        this.countIntento = countIntento;
    }

    @Override
    public String toString() {
        return "Juego{" + "numeroAdinar=" 
                + numeroAdinar + ", numerojugador="
                + numerojugador + ", countIntento=" 
                + countIntento + ", encontrado="
                + encontrado + '}';
    }
}
