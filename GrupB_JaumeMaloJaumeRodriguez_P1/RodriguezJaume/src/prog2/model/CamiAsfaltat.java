package prog2.model;
public class CamiAsfaltat extends AccesAsfalt{
    public CamiAsfaltat(String nom,boolean estat,double amplada){
        super(nom,amplada,estat);
    }
    public boolean isAccessibilitat(){
        return super.isAccessibilitat();
    }
    public String toString() {
        return "Cami d'Asfalt - Nom: " + getNom() + ", Sup: " + getAmplada() + "m2, Obert: " + getEstat();
    }

}