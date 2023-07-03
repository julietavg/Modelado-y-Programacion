
import java.util.Scanner;
/**
 * Clase Main
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */

public class Main {

    public static void main(String[] args) {
        Robot chefcito = new Robot();

        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("\t*** Bienvenido a McBurguesas *** \n"
                + "\t Eliga una opción.");
        try {

            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        do {
            System.out.println(
                    "1.- Activar.\n"
                    + "2.- Caminar.\n"
                    + "3.- Atender.\n"
                    + "4.- Cocinar.\n"
                    + "5.- Apagar.\n"
                    + "0.- SALIR.\n");

            while (true) {
                try {
                    String opcionUsuario = sc.nextLine();
                    opcion = Integer.parseInt(opcionUsuario);
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println(" Escoga una opción valida "
                            + "que deseas ejecutar.\n"
                            + "1.- Activar.\n"
                            + "2.- Caminar.\n"
                            + "3.- Atender.\n"
                            + "4.- Cocinar.\n"
                            + "5.- Apagar.\n"
                            + "0.- SALIR.\n");
                }
            }

            switch (opcion) {
                case 1:
                    chefcito.activar();
                    break;

                case 2:
                    chefcito.caminar();
                    break;

                case 3:
                    chefcito.atendiendo();
                    break;

                case 4:
                    chefcito.cocinando();
                    break;

                case 5:
                    chefcito.suspender();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("\n Opción no disponible.");
                    break;

            }

        } while (opcion != 0);

    }
}
