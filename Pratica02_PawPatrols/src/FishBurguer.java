
/**
 *
 * Clase que representa la hamburguesa Fish
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */
public class FishBurguer extends Hamburguesa {

    public FishBurguer(int id, String nombre, String descripcion, int precio, boolean tieneQueso,
            boolean esVegetariana) {

        super(id, nombre, descripcion, precio, tieneQueso, esVegetariana);
    }

    @Override
    public void preparandoCarne() {

        System.out.println("Preparando carne de filete de pescado"
                + ", con limon, sazonada con ajo, cebolla asada, con trozos de camaron...");
    }

    @Override
    public void ponerQueso() {

        if (tieneQueso == false) {
            System.out.println("No poniendo queso...");
        } else {
            System.out.println("Poniendo queso...");
        }
    }
}
