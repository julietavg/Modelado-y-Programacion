
/** 
 * Clase main
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */
public class Main {

    /** Booleanos si el usuario escoge armar un coche o escoger uno*/
    public static boolean armarCarro = false, autosPrefabricados = false;
   
    
    static MainVista vista = new MainVista();
    /**ditto para strategy */
    static Pais ditto = new Pais();

    public static void inicio() {
        while (true) {
            try {
                while (true) {
                    switch (vista.inicioSimulacion()) {
                        case 1:
                            ditto.setSucursal(new MexicoControlador());
                            ditto.sucursal();
                            inicio();
                            break;
                        case 2:
                            ditto.setSucursal(new ArgentinaControlador());
                            ditto.sucursal();
                            inicio();
                            break;
                        case 3:
                            ditto.setSucursal(new CanadaControlador());
                            ditto.sucursal();
                            inicio();
                            break;
                        case 4:
                            return;
                        default:
                            System.out.println("Escoge una opcion valida");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("\n\tTypea una entrada valida!");

            }
        }
    }

    public static void main(String[] args) {
        inicio();

    }      

}
