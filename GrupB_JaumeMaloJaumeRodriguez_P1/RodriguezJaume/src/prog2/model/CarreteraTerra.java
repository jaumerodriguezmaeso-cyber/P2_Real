package prog2.model;
public class CarreteraTerra extends AccesTerra{


    public CarreteraTerra(String nom,double amplada){
        super(nom,amplada);
    }
    public boolean isAccessibilitat(){
        return true;
    }
    public String toString(){
        return "Carretera de terra - Nom: " + getNom() +
                ", Amplada: " + getMetresQuadrats() + "m" +
                ", Estat: " + (getEstat() ? "Obert" : "Tancat") +
                ", Accessibilitat: " + (isAccessibilitat() ? "Si" : "No");
    }
}