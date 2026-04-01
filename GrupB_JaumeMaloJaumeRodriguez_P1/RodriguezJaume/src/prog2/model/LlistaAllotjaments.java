package prog2.model;

import prog2.vista.ExcepcioCamping;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * @author Jaume Rodriguez i Jaume Malo
 *
 *Classe concreta que gestiona una llista polimorfica d'allotjaments de tot tipus.
 */
public class LlistaAllotjaments implements InLlistaAllotjaments{

    private ArrayList<Allotjament> llistaAllotjaments;
    /**
     * Constructor de la llista de allotjaments
     */
    public LlistaAllotjaments(){
        llistaAllotjaments = new ArrayList<>();
    }
    /**
     * metode per a afegir un allotjament a la llista
     * @param allotjament Objecte de tipus allotjament.
     */
    public void afegirAllotjament(Allotjament allotjament){
        if(llistaAllotjaments.contains(allotjament)){
            throw new ExcepcioCamping("Error: L'allotjament amb ID " + allotjament.getId() + " ja existeix.");
        }
        llistaAllotjaments.add(allotjament);
    }
    /**
     * metode per a buidar la llista
     */
    public void buidar(){
        llistaAllotjaments.clear();
    }
    /**
     * metode per a rebre la infmracio de tots els allotjaments amb un estat concret
     * @param estat
     * @return String d'allotjaments.
     */
    public String llistarAllotjaments(String estat){
        Iterator<Allotjament> it = llistaAllotjaments.iterator();
        String s = "";
        Allotjament a;
        while(it.hasNext()){
            a = it.next();
            if(a.isOperatiu()==estat.equals("operatiu")){
                s += a.toString()+"\n";
            }


        }
        if (s.isEmpty()) {
            throw new ExcepcioCamping("No s'han trobat allotjaments amb l'estat: " + estat);
        }
        return s;
    }

    /**
     * metode per a veure si hi han allotjaments operatius en la llista
     * @return boolean contains
     */
    public boolean containsAllotjamentOperatiu(){
        Iterator<Allotjament> it = llistaAllotjaments.iterator();
        while(it.hasNext()){
            if(it.next().isOperatiu()){}
                return true;
        }
        return false;
    }

    /**
     * metode per a veure si una llotjament passat per parametre esta en la llista
     * @param allotjament
     * @return boolean contains
     */
    public boolean contains(Allotjament allotjament){
        Iterator<Allotjament> it = llistaAllotjaments.iterator();
        Allotjament a;
        while(it.hasNext()){
            a = it.next();
            if(a.getId().equals(allotjament.getId())) {
                return true;
            }

        }
        return false;
    }

    /**
     * metode per a trobar un allotjament segons el seu id
     * @param id String amb el id de l'allotjament
     * @return allotjament
     */
    public Allotjament getAllotjament(String id) throws ExcepcioCamping{
        Iterator<Allotjament> it = llistaAllotjaments.iterator();
        Allotjament a;
        while(it.hasNext()){
            a = it.next();
            if(a.getId().equals(id)) {
                return a;
            }

        }
        throw new ExcepcioCamping("no s'ha trobat el id");

    }

}
