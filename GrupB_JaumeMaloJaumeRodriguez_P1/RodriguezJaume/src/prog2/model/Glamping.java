package prog2.model;
/**
 * @author Jaume Rodriguez i Jaume Malo
 *
 *Classe concreta que hereda de Casa i implementa un Glamping, un tipus de Allotjament que compte amb una casa per a mascotes i es d'un tipus de material especific.
 *Aquesta classe gestiona el correcte funcionament del bungalow i els seus atributs
 */
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
        super(nom, id, numHabitacions,5,3);

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
