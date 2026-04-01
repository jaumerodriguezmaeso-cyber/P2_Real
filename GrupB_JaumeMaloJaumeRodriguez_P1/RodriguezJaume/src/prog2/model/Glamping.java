
        package prog2.model;

/**
 * @author Jaume Rodriguez i Jaume Malo
 *
 * Classe Glamping que representa un tipus d'allotjament dins d'un camping.
 * Aquesta classe hereta de Casa i defineix característiques específiques
 * com el material de construcció, si admet mascotes i altres propietats.
 */
public class Glamping extends Casa {

    /**
     * Atributs de la classe Glamping.
     * material de construcció de l'allotjament.
     * indica si s'accepten mascotes.
     * nombre de places per a persones.
     * mida de l'allotjament.
     * estada mínima en temporada alta.
     * estada mínima en temporada baixa.
     */
    private String material;
    private boolean casaMascota;
    private int placesPersones;
    private float mida;
    private long estadaMinimAlta;
    private long estadaMinimaBaixa;

    /**
     * Constructor per inicialitzar un nou Glamping.
     *
     * @param nom nom de l'allotjament.
     * @param id identificador únic de l'allotjament.
     * @param estat estat de l'allotjament (no utilitzat directament en aquesta classe).
     * @param iluminacio nivell d'il·luminació (no utilitzat directament en aquesta classe).
     * @param mida mida de l'allotjament.
     * @param numHabitacions nombre d'habitacions.
     * @param placesPersones nombre de places per a persones.
     * @param material material de construcció.
     * @param casaMascota indica si s'accepten mascotes.
     */
    public Glamping(String nom, String id, boolean estat, String iluminacio,
                    float mida, int numHabitacions, int placesPersones,
                    String material, boolean casaMascota) {

        super(nom, id, numHabitacions, 5, 3);

        this.mida = mida;
        this.placesPersones = placesPersones;
        this.material = material;
        this.casaMascota = casaMascota;
    }

    /**
     * Implementació del metode correcteFuncionament.
     * Determina si el glamping està en correcte funcionament.
     *
     * @return true si compleix la condició definida, false en cas contrari.
     */
    public boolean correcteFuncionament() {
        return casaMascota;
    }

    /**
     * Getter del material de l'allotjament.
     *
     * @return material de construcció.
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Setter del material de l'allotjament.
     *
     * @param material nou material de construcció.
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Getter que indica si s'accepten mascotes.
     *
     * @return true si s'accepten mascotes, false en cas contrari.
     */
    public boolean isCasaMascota() {
        return casaMascota;
    }

    /**
     * Setter que modifica si s'accepten mascotes.
     *
     * @param casaMascota nou valor per indicar si s'accepten mascotes.
     */
    public void setCasaMascota(boolean casaMascota) {
        this.casaMascota = casaMascota;
    }
}