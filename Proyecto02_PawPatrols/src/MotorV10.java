
/**
 * Clase que representa un tipo de motor el cual es el V10
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */
public class MotorV10 implements Motor {

    @Override
    public int getPrecio() {
        return 60000;
    }

    @Override
    public String getDescripcion() {
        String cadena = "\t MOTOR 10 \n"
                + "\nEste motor se caracteriza por su mayor fineza de\n"
                + "funcionamiento debido a que las explosiones de los\n"
                + "cilindros se hacen en intervalos de tiempo menores.\n";
        return cadena;
    }
}
