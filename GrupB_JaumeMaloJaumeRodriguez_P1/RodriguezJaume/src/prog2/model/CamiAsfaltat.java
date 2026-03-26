package prog2.model;
public class CamiAsfaltat extends AccesAsfalt{
    public CamiAsfaltat(String nom,boolean accesibilitat,double amplada){
        super(nom,amplada,accesibilitat);
    }
    public boolean isAccessibilitat(){
        return false;
    }
    public String toString() {
        return "Cami d'Asfalt - Nom: " + getNom() + ", Sup: " + getAmplada() + "m2, Obert: " + getEstat();
    }

}