
/**
 * Clase que representa un tipo de modelo el cual es cayenne
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */
public class ModeloCayenne implements Modelo {

    @Override
    public int getPrecio() {
        return 1598000;
    }

    @Override
    public String getDescripcion() {
        String cadena = " \t MODELO CAYENNE \n"
                + "\nEl nuevo Cayenne ha ocupado otro lugar en la parrilla\n"
                + "de salida de la serie de modelos Cayenne con un\n"
                + "rendimiento brutal y un dinamismo preciso.\n";
        return cadena;
    }
}
