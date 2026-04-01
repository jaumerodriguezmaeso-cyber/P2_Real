
        package prog2.model;

/**
 * @author Jaume Rodriguez i Jaume Malo
 *
 * Classe MobilHome que representa un tipus d'allotjament dins d'un camping.
 * Aquesta classe hereta de Casa i defineix característiques específiques
 * com la disponibilitat de terrassa amb barbacoa, mida i capacitat.
 */
public class MobilHome extends Casa {

    /**
     * Atributs de la classe MobilHome.
     * indica si disposa de terrassa amb barbacoa.
     * estada mínima en temporada alta.
     * estada mínima en temporada baixa.
     * mida de l'allotjament.
     * nombre de places per a persones.
     */
    private boolean terrassaBarbacoa;
    private long estadaMinimaAlta;
    private long estadaMinimaBaixa;
    private float mida;
    private int placesPersones;

    /**
     * Constructor per inicialitzar un nou MobilHome.
     *
     * @param nom nom de l'allotjament.
     * @param id identificador únic de l'allotjament.
     * @param estat estat de l'allotjament (no utilitzat directament en aquesta classe).
     * @param iluminacio nivell d'il·luminació (no utilitzat directament en aquesta classe).
     * @param mida mida de l'allotjament.
     * @param numHabitacions nombre d'habitacions.
     * @param placesPersones nombre de places per a persones.
     * @param terrassaBarbacoa indica si disposa de terrassa amb barbacoa.
     */
    public MobilHome(String nom, String id, boolean estat, String iluminacio,
                     float mida, int numHabitacions, int placesPersones,
                     boolean terrassaBarbacoa) {

        super(nom, id, numHabitacions, 5, 3);

        this.estadaMinimaAlta = estadaMinimaAlta;
        this.estadaMinimaBaixa = estadaMinimaBaixa;
        this.mida = mida;
        this.placesPersones = placesPersones;
        this.terrassaBarbacoa = terrassaBarbacoa;
    }

    /**
     * Implementació del metode correcteFuncionament.
     * Determina si el mobil home està en correcte funcionament.
     *
     * @return true si compleix la condició definida, false en cas contrari.
     */
    public boolean correcteFuncionament() {
        return terrassaBarbacoa;
    }

    /**
     * Getter que indica si disposa de terrassa amb barbacoa.
     *
     * @return true si en disposa, false en cas contrari.
     */
    public boolean isTerrassaBarbacoa() {
        return terrassaBarbacoa;
    }

    /**
     * Setter per modificar la terrassa amb barbacoa.
     *
     * @param terrassaBarbacoa nou valor de la propietat.
     */
    public void setTerrassaBarbacoa(boolean terrassaBarbacoa) {
        this.terrassaBarbacoa = terrassaBarbacoa;
    }
}