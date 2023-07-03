
import java.util.ArrayList;

/**
 * Interfaz que representa un proxy que realiza la compra segura
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */
public interface IProxy {

    /**
     * Metodo para realizar la compra segura dentro de la tienda
     * @return true si los datos de compra coinciden con la base de datos.
     */
    public boolean compraSegura(String cvc, ArrayList<Usuario> lista, String usuario);
}
