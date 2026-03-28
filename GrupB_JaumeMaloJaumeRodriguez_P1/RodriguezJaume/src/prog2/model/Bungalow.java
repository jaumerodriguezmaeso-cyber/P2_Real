package prog2.model;
//classe bungalow, no abstracte perque es pot implementar un bungalow pero superclasse de bungalowPremium.
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
    @Override
    public String toString() {
        return super.toString()+"";
    }

}
