
/**
 * Clase que representa un tipo de motor el cual es el V6
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */
public class MotorV6 implements Motor {

    @Override
    public int getPrecio() {
        return 32000;
    }

    @Override
    public String getDescripcion() {
        String cadena = "\t MOTOR V6 \n"
                + "\nEste motor 3.6 V6 es una mecanica de gasolina de 6\n"
                + "cilindros dispuestos en V\n ";
        return cadena;
    }
}
