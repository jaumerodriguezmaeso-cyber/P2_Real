package prog2.model;

public class TascaManteniment implements InTascaManteniment {
    public static enum TipusTascaManteniment {
        Reparacio,
        Neteja,
        RevisioTecnica,
        Desinfeccio
    }
    private String data;
    private Allotjament allotjament;
    private TipusTascaManteniment tipus;
    private int numTasca;
    private int dies;

    public TascaManteniment(int num, String tipus, Allotjament allotjament, String data, int dies) {
        this.num = num;
        this.allotjament = allotjament;
        this.data = data;
        this.iluminacioAllotjament = tipus;
        this.dies=dies;
    }
    public int getNum() {
        return this.num;
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
        return ;
    }

    public void setData(String data_){
        this.data = data_;
    }
    public void setNum(int num){
        this.num = num;
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
                iluminacioAllotjament="50%";
                break;
            case Neteja:
                iluminacioAllotjament="100%";
                break;
            case Desinfeccio:
                iluminacioAllotjament="0%";
                break;
            case RevisioTecnica:
                iluminacioAllotjament="50%";
                break;
        }
        return iluminacioAllotjament;
    }
    //arreglar
    public String toString() {
        return "Tasca #" + numTasca + " [" + tipus + "] en " + allotjament.getId() +
                " data: " + data + " (durada: " + dies + " dies)";
    }
}
