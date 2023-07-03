
/**
 * Interfaz que representa un tipo de sistema de propulsion
 *
 * @version 1.0 Abril 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */

public interface SistemaDePropulsion {
    
     /**
     * Método que devuelve el precio del tipo de cabina
     * @return precio de la cabina    
     */
    public int getPrecio();
 
    /**
     * Metodo que imprime la descrpicion del tipo sistema de propulsion.   
     */
    public String getDescripcion();
}
