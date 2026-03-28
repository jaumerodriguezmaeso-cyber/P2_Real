package prog2.model;
public class CarreteraTerra extends AccesTerra{


    public CarreteraTerra(String nom,boolean accesibilitat,float longitud,float amplada){
        super(nom,longitud, accesibilitat);
    }
    public boolean isAccessibilitat(){
        return super.isAccessibilitat();
    }
    public String toString(){
        return "Carretera de terra - Nom: " + getNom() +
                ", Amplada: " + getMetresQuadrats() + "m" +
                ", Estat: " + (getEstat() ? "Obert" : "Tancat") +
                ", Accessibilitat: " + (isAccessibilitat() ? "Si" : "No");
    }
}