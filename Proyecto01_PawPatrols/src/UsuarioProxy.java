import java.util.ArrayList;

public class UsuarioProxy implements IProxy {

    private Usuario usuarioReal;

    /**
     * Constructor
     *
     * @param usuarioReal
     */
    public UsuarioProxy(Usuario usuarioReal) {
        this.usuarioReal = usuarioReal;
    }

    @Override
    public boolean compraSegura(String cuentaBancaria, ArrayList<Usuario> lista, String usuario) {
        return usuarioReal.compraSegura(cuentaBancaria, lista, usuario);
    }

}
