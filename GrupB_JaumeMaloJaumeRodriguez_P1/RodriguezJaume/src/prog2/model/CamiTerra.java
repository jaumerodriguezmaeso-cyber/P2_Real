package prog2.model;
public class CamiTerra extends AccesTerra{
    public CamiTerra(String nom,boolean acces, double metresQuadrats){
        super(nom,metresQuadrats,true);
    }
    public boolean isAccessibilitat(){
        return super.isAccessibilitat();
    }
    public String toString() {
        return "Cami de Terra - Nom: " + getNom() + ", Sup: " + getMetresQuadrats() + "m2, Obert: " + getEstat();
    }
}