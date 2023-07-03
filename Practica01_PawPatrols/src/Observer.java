/**
 *
 * Interfaz que implementa update el cual usará el usuario
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */


public interface Observer {

    /**
     * Método que hará las recomendaciones a cada usuario
     * @param empresa que recomendara
     */
	public void update(Sujeto empresa);


}
