package prog2.model;
import prog2.vista.ExcepcioCamping;

public abstract class Acces implements InAcces {
    private LlistaAllotjaments  llistaAllotjaments;
    private String nom;
    private boolean estat;
    public Acces(String nom) {
        this.llistaAllotjaments = new LlistaAllotjaments();
        this.nom = nom;
        this.estat = true;
    }
    public void afegirAllotjament(String nom) {
        this.llistaAllotjaments=new LlistaAllotjaments();
        this.nom=nom;
        estat=true;

    }
    public void tancarAcces(){
        estat=false;
    }
    public void obrirAcces(){
        estat=true;
    }
    public abstract boolean isAccessibilitat();
    public String getNom(){
        return this.nom;
    }
    public boolean getEstat(){
        return this.estat;
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
