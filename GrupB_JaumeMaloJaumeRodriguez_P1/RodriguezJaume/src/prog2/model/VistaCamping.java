package prog2.model;

import prog2.vista.Menu;

import java.util.Scanner;

public class VistaCamping {
    private Camping camping;
    public enum OpcionsMenu {
        LLISTAR_TOTS_ALLOTJAMENTS,
        LLISTAR_ALLOTJAMENTS_OPERATIUS,
        LLISTAR_ALLOTJAMENTS_NO_OPERATIUS,
        LLISTAR_ACCESSOS_OBERTS,
        LLISTAR_ACCESSOS_TANCATS,
        LLISTAR_TASQUES_MANTENIMENT_ACTIVES,
        AFEGIR_TASCA_MANTENIMENT,
        COMPLETAR_TASCA_MANTENIMENT,
        CALCULAR_ACCESSOS_SENSE_VEHICLE,
        CALCULAR_METRES_TERRA,
        GUARDAR_CAMPING,
        RECUPERAR_CAMPING,
        SORTIR
    }

    private String nomCamping;
    public VistaCamping(String nom) {
        nomCamping = nom;
        camping = new Camping(nom);
        camping.inicialitzaDadesCamping();
    }

    public void gestioCamping() {
        Scanner sc = new Scanner(System.in);
        OpcionsMenu[] opcions = OpcionsMenu.values();
        Menu<OpcionsMenu> menu = new Menu<>("GESTIÓ CÀMPING GREEN", opcions);
        String[] descripcions = {
                "Llistar la informació de tots els allotjaments",
                "Llistar la informació dels allotjaments operatius",
                "Llistar la informació dels allotjaments no operatius",
                "Llistar la informació dels accessos oberts",
                "Llistar la informació dels accessos tancats",
                "Llistar la informació de les tasques de manteniment actives",
                "Afegir una tasca de manteniment",
                "Completar una tasca de manteniment",
                "Accessos que NO proporcionen accessibilitat amb vehicle",
                "Total de metres dels accessos de terra",
                "Guardar dades del càmping en un fitxer",
                "Recuperar dades del càmping des d'un fitxer",
                "Sortir de l'aplicació"
        };
        menu.setDescripcions(descripcions);
        OpcionsMenu opcio;
        //opcio per defecte, el usuari la modifica;
        opcio=OpcionsMenu.LLISTAR_ACCESSOS_TANCATS;
        while(opcio!=OpcionsMenu.SORTIR){
            menu.mostrarMenu();
            menu.getOpcio(sc);
            switch(opcio){
                case LLISTAR_TOTS_ALLOTJAMENTS:
                    camping.llistarAllotjaments("operatius");
                    camping.llistarAllotjaments("no operatius");
                    break;
                case LLISTAR_ALLOTJAMENTS_OPERATIUS:
                    camping.llistarAllotjaments("operatius");
                    break;
                case LLISTAR_ALLOTJAMENTS_NO_OPERATIUS:
                    camping.llistarAllotjaments("no_operatius");
                    break;
                case LLISTAR_ACCESSOS_OBERTS:
                    camping.llistarAccessos("oberts");
                    break;

                case LLISTAR_ACCESSOS_TANCATS:
                    camping.llistarAccessos("tancats");
                    break;
                case LLISTAR_TASQUES_MANTENIMENT_ACTIVES:
                    camping.llistarTasquesManteniment();
                    break;

                case AFEGIR_TASCA_MANTENIMENT:
                    // Aquí pides: nº tasca, nom allotjament, tipus, data i dies
                    System.out.println("digues el numero de tasca, el id de allotjament, tipus de tasca, data i dies");
                    int num=sc.nextInt();
                    String id=sc.next();
                    String tipus=sc.next();
                    String data=sc.next();
                    int dies=sc.nextInt();
                    camping.afegirTascaManteniment(num,tipus,id,data,dies);
                    break;
                case COMPLETAR_TASCA_MANTENIMENT:
                    System.out.println("Digues el numero de tasca completada:");
                    int tasca=sc.nextInt();
                    camping.completarTascaManteniment(tasca);
                    break;
                case CALCULAR_METRES_TERRA:
                    camping.calculaMetresTerra();

                    break;

                case CALCULAR_ACCESSOS_SENSE_VEHICLE:
                    camping.calculaAccessosNoAccessibles();
                    break;
                case GUARDAR_CAMPING:
                    System.out.println("digues el cami de desti");;
                    String cami=sc.next();
                    camping.save(cami);
                    break;
                case RECUPERAR_CAMPING:
                    System.out.println("digues el cami de origen");
                    String origen=sc.next();
                    camping.load(origen);
                case SORTIR:
                    System.out.println("Fins la propera!");
                    break;
                default:
                    break;
            }
            }
        }

    }


