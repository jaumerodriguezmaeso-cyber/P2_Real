package prog2.model;
/**
 * @author Jaume Rodriguez i Jaume Malo
 *
 *Classe concreta que hereda de Acces Asfalt.
 *Aquesta classe crea l'objecte.
 *
 */
public class CamiAsfaltat extends AccesAsfalt{
    /**
     * Constructor de la classe Cami Asfalt.
     * @param nom, rep el nom de l'Acces
     * @param amplada, rep la mesura de l'acces
     * @param accesibilitat, rep l'estat
     */
    public CamiAsfaltat(String nom,boolean accesibilitat,double amplada){
        super(nom,amplada,accesibilitat);
    }
    /**
     * metode per a accedir a la accesibilitat de l'acces
     * @return accesibilitat
     */
    public boolean isAccessibilitat(){
        return super.isAccessibilitat();
    }
    /**
     * metode per a veure la informacio de l'acces.
     * @return la informacio de l'acces
     */
    public String toString() {
        return "Cami d'Asfalt - Nom: " + getNom() + ", Sup: " + getAmplada() + "m2, Obert: " + getEstat();
    }

}