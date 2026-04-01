package prog2.vista;
/**
 * @author Jaume Rodriguez i Jaume Malo
 *
 *Classe que implementa el tipus d'excepcions que llençar en aquest projecte.
 */
public class ExcepcioCamping extends RuntimeException {
    public ExcepcioCamping(String message) {
        super(message);
    }
}
