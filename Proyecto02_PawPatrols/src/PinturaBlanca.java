
/**
 * Clase que representa un tipo de pintura el cual es pintura blanca
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */
public class PinturaBlanca implements Pintura {

    @Override
    public int getPrecio() {
        return 30000;
    }

    @Override
    public String getDescripcion() {
        String cadena = "\tCOLOR BLANCO CROMADO \n";
        return cadena;
    }
}
