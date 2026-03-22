package prog2.model;

public class MobilHome extends Casa {
    //atribut exclusiu
    private boolean terrassaBarbacoa;
    //constructor
    public MobilHome(String nom, String id, long estadaMinimaAlta, long estadaMinimaBaixa,
                     String mida, int numHabitacions, int placesPersones,
                     boolean terrassaBarbacoa){
        super(nom, id, 5, 3, mida, numHabitacions, placesPersones);
        this.terrassaBarbacoa=terrassaBarbacoa;
    }
    //implementacio del metode
    public boolean correcteFuncionament(){

        return terrassaBarbacoa;

    }
    //getters i setters
    public boolean isTerrassaBarbacoa() { return terrassaBarbacoa; }
    public void setTerrassaBarbacoa(boolean terrassaBarbacoa) { this.terrassaBarbacoa = terrassaBarbacoa; }

}
