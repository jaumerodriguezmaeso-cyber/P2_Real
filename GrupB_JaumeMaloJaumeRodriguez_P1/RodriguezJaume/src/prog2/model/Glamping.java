package prog2.model;

public class Glamping extends Casa {
    //atributs
    private String material;
    private boolean casaMascota;
    //constructor
    public Glamping(String nom, String id, long estadaMinimaAlta, long estadaMinimaBaixa,
                    String mida, int numHabitacions, int placesPersones,
                    String material, boolean casaMascota){
        super(nom, id, 3, 3, mida, numHabitacions, placesPersones);

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
