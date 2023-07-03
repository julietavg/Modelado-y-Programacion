
/**
 * Clase que representa una fabrica de armas que 
 *          extiende a abstract Factory
 *
 * @version 1.0 Abril 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */
public class ArmasFactory extends AbstractFactory {

    @Override
    public Object getPieza(String pieza) {
        return getArmas(pieza);
    }

    /**
     * Método que regresa el tipo de armas deseado
     *
     * @param tipoArmas el tipo de armas 
     * @return armas deseada
     */
    private Object getArmas(String tipoArmas) {
        switch (tipoArmas) {
            case "LaserSimple":
                return new LaserSimple();
            case "MisilesPlasma":
                return new MisilesPlasma();
            case "LaserDestructor":
                return new LaserDestructor();
            default:
                System.out.println(" Escoge una):"); // maybe necesitamos alguna excepcion
                return null;
        }
    }

}
