package prog2.model;
/**
 * @author Jaume Rodriguez i Jaume Malo
 *
 *Classe concreta que hereda de Acces Terra.
 *Aquesta classe crea l'objecte.
 *
 */
public class CamiTerra extends AccesTerra{

    /**
     * Constructor de la classe Cami Terra.
     * @param nom, rep el nom de l'Acces
     * @param longitud, rep la mesura de l'acces
     * @param accesibilitat, rep l'estat
     */
    public CamiTerra(String nom,boolean accesibilitat, float longitud){
        super(nom,longitud,accesibilitat);
    }
    /**
     * metode per a accedir a la accesibilitat de l'acces
     * @return accesibilitat
     */
    public boolean isAccessibilitat(){
        return super.isAccessibilitat();
    }
    /**
     * metode per a veure la informacio de l'acces.
     * @return la informacio de l'acces
     */
    public String toString() {
        return super.toString();
    }
}