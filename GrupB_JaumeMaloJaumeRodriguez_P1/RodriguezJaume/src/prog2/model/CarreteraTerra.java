package prog2.model;
/**
 * @author Jaume Rodriguez i Jaume Malo
 *
 *Classe concreta que hereda de Acces terra.
 *Aquesta classe crea l'objecte i els metres qudrats.
 *
 */
public class CarreteraTerra extends AccesTerra{
    /**
     * Atribut de la classe CarreteraTerra
     */
    private double metresquadrats;

    /**
     * Constructor de la classe Carretera terra
     * @param nom
     * @param accesibilitat
     * @param longitud
     * @param metresquadrats
     */
    public CarreteraTerra(String nom,boolean accesibilitat,float longitud,double metresquadrats){
        super(nom,longitud, accesibilitat);
        this.metresquadrats=metresquadrats;
    }

    /**
     * Getters de l'atribut metres quadrats
     * @return metresquadrats
     */
    public double getMetresQuadrats() {
        return this.metresquadrats;
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
    public String toString(){
        return "Carretera de terra - Nom: " + getNom() +
                ", metres quadrats: " + getMetresQuadrats() + "m" +
                ", Estat: " + (getEstat() ? "Obert" : "Tancat") +
                ", Accessibilitat: " + (isAccessibilitat() ? "Si" : "No");
    }
}