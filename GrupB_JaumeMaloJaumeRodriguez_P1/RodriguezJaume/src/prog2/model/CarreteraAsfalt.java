package prog2.model;
public class CarreteraAsfalt extends AccesAsfalt{
    public CarreteraAsfalt(String nom,double amplada){
        super(nom,amplada);
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