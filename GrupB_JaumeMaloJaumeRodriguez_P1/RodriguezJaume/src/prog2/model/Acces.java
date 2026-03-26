package prog2.model;
import prog2.vista.ExcepcioCamping;

public abstract class Acces implements InAcces {
    private LlistaAllotjaments  llistaAllotjaments;
    private String nom;
    private boolean accesibilitat;
    private String estat;
    public Acces(String nom,boolean accesibilitat) {
        this.llistaAllotjaments = new LlistaAllotjaments();
        this.nom = nom;
        this.accesibilitat = accesibilitat;
        this.estat="obert";
    }
    public void afegirAllotjament(String nom) {
        this.llistaAllotjaments=new LlistaAllotjaments();
        this.nom=nom;
        accesibilitat=true;

    }
    public void tancarAcces(){
        accesibilitat=false;
    }
    public void obrirAcces(){
        accesibilitat=true;
    }
    public abstract boolean isAccessibilitat();
    public String getNom(){
        return this.nom;
    }
    public boolean getEstat(){
        return this.accesibilitat;
    }
    public LlistaAllotjaments getAAllotjaments(){
        return llistaAllotjaments;
    }
    public void afegirAllotjament(Allotjament allotjament){
        if (this.llistaAllotjaments.contains(allotjament)) {
            throw new ExcepcioCamping("Error: L'allotjament amb ID " + allotjament.getId() + " ja existeix.");
        }


        llistaAllotjaments.afegirAllotjament(allotjament);
    }


}
