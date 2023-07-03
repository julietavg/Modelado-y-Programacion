
import java.util.LinkedList;

/**
 * Interfaz Sujeto que realiza las acciones de las empresas
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutierrez Julieta 318341945
 * @since Modelado y Programaci�n 2022-2
 *
 */
public interface Sujeto {

    /**
     * Metodo para regresar el nombre de la empresa
     *
     * @return nombre de la empresa
     */
    public String getNombre();

    /**
     * Metodo para regresar el nombre del cliente
     *
     * @param nombre del cliente
     * @return
     */
    public Usuario getCliente(String nombre);

    /**
     * Metodo para regresar la lista de clientes
     *
     * @return lista de clientes en la base de datos
     */
    public LinkedList<Usuario> getBD();

    /**
     * Metodo para regresar la lista de clientes actuales
     *
     * @return lista de clientes actuales
     */
    public LinkedList<Usuario> getClientesAct();

    /**
     * Metodo para registrar a un cliente
     *
     * @param cliente a registrar
     */
    public void registrar(Usuario cliente);

    /**
     * Metodo para cancelar la suscripcion de un cliente
     *
     * @param cliente a cancelar suscripci�n
     */
    public void cancelar(Usuario cliente);

    /**
     * Recomendacion mensual
     *
     */
    public void actualizar();

    /**
     * Llena la base de datos con recomendaciones
     */
    public void llenaBD();

    /**
     * Metodo para obtener una recomendacion
     *
     * @return recomendacion
     */
    public String getRecomendacion();
}
