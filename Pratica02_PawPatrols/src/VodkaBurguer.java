
/**
 *
 * Clase que representa la hamburguesa Vodka
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */
public class VodkaBurguer extends Hamburguesa {

    public VodkaBurguer(int id, String nombre, String descripcion, int precio, boolean tieneQueso,
            boolean esVegetariana) {
        super(id, nombre, descripcion, precio, tieneQueso, esVegetariana);
    }

    @Override
    public void preparandoCarne() {

        System.out.println("Preparando carne marinada con vodka, envolviendola con tocino y poniendo guacamole...");
    }

    @Override
    public void ponerQueso() {

        if (tieneQueso == false) {
            System.out.println("No poniendo queso");
        } else {
            System.out.println("Poniendo queso cheddar, gouda, y feta...");
        }
    }
}
