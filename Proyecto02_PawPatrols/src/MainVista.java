import java.util.Scanner;

/** 
 * Clase que representa la vista del main
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */
public class MainVista {
  
  /**
   * Metodo que le permite escoger al usuario una opción para ver que sucursal desea
   * @return opcion del usuario
   */
  public int inicioSimulacion() {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Bienvenido a la agencia de coches\n" + "Contamos con tres sucursales distintas\n"
                + "\tCuál te gustaría escoger?\n" + "1. Mexico \n2. Argentina\n3. Canada\n4. Salir \n");
       int opcion = Integer.parseInt(scan.nextLine());
       return (opcion);
    }   
}
