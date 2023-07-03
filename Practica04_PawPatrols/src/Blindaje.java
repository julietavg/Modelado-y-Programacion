
/**
 * Interfaz que representa un tipo de blindaje
 *
 * @version 1.0 Abril 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */

public interface Blindaje {
    
     /**
     * Método que devuelve el precio del tipo de cabina
     * @return precio de la cabina    
     */
    public int getPrecio();
    
    /**
     * Método que imprime la descrpicion del tipo de cabina    
     */
    public String getDescripcion();
}
