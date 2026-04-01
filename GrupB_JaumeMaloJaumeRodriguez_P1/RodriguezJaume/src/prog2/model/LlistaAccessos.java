package prog2.model;

import prog2.vista.ExcepcioCamping;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * @authors Jaume Rodriguez i Jaume Malo
 *
 *Classe abstracta que implementa una llista d'accessos per a arribar a un allotjament dins d'un camping
 *Aquesta classe gestiona una llista de els allotjaments als que es pot arribar desde cada acces.
 *
 */
public class LlistaAccessos implements InLlistaAccessos {
    private ArrayList<Acces> llistaAccessos;

    /**
     * Constructor de la llista de accessos
     */
    public LlistaAccessos() {
        this.llistaAccessos = new ArrayList<>();
    }

    /**
     * metode per a rebre la infmracio de tots els accessos amb un estat concret
     * @param operatiu boolean
     * @return String d'accessos.
     */
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

    /**
     * metode per a afegir un acces a la llista
     * @param acc Objecte de tipus Acces.
     */
    public void afegirAcces(Acces acc){
        llistaAccessos.add(acc);
    }

    /**
     * metode per a buidar la llista
     */
    public void buidar(){
        llistaAccessos.clear();
    }

    /**
     * Metode per a actualitzar els accessos.
     */

    public void actualitzaEstatAccessos(){
        if(llistaAccessos.size()==0){
            throw new ExcepcioCamping("la llista esta buida");
        }

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

    /**
     * metode per a calcular le nuumero de accesos als que no es pot accedir
     * @return numero d'accessos no accesibles
     */
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

    /**
     * metode per a calcular els metres de terra
     * @return els metres de terra
     */
    public float calculaMetresTerra(){
        Iterator<Acces> it = llistaAccessos.iterator();
        float metres=0;
        Acces a;
        while(it.hasNext()){

            a = it.next();
            if(a instanceof AccesTerra){
                if(a instanceof CarreteraTerra){
                    metres+=((CarreteraTerra) a).getMetresQuadrats();
                }


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
