package prog2.model;

public class Client implements InClient{
    //atributs
    String nom;
    String Dni;
    public Client(String nom,String Dni){
        this.nom=nom;
        this.Dni=Dni;
    }
    //getters i setters
    public String getNom(){
        return nom;
    }

    public String getDni(){
        return Dni;
    }

    public void setNom(String nom){
        this.nom=nom;
    }

    public void setDni(String dni){
        this.Dni=dni;
    }
    public String toString() {
        return nom + " amb DNI: " + Dni+". ";
    }
}
