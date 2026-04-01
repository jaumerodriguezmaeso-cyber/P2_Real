package prog2.model;
/**
 * @author Jaume Rodriguez i Jaume Malo
 *
 *Classe abstracta que hereda d'Acces.
 * Aquesta classe especifica l'almplada de l'acces.
 */
public abstract class AccesAsfalt extends Acces{
    /**
     *Atributs de la classe AccesAsfalt
     * amplada, rep la mesura de l'acces.
     */

    private double amplada;

    /**
     * Constructor de la classe AccesAsfalt.
     * @param nom, rep el nom de l'Acces
     * @param amplada_, rep la mesura de l'acces
     * @param accesibilitat, rep l'estat
     */
    public AccesAsfalt(String nom, double amplada_,boolean accesibilitat){
        this.amplada =amplada_;
        super(nom,accesibilitat);
    }

    /**
     * metode per a accedir a la accesibilitat de l'acces
     * @return accesibilitat
     */
    public boolean isAccessibilitat() {
        return super.isAccessibilitat();
    }

    /**
     * metode per a accedir a la amplada de l'acces
     * @return amplada
     */
    public double getAmplada() {
        return this.amplada;
    }

    /**
     * metode per a modificar la amplada de l'acces
     * @param amplada
     */
    public void setAmplada(double amplada) {
        this.amplada = amplada;
    }

    /**
     * metode per a veure la informacio de l'acces.
     * @return la informacio de l'acces
     */
    public String toString(){
        return super.toString()+"amplada: "+this.amplada;
    }

}