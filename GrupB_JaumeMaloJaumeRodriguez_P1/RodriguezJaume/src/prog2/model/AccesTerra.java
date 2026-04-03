package prog2.model;
/**
 * @author Jaume Rodriguez i Jaume Malo
 *
 *Classe abstracta que hereda d'Acces.
 * Aquesta classe especifica els metres quadrats de l'acces.
 */
public abstract class AccesTerra extends Acces {
    private float longitud;
    /**
     * Constructor de la classe AccesTerra.
     * @param nom, rep el nom de l'Acces
     * @param longitud, rep la mesura de l'acces
     * @param accesibilitat, rep l'estat
     */
    public AccesTerra(String nom, float longitud, boolean accesibilitat) {
        this.longitud = longitud;
        super(nom,accesibilitat);
    }

    /**
     * getter de la longitud
     * @return longitud
     */
    public double getLongitud() {
        return this.longitud;
    }

    /**
     * setter de la longitud
     * @param longitud
     */
    public void setLongitud(float longitud) {
        this.longitud = longitud;
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
        return super.toString()+"longitud: "+this.longitud;
    }
}