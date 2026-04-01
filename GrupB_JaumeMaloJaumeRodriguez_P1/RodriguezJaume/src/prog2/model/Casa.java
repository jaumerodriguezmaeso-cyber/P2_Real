package prog2.model;
/**
 * @author Jaume Rodriguez i Jaume Malo
 *
 *Classe abtracta que hereda de Allotjament i gestiona el numero d'habitacions de l'estancia.
 *
 */

public abstract class Casa extends Allotjament{

    private int numHabitacions;

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
