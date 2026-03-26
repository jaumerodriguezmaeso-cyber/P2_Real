package prog2.model;
public abstract class AccesTerra extends Acces {
    private double metresQuadrats;

    public AccesTerra(String nom,double metresQuadrats,boolean estat) {
        this.metresQuadrats=metresQuadrats;
        super(nom,estat);
    }
    public double getMetresQuadrats() {
        return this.metresQuadrats;
    }

}