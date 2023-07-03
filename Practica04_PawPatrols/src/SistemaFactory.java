
/**
 * Clase que representa una fabrica de sistemas de propulsion que 
 *              extiende a abstract Factory
 *
 * @version 1.0 Abril 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */
public class SistemaFactory extends AbstractFactory {

    @Override
    public Object getPieza(String pieza) {
        return getBlindaje(pieza);
    }

    /**
     * Método que regresa el tipo de blindaje deseado
     *
     * @param tipoBlindaje el tipo de blindaje
     * @return blindaje desaado
     */
    private Object getBlindaje(String tipoBlindaje) {
        if (tipoBlindaje.equals("Intercontinental")) {
            return new ViajeIntercontinental();
        } else if (tipoBlindaje.equals("Intergalactico")) {
            return new ViajeIntergalactico();
        } else if (tipoBlindaje.equals("Interplanetario")) {
            return new ViajeInterplanetario();
        } else {
            System.out.println(" Escoge una):"); // maybe necesitamos alguna excepcion
            return null;
        }
    }

}

