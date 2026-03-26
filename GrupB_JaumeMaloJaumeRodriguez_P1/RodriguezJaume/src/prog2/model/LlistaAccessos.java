package prog2.model;

import prog2.vista.ExcepcioCamping;

import java.util.ArrayList;
import java.util.Iterator;

public class LlistaAccessos implements InLlistaAccessos {
    private ArrayList<Acces> llistaAccessos;
    public LlistaAccessos() {
        this.llistaAccessos = new ArrayList<>();
    }
    public String llistarAccessos(boolean operatiu){
        Iterator<Acces> it = this.llistaAccessos.iterator();
        String s="";
        while (it.hasNext()){
            Acces acces = it.next();
            if(acces.getEstat()==(operatiu)){
                s+=acces.toString();
            }
        }
        return s;
    }

    public void afegirAcces(Acces acc){
        llistaAccessos.add(acc);
    }
    public void buidar(){
        llistaAccessos.clear();
    }
    public String llistarAccesos(boolean estat){
        Iterator<Acces> it = llistaAccessos.iterator();
        String s = "";
        Acces a;
        while(it.hasNext()){
            a = it.next();
            if(a.getEstat()==estat) {
                s += a.toString() + "\n";
            }

        }
        return s;
    }

    public void actualitzaEstatAccessos(){
        if(llistaAccessos.size()==0){
            throw new ExcepcioCamping("la llista esta buida");
        }
        String s=";";
        Iterator<Acces> it=llistaAccessos.iterator();
        while(it.hasNext()){
            Acces acc=it.next();
            LlistaAllotjaments llista=acc.getAAllotjaments();
            if(llista.containsAllotjamentOperatiu()){
                acc.obrirAcces();
            }else{
                acc.tancarAcces();
            }
        }
    }
    public String llistarAccessos(String estat){
        if (llistaAccessos.isEmpty()) {
            throw new ExcepcioCamping("Error: La llista d'accessos està buida.");
        }
        boolean estatCerca=estat.equals("Obert");
        String s = "";
        Iterator<Acces> it = llistaAccessos.iterator();
        while (it.hasNext()) {
            Acces acc = it.next();
            if(estatCerca==acc.isAccessibilitat())
            s += it.next().toString() + "\n";
        }
        if(s.isEmpty()){
            throw  new ExcepcioCamping("no hi han accesos amb aquest estat");
        }
        return s;

    }
    public int calculaAccessosNoAccessibles(){
        Iterator<Acces> it = llistaAccessos.iterator();
        int contador=0;
        Acces a;
        while(it.hasNext()){
            a = it.next();
            if(!a.isAccessibilitat()) {
                contador++;
            }

        }
        return contador;
    }
    public float calculaMetresTerra(){
        Iterator<Acces> it = llistaAccessos.iterator();
        float metres=0;
        Acces a;
        while(it.hasNext()){

            a = it.next();
            if(a instanceof AccesTerra){
                metres+=((AccesTerra) a).getMetresQuadrats();
            }

        }
        return metres;
    }

    /**
     * Interfície que defineix les operacions bàsiques d'una llista d'accessos.
     */
    public static interface InLlistaAccessos {

        /**
         * Afegeix un accés rebut per paràmetre a la llista d'accessos.
         * @param acc Objecte de tipus Acces.
         * @throws prog2.vista.ExcepcioCamping Aquest mètode podria llançar una excepció si fos necessari.
         */
        public void afegirAcces(Acces acc) throws ExcepcioCamping;

        /**
         * Buida la llista d'accessos
         */
         public void buidar();

         /**
         * Itera sobre la llista d'accessos i retorna un String amb la informació de tots els accessos amb l'estat rebut per paràmetre.
         * En cas que no hi hagi accessos en l'estat passat com a paràmetre llança una excepció.
         * @param estat boolean
         * @return String
         * @throws ExcepcioCamping Aquest mètode llança una excepció en cas que no hi hagi accessos en l'estat passat com a parametre.
         *
         */
         public String llistarAccessos(boolean estat) throws ExcepcioCamping;

         /**
          * Recorre tota la llista d'accessos i els tanca. Només decidirà obrir cadascun d'ells si permet l'accés a algun allotjament operatiu.
         * @throws ExcepcioCamping Aquest mètode podria llançar una excepció si fos necessari.
          */
         public void actualitzaEstatAccessos() throws ExcepcioCamping;

         /**
         * Itera sobre la llista d'accessos i retorna el número d'accessos sense accessibilitat.
         * @return int
         * @throws ExcepcioCamping Aquest mètode podria llançar una excepció si fos necessari.
         */
         public int calculaAccessosNoAccessibles() throws ExcepcioCamping;

         /**
         * Itera sobre la llista d'accessos, i pels accessos de terra suma el total de metres (longitud) i ho retorna.
         * @return float amb els metres totals.
         * @throws ExcepcioCamping Aquest mètode podria llançar una excepció si fos necessari.
         */
         public float calculaMetresTerra() throws ExcepcioCamping;
    }
}
