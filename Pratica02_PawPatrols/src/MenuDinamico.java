import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * Clase que representa el menu dinamico el cual cambia cada día
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */
public class MenuDinamico {

    /*ArrayList que almacena las hamburguesas*/
    private ArrayList<Hamburguesa> menu = new ArrayList();

    /*Constructor*/
    public MenuDinamico() {

        Hamburguesa canicaBurguer = new CanicaBurguer(3000, "Canica Burguer",
                "Hamburguesa de res con salsa chipotle y bbq, acompa�ada con"
                + " aros de cebolla, queso azul y queso amarillo", 170, true, false);

        Hamburguesa cheetitoBurguer = new CheetitoBurguer(3001, "Cheetito Burguer",
                "Hamburguesa de cerdo, empanizada con cheetos flammin hot, y "
                + "con polvito de cheetos azules, con queso amarillo", 150, true, false);

        Hamburguesa osaBurguer = new OsaBurguer(3002, "Osa Burguer", "Hamburguesa "
                + "vegetariana, con carne de soja, molida con cilantro y especias", 170, false, true);

        menu.add(canicaBurguer);
        menu.add(cheetitoBurguer);
        menu.add(osaBurguer);
    }

    /**
     * Metodo que regresa un objeto de tipo Iterator.
     *
     * @return Iterator.
     *
     */
    public Iterator getIterador() {
        return this.menu.iterator();
    }
}
