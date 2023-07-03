
import java.util.ArrayList;

/**
 * Clase que representa un usuario proxy
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */

public class UsuarioProxy implements IProxy {

    private Usuario usuarioReal;

    /**
     * Constructor de un usario proxy
     * @param usuarioReal de tipo usuario
     */
    public UsuarioProxy(Usuario usuarioReal) {
        this.usuarioReal = usuarioReal;
    }

    @Override
    public boolean compraSegura(String cvc, ArrayList<Usuario> lista, String usuario) {
        return usuarioReal.compraSegura(cvc, lista, usuario);
    }

}
