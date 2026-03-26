package prog2.model;
public class CamiTerra extends AccesTerra{
    public CamiTerra(String nom,boolean accesibilitat, double metresQuadrats){
        super(nom,metresQuadrats,true);
    }
    public boolean isAccessibilitat(){
        return false;
    }
    public String toString() {
        return "Cami de Terra - Nom: " + getNom() + ", Sup: " + getMetresQuadrats() + "m2, Obert: " + getEstat();
    }
}