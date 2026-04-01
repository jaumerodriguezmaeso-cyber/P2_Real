
        package prog2.model;

/**
 * @author Jaume Rodriguez i Jaume Malo
 *
 * Classe abstracta que representa un Allotjament dins d'un camping.
 * Aquesta classe defineix els atributs bàsics i les operacions comunes
 * per a tots els tipus d'allotjaments.
 * Gestiona l'estat operatiu, la il·luminació i les estades mínimes segons temporada.
 */
public abstract class Allotjament implements InAllotjament {

    /**
     * Atributs de la classe Allotjament.
     * nom de l'allotjament.
     * identificador únic de l'allotjament.
     * estada mínima en temporada alta.
     * estada mínima en temporada baixa.
     * indica si l'allotjament està operatiu.
     * percentatge d'il·luminació de l'allotjament.
     */
    private String nom;
    private String id;
    private long estadaMinimaAlta;
    private long estadaMinimaBaixa;
    private boolean operatiu;
    private String illuminacio;

    /**
     * Constructor per inicialitzar un nou Allotjament.
     *
     * @param nom nom de l'allotjament.
     * @param id identificador únic de l'allotjament.
     * @param estadaMinimaAlta estada mínima en temporada alta.
     * @param estadaMinimaBaixa estada mínima en temporada baixa.
     */
    public Allotjament(String nom, String id, long estadaMinimaAlta, long estadaMinimaBaixa) {
        this.nom = nom;
        this.id = id;
        this.operatiu = true;
        this.illuminacio = "100%";
        this.estadaMinimaAlta = estadaMinimaAlta;
        this.estadaMinimaBaixa = estadaMinimaBaixa;
    }

    /**
     * Metode per consultar si l'allotjament està operatiu.
     *
     * @return true si està operatiu, false en cas contrari.
     */
    public boolean isOperatiu() {
        return this.operatiu;
    }

    /**
     * Getter del nom de l'allotjament.
     *
     * @return nom de l'allotjament.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter del nom de l'allotjament.
     *
     * @param nom nou nom de l'allotjament.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter de l'identificador de l'allotjament.
     *
     * @return id de l'allotjament.
     */
    public String getId() {
        return id;
    }

    /**
     * Setter de l'identificador de l'allotjament.
     *
     * @param id nou identificador de l'allotjament.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Metode per obtenir l'estada mínima segons la temporada.
     *
     * @param temp temporada (ALTA o BAIXA).
     * @return estada mínima corresponent a la temporada.
     */
    public long getEstadaMinima(Temp temp) {
        if (temp == Temp.ALTA) {
            return estadaMinimaAlta;
        } else {
            return estadaMinimaBaixa;
        }
    }

    /**
     * Metode per modificar les estades mínimes.
     *
     * @param estadaMinimaALTA_ nova estada mínima en temporada alta.
     * @param estadaMinimaBAIXA_ nova estada mínima en temporada baixa.
     */
    public void setEstadaMinima(long estadaMinimaALTA_, long estadaMinimaBAIXA_) {
        this.estadaMinimaAlta = estadaMinimaALTA_;
        this.estadaMinimaBaixa = estadaMinimaBAIXA_;
    }

    /**
     * Getter de la il·luminació de l'allotjament.
     *
     * @return percentatge d'il·luminació.
     */
    public String getIluminacio() {
        return this.illuminacio;
    }

    /**
     * Metode per tancar l'allotjament per manteniment.
     * Modifica l'estat a no operatiu i ajusta la il·luminació segons la tasca.
     *
     * @param tasca tasca de manteniment aplicada a l'allotjament.
     */
    public void tancarAllotjament(TascaManteniment tasca) {
        this.operatiu = false;
        this.illuminacio = tasca.getIluminacioAllotjament();
    }

    /**
     * Metode per obrir l'allotjament.
     * Estableix l'estat com a operatiu i restaura la il·luminació al 100%.
     */
    public void obrirAllotjament() {
        operatiu = true;
        illuminacio = "100%";
    }
}