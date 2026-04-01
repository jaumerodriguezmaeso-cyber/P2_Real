package prog2.model;
/**
 * @author Jaume Rodriguez i Jaume Malo
 *
 *Classe concreta que hereda de Casa i implementa un bungalow, un tipus de Allotjament que compte amb placa de parking, terrassa, televisio i aire fred.
 *Aquesta classe gestiona el correcte funcionament del bungalow i els seus atributs
 */
public class Bungalow extends Casa {
    //atributs
    private int placesParquing;
    private boolean terrassa;
    private boolean tv;
    private boolean aireFred;
    //constructor
    public Bungalow(String nom, String id, boolean estat, String iluminacio, float mida, int numHabitacions, int placesPersones,
                    int placesParquing, boolean terrassa, boolean tv, boolean aire){
        super(nom, id, numHabitacions,7,4);
        this.placesParquing=placesParquing;
        this.terrassa=terrassa;
        this.tv=tv;
        this.aireFred=aire;
    }

    //implementacio del metode de la superclasse Casa.
    public boolean correcteFuncionament(){

        return super.isOperatiu();

    }

    public boolean isAireFred() {
        return aireFred;
    }
    public void setAireFred(boolean aireFred) {
        this.aireFred = aireFred;
    }
    public int getPlacesParquing() {
        return placesParquing;
    }
    public void setPlacesParquing(int placesParquing) {
        this.placesParquing = placesParquing;
    }
    public boolean isTerrassa() {
        return terrassa;
    }
    public void setTerrassa(boolean terrassa) {
        this.terrassa = terrassa;
    }
    public boolean isTv() {
        return tv;
    }
    public void setTv(boolean tv) {
        this.tv = tv;
    }

    @Override
    public String toString() {
        return super.toString()+"";
    }

}
