package prog2.model;
import prog2.vista.ExcepcioCamping;
import prog2.vista.ExcepcioReserva;

import java.io.*;
import java.sql.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class Camping implements InCamping, Serializable {
    //atributs
    private String nom;

    private LlistaAllotjaments llistaAllotjaments;
    private LlistaAccessos llistaAccessos;
    private LlistaTasquesManteniment llistaTasquesManteniment;


    //constructor
    public Camping(String nom){
        this.nom=nom;
        this.llistaAllotjaments = new LlistaAllotjaments();
        this.llistaAccessos = new LlistaAccessos();
        this.llistaTasquesManteniment = new LlistaTasquesManteniment();
        inicialitzaDadesCamping();

    }
    //getters i setters per a accedir a els atributs
    public String getNomCamping(){
        return nom;
    }
    public String llistarAllotjaments(String estat){
        return llistaAllotjaments.llistarAllotjaments(estat);
    }
    public String llistarAccessos(String infoEstat){
        return llistaAccessos.llistarAccessos(infoEstat);
    }
    public String llistarTasquesManteniment(){
        return llistaTasquesManteniment.llistarTasquesManteniment();
    }
    public void afegirTascaManteniment(int num, String tipus, String idAllotjament, String data, int dies){
        Allotjament allotjament = llistaAllotjaments.getAllotjament(idAllotjament);
        TascaManteniment nova=new TascaManteniment(num,tipus,allotjament,data,dies);
        llistaTasquesManteniment.afegirTascaManteniment(num,tipus,allotjament,data,dies);
        allotjament.tancarAllotjament(nova);
    }

    public void completarTascaManteniment(int num){
        Iterator<TascaManteniment> it=this.llistaTasquesManteniment.llistarTasquesManteniment();
        boolean trobada = false;
        while (it.hasNext()) {
            TascaManteniment t = it.next();

            if (t.getNum()==num) {
                it.remove();
                trobada = true;

            }
        }

        if (!trobada) {
            throw new ExcepcioCamping("No s'ha trobat cap tasca amb aquest numero");
        }
    }
    public int calculaAccessosNoAccessibles(){
        return llistaAccessos.calculaAccessosNoAccessibles();
    }
    public float calculaMetresTerra(){
        return llistaAccessos.calculaMetresTerra();
    }
    public void save(String camiDesti){
        FileOutputStream fout;
        ObjectOutputStream oos;
        try {
            fout = new FileOutputStream(camiDesti);
            oos = new ObjectOutputStream(fout);
            oos.writeObject(this);

        } catch (java.io.IOException e) {
            throw new ExcepcioCamping("Error en guardar les dades al fitxer: " + camiDesti);
        }
    }
    public static Camping load(String camiOrigen) throws ExcepcioCamping {
        FileInputStream fin=null;
        ObjectInputStream ois=null;
        Camping camping=null;
        try{
            fin=new FileInputStream(camiOrigen);
            ois=new ObjectInputStream(fin);
            camping=(Camping)ois.readObject();

        }catch(Exception e){
            throw new ExcepcioCamping("error en agafar les daddes");
        }finally{
            try {
                if (ois != null) {
                    ois.close();
                }
                if (fin != null) {
                    fin.close();
                }
            } catch (java.io.IOException e2) {
                throw new ExcepcioCamping("error en agafar les daddes");
            }
        }
        return camping;
    }
    public void inicialitzaDadesCamping(){
        /*try {
            // 1. CREAR ALOJAMIENTOS (Ejemplos, añade los 6)
            Allotjament all1 = new Bungalow("Bungalow Premium", "ALL1", ); // Pon los parámetros de tu constructor
            llistaAllotjaments.afegirAllotjament(all1);
            // ... añade ALL2, ALL3, ALL4, ALL5, ALL6 ...

            // 2. CREAR ACCESOS (A1 al A12)
            // Carreteras de Asfalto (A1 a A6 suelen ser las principales)
            Acces a1 = new CarreteraAsfalt("A1", 5.5);
            llistaAccessos.afegirAcces(a1);
            // ... añade el resto ...

            // 3. CONECTAR (Vincular según el mapa)
            // Ejemplo: El acceso A1 sirve al alojamiento ALL1
            a1.getLlistaAllotjaments().afegirAllotjament(all1);

            // El acceso A9 (Cami Terra) sirve a ALL1 y ALL2
            Acces a9 = llistaAccessos.getAcces("A9");
            a9.getLlistaAllotjaments().afegirAllotjament(all1);
            a9.getLlistaAllotjaments().afegirAllotjament(llistaAllotjaments.getAllotjament("ALL2"));

        } catch (ExcepcioCamping e) {
            System.err.println("Error inicialitzant el mapa: " + e.getMessage());
        }*/
    }

}
