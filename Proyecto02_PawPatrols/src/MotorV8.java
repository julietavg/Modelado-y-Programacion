
/**
 * Clase que representa un tipo de motor el cual es el V8
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */
public class MotorV8 implements Motor {

    @Override
    public int getPrecio() {
        return 25000;
    }

    @Override
    public String getDescripcion() {
        String cadena = "\t MOTOR V8 \n"
                + "\nEste motor V8 es un propulsor de 8 cilindros en V\n"
                + "naturalmente aspirado.\n";
        return cadena;
    }
}
