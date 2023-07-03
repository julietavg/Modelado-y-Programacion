/**
 * Clase principal Abstracta de los tipos de fabricas
 *
 * @version 1.0 Abril 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */
public abstract class AbstractFactory {
    /**
     * Método que nos devuelve la pieza/componente de la nave
     * @param pieza de la nave 
     * @return pieza deseada
     */
    public abstract Object getPieza(String pieza);
}
