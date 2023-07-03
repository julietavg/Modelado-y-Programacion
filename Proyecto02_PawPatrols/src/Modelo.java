
/** 
 * Interfaz que representa un tipo de modelo
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */

public interface Modelo{
    
     /**
     * Método que devuelve el precio del tipo de modelo
     * @return precio del modelo   
     */
    public int getPrecio();
    
    /**
     * Metodo que imprime la descrpicion del tipo de modelo
     * @return cadena de la descripcion   
     */
    public String getDescripcion();
}
