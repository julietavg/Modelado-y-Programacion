
/**
 * Clase que representa una bagguet con tipo de pan de ajo
 *   que extiende de una baggui
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */
public class BagguiIntegral extends Baggui {

    @Override
    public String getDescription() {
       return "$" + getCost() + " Pan integral \n" ;
    }

    @Override
    public double getCost() {
      return 15;
    }
    
}
