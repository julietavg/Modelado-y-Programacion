
/**
 * Clase que representa una fabrica de motor
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */

public class MotorFactory extends AbstractFactory {

    @Override
    public Object getComponente(String componente) {
        return getMotor(componente);
    }

     /**
     * Metodo que regresa un tipo de motor
     *
     * @param tipoMotor a elegir
     * @return el tipo de motor deseado
     */
    private Object getMotor(String tipoMotor) {
        switch (tipoMotor) {
            case "V6":
                return new MotorV6();
            case "V8":
                return new MotorV8();
            case "V10":
                return new MotorV10();
            default:
                System.out.println(" Escoge una):");
                return null;
        }

    }

}
