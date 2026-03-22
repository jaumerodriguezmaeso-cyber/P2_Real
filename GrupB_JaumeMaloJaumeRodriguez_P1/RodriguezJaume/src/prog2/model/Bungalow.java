package prog2.model;
//classe bungalow, no abstracte perque es pot implementar un bungalow pero superclasse de bungalowPremium.
public class Bungalow extends Casa {
    //atributs
    private int placesParquing;
    private boolean terrassa;
    private boolean tv;
    private boolean aireFred;
    //constructor
    public Bungalow(String nom, String id, long estadaMinimAlta, long estadaMinimaBaixa, String mida, int numHabitacions, int placesPersones,
                    int park, boolean terr, boolean tv, boolean aire){
        super(nom, id, 7, 4, mida, numHabitacions,placesPersones );
        this.placesParquing=park;
        this.terrassa=terr;
        this.tv=tv;
        this.aireFred=aire;
    }

    //implementacio del metode de la superclasse Casa.
    public boolean correcteFuncionament(){

        return aireFred;

    }

}
