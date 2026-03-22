package prog2.model;
public class CamiAsfalt extends AccesAsfalt{
    public CamiAsfalt(String nom, double amplada_){
        super(nom,amplada_);
    }
    public boolean isAccessibilitat(){
        return false;
    }
    public String toString() {
        return "Cami d'Asfalt - Nom: " + getNom() + ", Sup: " + getAmplada() + "m2, Obert: " + getEstat();
    }

}