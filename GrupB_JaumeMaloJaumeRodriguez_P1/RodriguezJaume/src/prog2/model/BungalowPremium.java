package prog2.model;
//subclasse de bungalow
public class BungalowPremium extends Bungalow {
    //atributs exclusius de BungalowPremium
    private String codiWifi;
    private boolean serveixExtra;
    //constructor
    public BungalowPremium(String nom, String id, String mida, int numHabitacions, int placesPersones,
    int placesParquing, boolean terrassa, boolean tv, boolean aireFred, boolean serveisExtra, String codiWifi){
        super(nom, id, 7, 4, mida, numHabitacions, placesPersones,
                placesParquing, terrassa, tv, aireFred);
        this.serveixExtra=serveisExtra;
        this.codiWifi=codiWifi;

    }
    //implementacio del metode
    public boolean correcteFuncionament(){

        return super.correcteFuncionament() && codiWifi.length()>=8 && codiWifi.length()<=16;

    }

}
