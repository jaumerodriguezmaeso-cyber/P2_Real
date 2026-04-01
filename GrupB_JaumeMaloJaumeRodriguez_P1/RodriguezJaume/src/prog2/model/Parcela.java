
        package prog2.model;

/**
 * @author Jaume Rodriguez i Jaume Malo
 *
 * Classe Parcela que representa un tipus d'allotjament dins d'un camping.
 * Aquesta classe hereta de Allotjament i defineix característiques pròpies
 * com la mida en metres quadrats i la connexió elèctrica.
 */
public class Parcela extends Allotjament {

    /**
     * Atributs de la classe Parcela.
     * superfície de la parcel·la en metres quadrats.
     * indica si disposa de connexió elèctrica.
     */
    private double metresQuadrats;
    private boolean conexioElectrica;

    /**
     * Constructor per inicialitzar una nova Parcela.
     *
     * @param nom nom de la parcel·la.
     * @param id identificador únic de la parcel·la.
     * @param conexioElectrica indica si disposa de connexió elèctrica.
     * @param iluminacio nivell d'il·luminació (no utilitzat directament en aquesta classe).
     * @param metresQuadrats superfície en metres quadrats.
     * @param estat estat de la parcel·la (no utilitzat directament en aquesta classe).
     */
    public Parcela(String nom, String id, boolean conexioElectrica, String iluminacio, double metresQuadrats, boolean estat) {
        super(nom, id, 4, 2);
        this.metresQuadrats = metresQuadrats;
        this.conexioElectrica = conexioElectrica;
    }

    /**
     * Getter de la superfície de la parcel·la.
     *
     * @return metres quadrats de la parcel·la.
     */
    public double getMetresQuadrats() {
        return metresQuadrats;
    }

    /**
     * Setter de la superfície de la parcel·la.
     *
     * @param metresQuadrats nova superfície.
     */
    public void setMetresQuadrats(double metresQuadrats) {
        this.metresQuadrats = metresQuadrats;
    }

    /**
     * Getter que indica si la parcel·la disposa de connexió elèctrica.
     *
     * @return true si disposa de connexió elèctrica, false en cas contrari.
     */
    public boolean getConexioElextrica() {
        return conexioElectrica;
    }

    /**
     * Setter per modificar la connexió elèctrica.
     *
     * @param conexioElectrica nou valor de la connexió elèctrica.
     */
    public void setConexioElextrica(boolean conexioElectrica) {
        this.conexioElectrica = conexioElectrica;
    }

    /**
     * Metode que comprova si la parcel·la està en correcte funcionament.
     *
     * @return true si està operativa, false en cas contrari.
     */
    public boolean correcteFuncionament() {
        return this.isOperatiu();
    }

    /**
     * Metode toString que retorna la representació en format String de la parcel·la.
     *
     * @return cadena amb la informació de la parcel·la.
     */
    public String toString() {
        return super.toString() + " MetresQuadrats: " + metresQuadrats;
    }
}