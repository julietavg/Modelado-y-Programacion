
/**
 *
 * Interfaz que implementa los estados que el robot puede tomar
 * 
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */

public interface EstadoRobot{
    
    /**
     * Método para activar al robot en caso que este suspendido
     */
    public void activar();
    
    /**
     * Método para suspender al robot
     */
    public void suspenderse();

    /**
     * Método para hacer caminar al robot
     */
    public void caminar();
    
    /**
     * Método para que el robot atienda
     */
    public void atender();
    
    /**
     * Método para que el robot cocine la orden
     */
    public void cocinar();
	
}