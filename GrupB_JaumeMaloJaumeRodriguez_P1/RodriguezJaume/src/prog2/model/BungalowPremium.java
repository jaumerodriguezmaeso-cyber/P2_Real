
        package prog2.model;

/**
 * @author Jaume Rodriguez i Jaume Malo
 *
 * Classe BungalowPremium que representa un tipus avançat de bungalow dins d'un camping.
 * Aquesta classe hereta de Bungalow i afegeix funcionalitats exclusives com serveis extra
 * i connexió WiFi.
 */
public class BungalowPremium extends Bungalow {

    /**
     * Atributs de la classe BungalowPremium.
     * codi d'accés a la xarxa WiFi.
     * indica si disposa de serveis extra.
     */
    private String codiWifi;
    private boolean serveixExtra;

    /**
     * Constructor per inicialitzar un nou BungalowPremium.
     *
     * @param nom nom del bungalow.
     * @param id identificador únic del bungalow.
     * @param estat estat del bungalow.
     * @param iluminacio nivell d'il·luminació.
     * @param mida mida del bungalow.
     * @param numHabitacions nombre d'habitacions.
     * @param placesPersones nombre de places per a persones.
     * @param placesParquing nombre de places de pàrquing.
     * @param terrassa indica si té terrassa.
     * @param tv indica si té televisió.
     * @param aireFred indica si té aire fred.
     * @param serveisExtra indica si disposa de serveis extra.
     * @param codiWifi codi d'accés WiFi.
     */
    public BungalowPremium(String nom, String id, boolean estat, String iluminacio, float mida, int numHabitacions, int placesPersones,
                           int placesParquing, boolean terrassa, boolean tv, boolean aireFred, boolean serveisExtra, String codiWifi) {

        super(nom, id, estat, iluminacio, mida, numHabitacions, placesPersones,
                placesParquing, terrassa, tv, aireFred);

        this.serveixExtra = serveisExtra;
        this.codiWifi = codiWifi;
    }

    /**
     * Implementació del metode correcteFuncionament.
     * Comprova si el bungalow premium està operatiu.
     *
     * @return true si està operatiu, false en cas contrari.
     */
    public boolean correcteFuncionament() {
        return this.isOperatiu();
    }
}