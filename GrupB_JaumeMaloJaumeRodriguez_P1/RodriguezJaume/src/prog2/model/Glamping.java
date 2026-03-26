package prog2.model;

public class Glamping extends Casa {
    //atributs
    private String material;
    private boolean casaMascota;
    private int placesPersones;
    private float mida;
    private long estadaMinimAlta;
    private long estadaMinimaBaixa;
    //constructor
    public Glamping(String nom, String id, boolean estat, String iluminacio,
                    float mida, int numHabitacions, int placesPersones,
                    String material, boolean casaMascota){
        super(nom, id, numHabitacions);

        this.mida=mida;
        this.placesPersones = placesPersones;
        this.material = material;
        this.casaMascota = casaMascota;
    }
    //implementacio del metode de la superclasse
    public boolean correcteFuncionament(){

        return casaMascota;

    }
    //getters i setters
    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    public boolean isCasaMascota() { return casaMascota; }
    public void setCasaMascota(boolean casaMascota) { this.casaMascota = casaMascota; }

}
