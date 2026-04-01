package prog2.model;

/**
 * @author Jaume Rodriguez i Jaume Malo
 *
 *Classe concreta que hereda de Bungalow i implementa un bungalow premium, un tipus de Allotjament que compte amb placa de parking, terrassa, televisio i aire fred, com un gunalow
 * i apart te els atributs exclusius codiWifi i Serveix extra.
 *Aquesta classe gestiona el correcte funcionament del bungalow premium i els seus atributs
 */
public class BungalowPremium extends Bungalow {
    //atributs exclusius de BungalowPremium
    private String codiWifi;
    private boolean serveixExtra;
    //constructor
    public BungalowPremium(String nom, String id,boolean estat, String iluminacio, float mida, int numHabitacions, int placesPersones,
    int placesParquing, boolean terrassa, boolean tv, boolean aireFred, boolean serveisExtra, String codiWifi){
        super(nom, id, estat, iluminacio, mida, numHabitacions, placesPersones,
                placesParquing, terrassa, tv, aireFred);
        this.serveixExtra=serveisExtra;
        this.codiWifi=codiWifi;

    }
    //implementacio del metode
    public boolean correcteFuncionament(){

        return this.isOperatiu();

    }

}
