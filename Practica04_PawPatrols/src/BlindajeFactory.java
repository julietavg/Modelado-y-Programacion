
/**
 * Clase que representa una fabrica de blindajes que extiende a 
 *      abstract Factory
 *
 * @version 1.0 Abril 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */
public class BlindajeFactory extends AbstractFactory {

    @Override
    public Object getPieza(String pieza) {
        return getBlindaje(pieza);
    }

    private Object getBlindaje(String pieza) {
      if (pieza.equals("Fortaleza")) {
            return new BlindajeFortaleza();
        } else if (pieza.equals("Simple")) {
            return new BlindajeSimple();
        } else if (pieza.equals("Reforzado")) {
            return new BlindajeReforzado();
        }else{
            System.out.println(" Escoge una):"); // maybe necesitamos alguna excepcion
             return null ;
        }
    }
    

    
}
