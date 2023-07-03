
/**
 * Clase principal Abstracta de los tipos de fabricas de cada componente del 
 *                          vehiculo
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */

public abstract class AbstractFactory {
    
    /**
     * Método que nos devuelve el componente del coche
     * @param componente del coche 
     * @return componente deseado
     */
    public abstract Object getComponente(String componente);
}
