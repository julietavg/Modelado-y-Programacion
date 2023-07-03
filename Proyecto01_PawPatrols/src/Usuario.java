
import java.util.ArrayList;

public class Usuario implements IProxy {

    /**   Atributos   */
    
    Main ingreso = new Main();

    private String nombreUsuario, contrasena, nombre, direccion, paisOrigen,cuentaBancaria, telefono;
    
     /**
     * Constructor de un Usuario
     * @param nombreUsuario usuario
     * @param contrase�a contrase�a del usuario
     * @param nombre nombre del cliente
     * @param direccion direccion de origen
     * @param paisOrigen pais de procedencia
     * @param telefono telefono del usuario
     * @param cuentaBancaria cuenta bancaria del usuario
     */
    public Usuario(String nombreUsuario,String contrasena,String nombre,
            String direccion ,String paisOrigen, String telefono,String cuentaBancaria) {

        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.direccion = direccion;
        this.paisOrigen = paisOrigen;
        this.telefono = telefono;
        this.cuentaBancaria = cuentaBancaria;

    }

    
    /*Getters*/
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    @Override
       public boolean compraSegura(String cuentaBancaria, ArrayList<Usuario> lista,String usuario){
          for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCuentaBancaria().equals(cuentaBancaria) && usuario.equalsIgnoreCase(ingreso.getUsuarioIngreso())) {
                return true;
            }
        }
        return false;
    }
}