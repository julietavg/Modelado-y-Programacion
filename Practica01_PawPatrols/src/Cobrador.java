/**
 *
 * Interfaz que implementa el método cobrar la cual usarán
 *     todas las empresas para realizar sus pagos
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */

public interface Cobrador {

    /**
     * Método que hace el cobro del cliente
     * @param cliente al que se le cobrará
     * @param empresa a la que se realiza el pago
     */
	public void cobrar(Usuario cliente, Sujeto empresa);
}
