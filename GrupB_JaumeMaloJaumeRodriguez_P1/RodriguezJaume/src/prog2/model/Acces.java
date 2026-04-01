package prog2.model;
import prog2.vista.ExcepcioCamping;
/**
 * @author Jaume Rodriguez i Jaume Malo
 *
 *Classe abstracta que implementa un Acces per a arribar a un allotjament dins d'un camping
 *Aquesta classe gestiona les operacions de obrir i tancar l'acces i modifica una llista de els allotjaments
 * als quals pot es pot accedir amb aquest acces.
 */
public abstract class Acces implements InAcces {
    /**
     *Atributs de la classe Acces.
     * llista de Allotjaments als quals es pot accedir.
     * nom de l'Acces.
     * Un boolean per a veure si es accesible o no ho es.
     * estat, per defecte obert.
     */

    private LlistaAllotjaments  llistaAllotjaments;
    private String nom;
    private boolean accesibilitat;
    private String estat;
    /**
     * Constructor para inicialitzar un nou Acces.
     *
     * * @param nom nom del Acces.
     * @param accesibilitat True si es accessible, false en cas contrari.
     */
    public Acces(String nom,boolean accesibilitat) {
        this.llistaAllotjaments = new LlistaAllotjaments();
        this.nom = nom;
        this.accesibilitat = accesibilitat;
        this.estat="obert";
    }
    /**
     * metodes per a modificar els atributs
     * getters i setters.
     */
    public void tancarAcces(){
        estat="no obert";
    }
    public void obrirAcces(){
        estat="obert";
    }
    public boolean isAccessibilitat(){
        return this.accesibilitat;
    }
    public String getNom(){
        return this.nom;
    }
    public boolean getEstat(){
        return this.estat.equals("obert");
    }
    public LlistaAllotjaments getAAllotjaments(){
        return llistaAllotjaments;
    }

    /**
     * Metode per afegir un alltojament la llista d'allotjament de l'acces.
     *
     * @param allotjament
     */
    public void afegirAllotjament(Allotjament allotjament){
        if (this.llistaAllotjaments.contains(allotjament)) {
            throw new ExcepcioCamping("Error: L'allotjament amb ID " + allotjament.getId() + " ja existeix.");
        }
        llistaAllotjaments.afegirAllotjament(allotjament);
    }


}
