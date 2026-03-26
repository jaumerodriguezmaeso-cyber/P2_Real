package prog2.model;

import prog2.vista.ExcepcioCamping;

import java.util.ArrayList;
import java.util.Iterator;

public class LlistaAllotjaments implements InLlistaAllotjaments{

    private ArrayList<Allotjament> llistaAllotjaments;
    public LlistaAllotjaments(){
        llistaAllotjaments = new ArrayList<>();
    }
    public void afegirAllotjament(Allotjament allotjament){
        if(llistaAllotjaments.contains(allotjament)){
            throw new ExcepcioCamping("Error: L'allotjament amb ID " + allotjament.getId() + " ja existeix.");
        }
        llistaAllotjaments.add(allotjament);
    }
    public void buidar(){
        llistaAllotjaments.clear();
    }
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
    public boolean containsAllotjamentOperatiu(){
        Iterator<Allotjament> it = llistaAllotjaments.iterator();
        while(it.hasNext()){
            if(it.next().isOperatiu()){}
                return true;
        }
        return false;
    }
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
    public Allotjament getAllotjament(String id){
        Iterator<Allotjament> it = llistaAllotjaments.iterator();
        Allotjament a;
        while(it.hasNext()){
            a = it.next();
            if(a.getId().equals(id)) {
                return a;
            }

        }
        //falta llençar una excepcio
        return null;
    }

}
