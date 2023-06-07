package extras.entidades;

public class YateLujo extends BarcoMotor {

    private int numeroCamarotes;

    public YateLujo() {
    }

    public YateLujo(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    public YateLujo(int numeroCamarotes, int potenciaCv) {
        super(potenciaCv);
        this.numeroCamarotes = numeroCamarotes;
    }

    public YateLujo(int numeroCamarotes, int potenciaCv, String matricula, double eslora, double anhioFabricacion) {
        super(potenciaCv, matricula, eslora, anhioFabricacion);
        this.numeroCamarotes = numeroCamarotes;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    @Override
    public double moduloDeCadaBarco() {
        return this.numeroCamarotes + super.moduloDeCadaBarco();
    }

    @Override
    public String toString() {

        return super.toString() + " Yate "+" numeroCamarotes " + numeroCamarotes + '}';
    }
}
