package prog2.model;

import prog2.vista.Menu;

public class VistaCamping {
    private Camping camping;
    static private String[] descMenuPrincipal={"Primera opció del menú principal",
            "Segona opció del menú principal",
            "Obre un menú secundari",
            "Sortir de l'aplicació"};
    public VistaCamping(String nom) {
        camping = new Camping(nom);
        camping.inicialitzaDadesCamping();
    }

    public void gestioCamping() {
        Menu menu = new Menu("menu", descMenuPrincipal);


    }
}
