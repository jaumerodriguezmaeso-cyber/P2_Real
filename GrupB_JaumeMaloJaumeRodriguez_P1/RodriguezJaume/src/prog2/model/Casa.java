
        package prog2.model;

/**
 * @author Jaume Rodriguez i Jaume Malo
 *
 * Classe abstracta Casa que representa un tipus d'allotjament dins d'un camping.
 * Aquesta classe hereta de Allotjament i defineix característiques comunes
 * per a les cases. És abstracta ja que serveix com a superclasse per a altres
 * tipus concrets com Bungalow o BungalowPremium.
 */
public abstract class Casa extends Allotjament {

    /**
     * Atributs de la classe Casa.
     * nombre d'habitacions de l'allotjament.
     */
    private int numHabitacions;

    /**
     * Constructor per inicialitzar una nova Casa.
     *
     * @param nom nom de l'allotjament.
     * @param id identificador únic de l'allotjament.
     * @param numHabitacions nombre d'habitacions.
     * @param estadaMinimaAlta estada mínima en temporada alta.
     * @param estadaMinimaBaixa estada mínima en temporada baixa.
     */
    public Casa(String nom, String id, int numHabitacions, long estadaMinimaAlta, long estadaMinimaBaixa) {
        // Crida al constructor de la superclasse Allotjament
        super(nom, id, estadaMinimaAlta, estadaMinimaBaixa);
        this.numHabitacions = numHabitacions;
    }

    /**
     * Metode toString que retorna la representació en format String de la casa.
     *
     * @return cadena amb la informació de la casa.
     */
    public String toString() {
        return "id:" + super.getId() + " nom " + super.getNom() + " numero d'habitacions:" + numHabitacions;
    }

    /**
     * Getter del nombre d'habitacions.
     *
     * @return nombre d'habitacions.
     */
    public int getNumHabitacions() {
        return numHabitacions;
    }

    /**
     * Setter del nombre d'habitacions.
     *
     * @param numHabitacions nou nombre d'habitacions.
     */
    public void setNumHabitacions(int numHabitacions) {
        this.numHabitacions = numHabitacions;
    }

    /**
     * Metode abstracte que ha de ser implementat per les subclasses.
     * Determina si l'allotjament està en correcte funcionament.
     *
     * @return true si funciona correctament, false en cas contrari.
     */
    public abstract boolean correcteFuncionament();
}