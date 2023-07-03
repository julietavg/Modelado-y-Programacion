
/**
 * Clase que representa el audio Bose
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */
public class AudioBose implements Audio {

    @Override
    public int getPrecio() {
        return 9000;
    }

    @Override
    public String getDescripcion() {
        String cadena = "\t AUDIO BOSE \n"
                + "\nEl mejor altavoz Bose tiene un woofer de 7 pulgadas\n"
                + "y dos tweeters estrategicamente colocados de 1 pulgada.";
        return cadena;
    }
}
