package prog2.model;
public abstract class AccesAsfalt extends Acces{
    private double amplada;
    public AccesAsfalt(String nom, double amplada_){
        this.amplada =amplada_;
        super(nom);
    }

    public double getAmplada() {
        return this.amplada;
    }
    public void setAmplada(double amplada) {
        this.amplada = amplada;
    }

}