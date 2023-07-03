
/**
 * Clase que representa el audio JBL
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */
public class AudioJBL implements Audio {

    @Override
    public int getPrecio() {
        return 3000;
    }

    @Override
    public String getDescripcion() {
        String cadena = "\t AUDIO JBL \n"
                + "\nLos altavoces de la serie Stage2 ofrecen el sonido\n"
                + "de concierto distintivo de JBL en tu Porsche.";
        return cadena;
    }
}
