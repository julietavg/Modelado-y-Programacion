
import java.util.ArrayList;
/** 
 * Clase que representa un usario
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */

public class Usuario implements IProxy {

    /** Atrubutos del usuario */
    private String usuario, contrasena, direccion;
    private String tarjetaBancaria, cvc;
    
    RegistrarseControlador registro = new RegistrarseControlador();

    /**
     * Constructor de un Usuario
     *
     * @param usuario usuario
     * @param contrasena contrasena del usuario
     * @param direccion direccion de origen
     * @param tarjetaBancaria pais de procedencia
     * @param cvc codigo de seguridad de la tarjeta
     * @param saldo del usuario
     */
    public Usuario(String usuario, String contrasena, String direccion, String tarjetaBancaria, String cvc) {

        this.usuario = usuario;
        this.contrasena = contrasena;
        this.direccion = direccion;
        this.tarjetaBancaria = tarjetaBancaria;
        this.cvc = cvc;

    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTarjetaBancaria() {
        return tarjetaBancaria;
    }

    public String getCVC() {
        return cvc;
    }
    
    @Override
    public boolean compraSegura(String cvc, ArrayList<Usuario> lista, String usuario) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCVC().equals(cvc) && usuario.equalsIgnoreCase(registro.getUsuarioIngreso())) {
                return true;
            }
        }
        return false;
    }
}

