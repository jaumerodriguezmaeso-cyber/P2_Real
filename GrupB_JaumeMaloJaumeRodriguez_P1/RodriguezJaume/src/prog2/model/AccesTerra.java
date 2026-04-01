package prog2.model;
/**
 * @author Jaume Rodriguez i Jaume Malo
 *
 *Classe abstracta que hereda d'Acces.
 * Aquesta classe especifica els metres quadrats de l'acces.
 */
public abstract class AccesTerra extends Acces {
    private double metresquadrats;
    /**
     * Constructor de la classe AccesTerra.
     * @param nom, rep el nom de l'Acces
     * @param metresQuadrats, rep la mesura de l'acces
     * @param accesibilitat, rep l'estat
     */
    public AccesTerra(String nom, double metresQuadrats, boolean accesibilitat) {
        this.metresquadrats = metresQuadrats;
        super(nom,accesibilitat);
    }

    public double metresQuadrats() {
        return this.metresquadrats;
    }
    /**
     * metode per a accedir a la accesibilitat de l'acces
     * @return accesibilitat
     */
    @Override
    public boolean isAccessibilitat() {
        return super.isAccessibilitat();
    }
    /**
     * metode per a veure la informacio de l'acces.
     * @return la informacio de l'acces
     */
    public String toString() {
        return super.toString();
    }
}