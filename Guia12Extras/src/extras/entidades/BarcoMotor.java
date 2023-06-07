package extras.entidades;

public class BarcoMotor extends Barco {

    private int potenciaCv;

    public BarcoMotor() {
    }

    public BarcoMotor(int potenciaCv) {
        this.potenciaCv = potenciaCv;
    }

    public BarcoMotor(int potenciaCv, String matricula, double eslora, double anhioFabricacion) {
        super(matricula, eslora, anhioFabricacion);
        this.potenciaCv = potenciaCv;
    }

    public int getPotenciaCv() {
        return potenciaCv;
    }

    public void setPotenciaCv(int potenciaCv) {
        this.potenciaCv = potenciaCv;
    }

    @Override
    public double moduloDeCadaBarco() {
        return this.potenciaCv + super.moduloDeCadaBarco();
    }

    @Override
    public String toString() {

        return super.toString() + ", Lancha " + "potenciaCv=" + potenciaCv + '}';

    }

}
