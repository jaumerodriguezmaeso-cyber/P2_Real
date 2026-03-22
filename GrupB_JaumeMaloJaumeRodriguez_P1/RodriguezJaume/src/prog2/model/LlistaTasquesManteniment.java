package prog2.model;

import prog2.vista.ExcepcioCamping;

import java.util.ArrayList;
import java.util.Iterator;

public class LlistaTasquesManteniment implements InLlistaTasquesManteniment{
    private ArrayList<TascaManteniment> tasquesManteniment;
    public void afegirTascaManteniment(int num, String tipus, Allotjament allotjament, String data, int dies){
        TascaManteniment tasca=new TascaManteniment(num,tipus,allotjament,data,dies);
        tasquesManteniment.add(tasca);
    }
    public void completarTascaManteniment(TascaManteniment tasca){
        Iterator<TascaManteniment> it=tasquesManteniment.iterator();
        while(it.hasNext()){
            TascaManteniment t=it.next();
            if(t.getNum()==tasca.getNum()){
                tasquesManteniment.remove(t);
            }
        }
    }
    public String llistarTasquesManteniment(){
        Iterator<TascaManteniment> it=tasquesManteniment.iterator();
        String s="";
        while(it.hasNext()){
            TascaManteniment t=it.next();
            s+=t.toString()+"\n";
        }
        return s;
    }
    public TascaManteniment getTascaManteniment(int num)throws ExcepcioCamping {
        Iterator<TascaManteniment> it=tasquesManteniment.iterator();

        while(it.hasNext()){
            TascaManteniment t=it.next();
            if(t.getNum()==num){
                return t;
            }
        }
        throw new ExcepcioCamping("no s'ha trobat");
    }

}
