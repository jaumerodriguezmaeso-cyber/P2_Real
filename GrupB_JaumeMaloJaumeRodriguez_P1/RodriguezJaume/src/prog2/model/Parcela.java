package prog2.model;
/**
 * @author Jaume Rodriguez i Jaume Malo
 *
 *Classe concreta que hereda de Allotjament i implementa un espai en el que poder passar l'estancia.
 *Aquesta classe gestiona el correcte funcionament del bungalow i els seus atributs
 */
public class Parcela extends Allotjament {
    //atributs
    private double metresQuadrats;
    private boolean conexioElectrica;



    //constructor
    public Parcela(String nom, String id,boolean estat,String iluminacio,double metresQuadrats, boolean connexioElectrica) {
        super(nom,id,4,2 );
        this.metresQuadrats=metresQuadrats;
        this.conexioElectrica=conexioElectrica;



    }

    //getters i setters
    public double getMetresQuadrats() {
        return metresQuadrats;
    }
    public void setMetresQuadrats(double metresQuadrats) {
        this.metresQuadrats = metresQuadrats;
    }
    public boolean getConexioElextrica(){
        return conexioElectrica;
    }
    public void setConexioElextrica(boolean conexioElectrica){
        this.conexioElectrica = conexioElectrica;
    }


    public boolean correcteFuncionament(){
        return this.isOperatiu();
    }
    public String toString(){
        return super.toString()+" MetresQuadrats: "+metresQuadrats;
    }

}
