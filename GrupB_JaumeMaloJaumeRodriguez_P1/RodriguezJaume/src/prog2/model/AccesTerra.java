package prog2.model;
public abstract class AccesTerra extends Acces {
    private double metresQuadrats;

    public AccesTerra(String nom,double metresQuadrats) {
        this.metresQuadrats=metresQuadrats;
        super(nom);
    }
    public double getMetresQuadrats() {
        return this.metresQuadrats;
    }

}