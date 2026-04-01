package prog2.model;
/**
 * @author Jaume Rodriguez i Jaume Malo
 *
 *Classe concreta que implementa les diferents tasques de manetniment, cadascuna amb les seves diferencies en els atributs
 *
 */
public class TascaManteniment implements InTascaManteniment {
    /**
     * enum per a el nom de les tasques
     */
    public static enum TipusTascaManteniment {
        Reparacio,
        Neteja,
        RevisioTecnica,
        Desinfeccio
    }

    /**
     * atributs de la classe Tasca manteniment
     */
    private String data;
    private Allotjament allotjament;
    private TipusTascaManteniment tipus;
    private int numTasca;
    private int dies;
    private String iluminacio;

    /**
     * constructor de l'objecte de la classe tascaManteniment
     * @param numTasca
     * @param tipus
     * @param allotjament
     * @param data
     * @param dies
     */
    public TascaManteniment(int numTasca, TipusTascaManteniment tipus, Allotjament allotjament, String data, int dies) {
        this.numTasca = numTasca;
        this.allotjament = allotjament;
        this.data = data;
        this.tipus=tipus;
        this.dies=dies;
        this.iluminacio="100%";

    }

    /**
     * getters i setters dels atributs de tasca manteniment
     *
     */
    public int getNum() {
        return this.numTasca;
    }
    public TascaManteniment.TipusTascaManteniment getTipus(){
        return this.tipus;
    }
    public Allotjament getAllotjament(){
        return this.allotjament;
    }
    public String getData(){
        return this.data;
    }

    public int getDies(){
        return this.dies;
    }

    public void setData(String data_){
        this.data = data_;
    }
    public void setNum(int numTasca){
        this.numTasca = numTasca;
    }
    public void setAllotjament(Allotjament allotjament){
        this.allotjament = allotjament;
    }
    public void setDies(int dies_){
        this.dies=dies_;
    }
    public void setTipus(TipusTascaManteniment tipus_){
        this.tipus = tipus_;
    }
    public String getIluminacioAllotjament(){
        switch (this.tipus){
            case Reparacio:
                iluminacio="50%";
                break;
            case Neteja:
                iluminacio="100%";
                break;
            case Desinfeccio:
                iluminacio="0%";
                break;
            case RevisioTecnica:
                iluminacio="50%";
                break;
        }
        return iluminacio;
    }

    /**
     * metode per a rebre la informacio de la tasca de manteniment.
     * @return informacio sobre la tasca de manteniment.
     */
    public String toString() {
        return "Tasca " + numTasca + " [" + tipus + "] en " + allotjament.getId() +
                " data: " + data + " (durada: " + dies + " dies)";
    }
}
