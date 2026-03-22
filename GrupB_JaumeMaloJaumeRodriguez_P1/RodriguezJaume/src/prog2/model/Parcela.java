package prog2.model;

public class Parcela extends Allotjament {
    //atributs
    private double mida;
    private boolean connexioElectrica;
    //constructor
    public Parcela(String nom, String id,double mida, boolean connexioElectrica){
        super(nom,id,4,2 );
        this.mida=mida;
        this.connexioElectrica=connexioElectrica;

    }
    //implementacio del metode
    public boolean correcteFuncionament(){

        return this.connexioElectrica;


    }
    //getters i setters
    public double getMida() {
        return mida;
    }
    public void setMida(double mida) {
        this.mida = mida;
    }
    public boolean isConnexioElectrica() {
        return connexioElectrica;
    }
    public void setConnexioElectrica(boolean connexioElectrica) {
        this.connexioElectrica = connexioElectrica;
    }

}
