
/**
 * Interfaz Iterador que realiza las acciones de un Iterador
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */

public interface Iterador{
	
    /**
     * Método que verifica si hay un elemento después, con
     * respecto al que esta posicionado.
     *@return true si hay otro elemento, false de lo contrario
     * 
     */
	public boolean hasNext();

    /**
     * Método que regresa el Objeto que está despues, con 
     * respecto al que esta posicionado.
     *@return el objeto siguiente.
     * 
     */
	public Object next();
}
