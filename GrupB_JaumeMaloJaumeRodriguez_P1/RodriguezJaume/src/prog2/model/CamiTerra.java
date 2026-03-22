package prog2.model;
public class CamiTerra extends AccesTerra{
    public CamiTerra(String nom, double metresQuadrats){
        super(nom,metresQuadrats);
    }
    public boolean isAccessibilitat(){
        return false;
    }
    public String toString() {
        return "Cami de Terra - Nom: " + getNom() + ", Sup: " + getMetresQuadrats() + "m2, Obert: " + getEstat();
    }
}