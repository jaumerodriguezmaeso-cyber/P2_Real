package prog2.model;

public abstract class Allotjament implements Allotjament.InAllotjament {
    private String nom;
    private String id;
    private long estadaMinimaAlta;
    private long estadaMinimaBaixa;
    private String operatiu;
    private String illuminacio;

    public Allotjament(String nom, String id){
        this.nom=nom;
        this.id = id;
        this.operatiu="operatiu";
        this.illuminacio="100%";
    }
    public String getOperatiu(){
        return this.operatiu;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public long getEstadaMinima(Temp temp) {
        if(temp==Temp.ALTA){
            return estadaMinimaAlta;
        }
        else{
            return estadaMinimaBaixa;
        }
    }

    public void setEstadaMinima(long estadaMinimaALTA_, long estadaMinimaBAIXA_) {
        this.estadaMinimaAlta = estadaMinimaALTA_;
        this.estadaMinimaBaixa= estadaMinimaBAIXA_;
    }
    public void tancarAllotjament(TascaManteniment tasca){
        this.operatiu="no operatiu";
        this.illuminacio=tasca.getIluminacioAllotjament();
    }
    public void obrirAllotjament(){
        operatiu="Operatiu";
        illuminacio="100%";
    }


    /**
     * Interfície que defineix les operacions bàsiques per als allotjaments.
     */
    public static interface InAllotjament {

        /**
         * Obté el nom de l'allotjament.
         * @return el nom de l'allotjament.
         */
        String getNom();

        /**
         * Estableix el nom de l'allotjament.
         * @param nom el nom a assignar.
         */
        void setNom(String nom);

        /**
         * Obté l'identificador únic de l'allotjament.
         * @return l'identificador únic de l'allotjament.
         */
        String getId();

        /**
         * Estableix l'identificador únic de l'allotjament.
         * @param id l'identificador a assignar.
         */
        void setId(String id);

        /**
         * Obté l'estada mínima segons la temporada.
         * @param temp la temporada (ALTA o BAIXA).
         * @return el valor de l'estada mínima per a la temporada indicada.
         */
        long getEstadaMinima(Temp temp);

        /**
         * Estableix l'estada mínima per a cada temporada.
         * @param estadaMinimaALTA_ l'estada mínima en temporada alta.
         * @param estadaMinimaBAIXA_ l'estada mínima en temporada baixa.
         */
        void setEstadaMinima(long estadaMinimaALTA_, long estadaMinimaBAIXA_);

        /**
         * Enumeració que representa les diferents temporades possibles.
         */
        public enum Temp {
            ALTA,
            BAIXA
        }

        /**
         * Modifica l'estat de l'allotjament a No Operatiu i la il·luminació depenent de la tasca rebuda com a paràmetre
         * @param tasca Objecte de tipus TascaManteniment.
         */
        public void tancarAllotjament(TascaManteniment tasca);

        /**
         * Modifica l'estat de l'allotjament a Operatiu i la il·luminació al 100%
         */
        public void obrirAllotjament();
    }
}
