package prog2.model;

public class Parcela extends Allotjament {
    //atributs
    private double metresQuadrats;
    private boolean conexioElectrica;

    //constructor
    public Parcela(String nom, String id,boolean conexioElectrica,String iluminacio,double metresQuadrats, boolean estat){
        super(nom,id );
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
