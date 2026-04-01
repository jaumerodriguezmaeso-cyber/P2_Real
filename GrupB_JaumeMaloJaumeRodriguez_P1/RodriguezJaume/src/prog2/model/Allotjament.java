package prog2.model;
/**
 * @author Jaume Rodriguez i Jaume Malo
 *
 *Classe abstracta que implementa els Allotjaments, llocs que el client reserva per a passar la seva estança.
 *Aquesta classe gestiona les operacions de obrir i tancar els allotjaments.
 *
 */
public abstract class Allotjament implements InAllotjament {
    private String nom;
    private String id;
    private long estadaMinimaAlta;
    private long estadaMinimaBaixa;
    private boolean operatiu;
    private String illuminacio;


    public Allotjament(String nom, String id,long estadaMinimaAlta,long estadaMinimaBaixa){
        this.nom=nom;
        this.id = id;
        this.operatiu=true;
        this.illuminacio="100%";
        this.estadaMinimaAlta=estadaMinimaAlta;
        this.estadaMinimaBaixa=estadaMinimaBaixa;

    }
    public boolean isOperatiu(){
        return this.operatiu;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public long getEstadaMinima(Temp temp) {
        if(temp==Temp.ALTA){
            return estadaMinimaAlta;
        }
        else{
            return estadaMinimaBaixa;
        }
    }

    public void setEstadaMinima(long estadaMinimaALTA_, long estadaMinimaBAIXA_) {
        this.estadaMinimaAlta = estadaMinimaALTA_;
        this.estadaMinimaBaixa= estadaMinimaBAIXA_;
    }
    public String getIluminacio() {
        return this.illuminacio;
    }
    public void tancarAllotjament(TascaManteniment tasca){
        this.operatiu=false;
        this.illuminacio=tasca.getIluminacioAllotjament();
    }
    public void obrirAllotjament(){
        operatiu=true;
        illuminacio="100%";
    }
}
