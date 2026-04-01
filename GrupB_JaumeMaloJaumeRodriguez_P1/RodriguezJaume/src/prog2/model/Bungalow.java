
        package prog2.model;

/**
 * @author Jaume Rodriguez i Jaume Malo
 *
 * Classe Bungalow que representa un tipus d'allotjament dins d'un camping.
 * Aquesta classe no és abstracta ja que es poden instanciar objectes de tipus Bungalow.
 * A més, actua com a superclasse per a altres tipus més específics com BungalowPremium.
 * Defineix característiques addicionals com places de pàrquing i serveis disponibles.
 */
public class Bungalow extends Casa {

    /**
     * Atributs de la classe Bungalow.
     * nombre de places de pàrquing disponibles.
     * indica si disposa de terrassa.
     * indica si disposa de televisió.
     * indica si disposa d'aire fred.
     */
    private int placesParquing;
    private boolean terrassa;
    private boolean tv;
    private boolean aireFred;

    /**
     * Constructor per inicialitzar un nou Bungalow.
     *
     * @param nom nom del bungalow.
     * @param id identificador únic del bungalow.
     * @param estat estat del bungalow (no utilitzat directament en aquesta classe).
     * @param iluminacio nivell d'il·luminació (no utilitzat directament en aquesta classe).
     * @param mida mida del bungalow (no utilitzat directament en aquesta classe).
     * @param numHabitacions nombre d'habitacions.
     * @param placesPersones nombre de places per a persones (no utilitzat directament).
     * @param placesParquing nombre de places de pàrquing.
     * @param terrassa indica si té terrassa.
     * @param tv indica si té televisió.
     * @param aire indica si té aire fred.
     */
    public Bungalow(String nom, String id, boolean estat, String iluminacio, float mida, int numHabitacions, int placesPersones,
                    int placesParquing, boolean terrassa, boolean tv, boolean aire) {
        super(nom, id, numHabitacions, 7, 4);
        this.placesParquing = placesParquing;
        this.terrassa = terrassa;
        this.tv = tv;
        this.aireFred = aire;
    }

    /**
     * Implementació del metode de la superclasse Casa.
     * Comprova si el bungalow està en correcte funcionament.
     *
     * @return true si està operatiu, false en cas contrari.
     */
    public boolean correcteFuncionament() {
        return super.isOperatiu();
    }

    /**
     * Metode toString que retorna la representació en format String del bungalow.
     *
     * @return cadena amb la informació del bungalow.
     */
    @Override
    public String toString() {
        return super.toString() + "";
    }
}