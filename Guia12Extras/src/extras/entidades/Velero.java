package extras.entidades;

public class Velero extends Barco {

    private int mastil;

    public Velero() {
    }

    public Velero(int mastil) {
        this.mastil = mastil;
    }

    public Velero(int mastil, String matricula, double eslora, double anhioFabricacion) {
        super(matricula, eslora, anhioFabricacion);
        this.mastil = mastil;
    }

    public int getMastil() {
        return mastil;
    }

    public void setMastil(int mastil) {
        this.mastil = mastil;
    }

    @Override
    public double moduloDeCadaBarco() {
        return this.mastil + super.moduloDeCadaBarco();
    }

    @Override
    public String toString() {

        return super.toString() + ", Velero "+ "mastil " + mastil + '}';
    }

}
