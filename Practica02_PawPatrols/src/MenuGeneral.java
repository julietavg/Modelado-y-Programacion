
import java.util.Iterator;

/**
 *
 * Clase que representa el menu general que siempre puede servirse en cualquier
 * día del año
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */

public class MenuGeneral implements Iterable {

    @Override
    public Iterator iterator() {
        return new IteradorGeneral();
    }

    /**
     * Clase interna que itera los elementos del arreglo platillos.
     */
    protected class IteradorGeneral implements Iterator {

        /* Indica donde se encuentra el iterador */
        int indice = 0;

        /**
         * Método que se asegura de que haya un elemento siguiente en el arreglo
         * de platillos.
         *
         * @return boolean Elemento siguiente.
         */
        public boolean hasNext() {
            if (this.indice < menu.length) {
                return true;
            }
            return false;
        }

        /**
         * Método que devuelve los elementos del arreglo platillos.
         *
         * @return plato Tipo de hamburguesa.
         */
        public Hamburguesa next() {
            Hamburguesa plato = menu[indice];
            this.indice++;
            return plato;
        }
    }


    /*Arreglo que almacena las hamburguesas*/
    private Hamburguesa[] menu = new Hamburguesa[3];

    /*Constructor*/
    public MenuGeneral() {

        Hamburguesa dominoBurguer = new DominoBurguer(2000, "DominoBurguer",
                "Hamburguesa de res, con trozos de champi�ones, esparragos y "
                + "aros de cebolla, con queso cheddar", 150, true, false);

        Hamburguesa fishBurguer = new FishBurguer(2001, "FishBurguer",
                "Hamburguesa de pescado, sazonada con limon, ajo, acompa�ada con "
                + "cebolla asada y camaron", 180, false, false);

        Hamburguesa veggieBurguer = new VeggieBurguer(2002, "VeggieBurguer",
                "Hamburguesa vegetariana, con carne de soja, sazonada con limon"
                + "chipotle acompanada con germen", 180, false, true);

        menu[0] = dominoBurguer;
        menu[1] = fishBurguer;
        menu[2] = veggieBurguer;
    }

    /**
     * /**
     * Método iterator que devuelve un iterador para este menú.
     *
     * @return IteradorGeneral - Iterador del menú
     */
    public IteradorGeneral getIterador() {
        return new IteradorGeneral();
    }

}
