
/** 
 * Interfaz que representa un tipo de combustible
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */
public interface Combustible{
    
     /**
     * Método que devuelve el precio del tipo de combustible
     * @return precio del combustible   
     */
    public int getPrecio();
    
    /**
     * Metodo que imprime la descrpicion del tipo de combustible
     * @return cadena de la descripcion   
     */
    public String getDescripcion();
}
