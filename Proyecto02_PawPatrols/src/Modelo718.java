
/**
 * Clase que representa un tipo de modelo el cual es el 718
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */
public class Modelo718 implements Modelo {

    @Override
    public int getPrecio() {
        return 1468000;
    }

    @Override
    public String getDescripcion() {
        String cadena = " \t MODELO 718 \n"
                + "\nLos modelos 718 se han construido para el deporte puro\n"
                + "Son automoviles deportivos con motor central que aunan\n"
                + "el espiritu deportivo del legendario Porsche 718\n"
                + "con el vehiculo deportivo del futuro.\n";
        return cadena;
    }
}
