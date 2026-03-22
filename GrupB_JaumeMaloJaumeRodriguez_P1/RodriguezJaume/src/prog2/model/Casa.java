package prog2.model;
//classe casa, subclasse de allotjament, abstracte ja que es una superclasse de les classes a implementar.
public abstract class Casa extends Allotjament{
    //atributs de la classe Casa, en private.
    private String mida;
    private int numHabitacions;
    private int placesPersones;
    //constructor
    public Casa(String nom, String id, long estadaMinimaAlta, long estadaMinimaBaixa, String mida, int numHabitacions, int placesPersones){
        //com que els hereda de la classe allotjament, utilitzem super a referirnos a que son heretats de la classe anterior
        super(nom, id, estadaMinimaAlta, estadaMinimaBaixa);
        this.mida = mida;
        this.numHabitacions = numHabitacions;
        this.placesPersones = placesPersones;
    }


    @Override
    public abstract boolean correcteFuncionament();

}
