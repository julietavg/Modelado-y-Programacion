
/**
 *
 * Clase que representa la hamburguesa Chetito
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */

public class CheetitoBurguer extends Hamburguesa {

    public CheetitoBurguer(int id, String nombre, String descripcion, int precio, boolean tieneQueso,
            boolean esVegetariana) {
        super(id, nombre, descripcion, precio, tieneQueso, esVegetariana);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void preparandoCarne() {

        System.out.println("Preparando carne de cerdo, empanizada con cheetos flammin hot, polvito de cheetos "
                + "azules...");
    }

    @Override
    public void ponerQueso() {

        if (tieneQueso == false) {
            System.out.println("No poniendo queso...");
        } else {
            System.out.println("Poniendo queso amarillo...");
        }
    }

}
