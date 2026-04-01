package prog2.model;

import prog2.vista.ExcepcioCamping;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * @author Jaume Rodriguez i Jaume Malo
 *
 *Classe concreta que gestiona una llista de tasques de manteniment que te cada allotjament i que encara estan per resoldre.
 *
 */
public class LlistaTasquesManteniment implements InLlistaTasquesManteniment{
    private ArrayList<TascaManteniment> tasquesManteniment;
    /**
     * Constructor de la llista de tasques de manteniment
     */
    private TascaManteniment.TipusTascaManteniment tipusTascaManteniment;

    /**
     * metode per a crear una tasca de manteniment i afegirla a la llista
     * @param num Número d'identificació de la tasca.
     * @param tipus Aquest String permet crear el enum TipusTascaManteniment
     * @param allotjament Allotjament on s'afegeix la tasca
     * @param data Data quan genera la tasca
     * @param dies Número de dies esperats per completar la tasca
     */
    public void afegirTascaManteniment(int num, String tipus, Allotjament allotjament, String data, int dies){
        TascaManteniment tasca=new TascaManteniment(num,tipusTascaManteniment,allotjament,data,dies);
        tasquesManteniment.add(tasca);
    }

    /**
     * metode per a completar la tasca de manteniment
     * @param tasca Objecte de tipus TascaManteniment
     */
    public void completarTascaManteniment(TascaManteniment tasca){
        Iterator<TascaManteniment> it=tasquesManteniment.iterator();
        while(it.hasNext()){
            TascaManteniment t=it.next();
            if(t.getNum()==tasca.getNum()){
                tasquesManteniment.remove(t);
            }
        }
    }
    /**
     * metode per a rebre la infmracio de totes les tasuqes de manetniment
     *
     * @return String d'accessos.
     */
    public String llistarTasquesManteniment(){
        Iterator<TascaManteniment> it=tasquesManteniment.iterator();
        String s="";
        while(it.hasNext()){
            TascaManteniment t=it.next();
            s+=t.toString()+"\n";
        }
        if(s.equals("")){
            throw new ExcepcioCamping("vuit");
        }
        return s;
    }

    /**
     * metode per a trobar una tasca de manteniment a la llista segons el seu numero
     * @param num Número d'identificació de la tasca.
     * @return tasca de manteniment
     * @throws ExcepcioCamping
     */
    public TascaManteniment getTascaManteniment(int num)throws ExcepcioCamping {
        Iterator<TascaManteniment> it=tasquesManteniment.iterator();

        while(it.hasNext()){
            TascaManteniment t=it.next();
            if(t.getNum()==num){
                return t;
            }
        }
        throw new ExcepcioCamping("no s'ha trobat la tasca");
    }

}
