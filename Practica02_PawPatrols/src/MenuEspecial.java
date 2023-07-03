import java.util.Hashtable;
import java.util.Iterator;

/**
 *
 * Clase que representa el menu especial con hamburguesas de lujo
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */
public class MenuEspecial {

    /*Hashtable que almacena las hamburguesas*/
    private Hashtable<Integer, Hamburguesa> menu = new Hashtable<>();

    public MenuEspecial() {

        Hamburguesa borisBurguer = new BorisBurguer(1000, "BorisBurguer", "Hamburguesa"
                + "de res acompa�ada de caviar, y sazonada con sal kosher, con quesso cheddar y queso amarillo", 400, true, false);

        Hamburguesa sallyBurguer = new SallyBurguer(1001, "Sally Burguer", "Hamburguesa de res"
                + "acompa�ada con cebolla asada, tiras de tortilla frita y tocino,  con queso cheddar, gouda y Feta", 385, true, false);

        Hamburguesa vodkaBurguer = new VodkaBurguer(1002, "Vodka Burguer", "Hamburguesa de res, marinada con vodka, "
                + "envuelta en tocino y ba�anda en guacamole, con queso cheddar, gouda y Feta", 400, true, false);

        menu.put(1, borisBurguer);
        menu.put(2, sallyBurguer);
        menu.put(3, vodkaBurguer);
    }

    /**
     * Metodo que regresa un objeto de tipo Iterator.
     *
     * @return Iterator.
     *
     */
    public Iterator getIterador() {

        return menu.values().iterator();
    }

}
