package prog2.model;
public class CarreteraAsfaltada extends AccesAsfalt{
    private float pes;
    public CarreteraAsfaltada(String nom,boolean accesibilitat,float amplada, float pes){
        super(nom,amplada,accesibilitat);
        this.pes=pes;
    }
    public boolean isAccessibilitat(){
        return true;
    }

    public String toString(){
        return "Carretera d'Asfalt - Nom: " + getNom() +
                ", Amplada: " + getAmplada() + "m" +
                ", Estat: " + (getEstat() ? "Obert" : "Tancat") +
                ", Accessibilitat: " + (isAccessibilitat() ? "Si" : "No");
    }

}