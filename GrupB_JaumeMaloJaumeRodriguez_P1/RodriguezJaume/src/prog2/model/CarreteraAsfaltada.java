package prog2.model;
/**
 * @author Jaume Rodriguez i Jaume Malo
 *
 *Classe concreta que hereda de Acces Asfalt.
 *Aquesta classe crea l'objecte i gestiona el pes que pot soportar l'Acces.
 *
 */
public class CarreteraAsfaltada extends AccesAsfalt{
    /**
     * atribut pes de la classe CarreteraAsfaltada
     */
    private float pes;

    /**
     * Constructor de la classe CarreteraAsfaltada.
     * @param nom
     * @param accesibilitat
     * @param amplada
     * @param pes
     */
    public CarreteraAsfaltada(String nom,boolean accesibilitat,float amplada, float pes){
        super(nom,amplada,accesibilitat);
        this.pes=pes;
    }

    /**
     * getter i setter de l'atribut pes.
     * @return
     */
    public float getPes(){
        return pes;
    }
    public void setPes(float pes){
        this.pes=pes;
    }
    /**
     * metode per a accedir a la accesibilitat de l'acces
     * @return accesibilitat
     */
    public boolean isAccessibilitat(){
        return super.isAccessibilitat();
    }
    /**
     * metode per a veure la informacio de l'acces.
     * @return la informacio de l'acces
     */
    public String toString(){
        return super.toString()+"pes: "+pes;
    }

}