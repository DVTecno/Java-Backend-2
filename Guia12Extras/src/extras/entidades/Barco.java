package extras.entidades;

public class Barco {

    private String matricula;

    private double eslora;

    private double anhioFabricacion;

    public Barco() {
    }

    public Barco(String matricula, double eslora, double anhioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anhioFabricacion = anhioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public double getAnhioFabricacion() {
        return anhioFabricacion;
    }

    public void setAnhioFabricacion(double anhioFabricacion) {
        this.anhioFabricacion = anhioFabricacion;
    }

    public double moduloDeCadaBarco() {
        return this.eslora * 10;
    }

    @Override
    public String toString() {
        return "Barco{"
                + "matricula='" + matricula + '\''
                + ", eslora=" + eslora
                + ", anhioFabricacion=" + anhioFabricacion;
    }

}
