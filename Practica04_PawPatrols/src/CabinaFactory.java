
/**
 * Clase que representa una fabrica de cabinas que 
 *          extiende a abstract Factory
 *
 * @version 1.0 Abril 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */
public class CabinaFactory extends AbstractFactory {

    @Override
    public Object getPieza(String pieza) {
        return getCabina(pieza);
    }

    /**
     * Método que regresa el tipo de cabina deseado
     *
     * @param tipoCabina el tipo de cabina necesario
     * @return cabina deseada
     */
    private Object getCabina(String tipoCabina) {
        switch (tipoCabina) {
            case "Piloto":
                return new Piloto();
            case "Tripulacion":
                return new Tripulacion();
            case "Ejercito":
                return new Ejercito();
            default:
                System.out.println(" Escoge una):"); 
                return null;
        }
    }

}
