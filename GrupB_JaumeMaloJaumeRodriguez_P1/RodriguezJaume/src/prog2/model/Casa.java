package prog2.model;
//classe casa, subclasse de allotjament, abstracte ja que es una superclasse de les classes a implementar.
public abstract class Casa extends Allotjament{
    //atributs de la classe Casa, en private.
    private int numHabitacions;
    //constructor
    public Casa(String nom,String id,int numHabitacions,long estadaMinimaAlta,long estadaMinimaBaixa){
        //com que els hereda de la classe allotjament, utilitzem super a referirnos a que son heretats de la classe anterior
        super(nom, id,estadaMinimaAlta,estadaMinimaBaixa);
        this.numHabitacions = numHabitacions;
    }
    public String toString(){
        return "id:"+super.getId()+"nom "+super.getNom()+"numero d'habitacions:"+numHabitacions;
    }
    public int getNumHabitacions() {
        return numHabitacions;
    }
    public void setNumHabitacions(int numHabitacions) {
        this.numHabitacions = numHabitacions;
    }
    public abstract boolean correcteFuncionament();



}
