package prog2.model;

public class MobilHome extends Casa {
    //atribut exclusiu
    private boolean terrassaBarbacoa;
    private long estadaMinimaAlta;
    private long estadaMinimaBaixa;
    private float mida;
    private int placesPersones;

    //constructor
    public MobilHome(String nom, String id, boolean estat, String iluminacio,
                     float mida, int numHabitacions, int placesPersones,
                     boolean terrassaBarbacoa){
        super(nom, id, numHabitacions,5,3);
        this.estadaMinimaAlta = estadaMinimaAlta;
        this.estadaMinimaBaixa = estadaMinimaBaixa;
        this.mida = mida;
        this.placesPersones = placesPersones;
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
