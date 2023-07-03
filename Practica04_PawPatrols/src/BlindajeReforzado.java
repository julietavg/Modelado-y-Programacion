
/**
 * Clase que representa un tipo de blindaje el cual es blindaje reforzado
 *
 * @version 1.0 Abril 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */
public class BlindajeReforzado implements Blindaje {

    @Override
    public int getPrecio() {
        return 6000;
    }

    @Override
    public String getDescripcion() {
        String cadena = "Blindaje Reforzado \n" + "Defensa -> +4";
        return cadena;
    }
}
