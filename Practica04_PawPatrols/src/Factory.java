
/**
 * Clase principal Factory la cual escoge que tipo de fabrica quiere
 *
 * @version 1.0 Abril 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */
public class Factory {

    /**
     * Método que nos un tipo de fabrica
     * @param factory la fabrica 
     * @return fabrica deseada null en otro caso
     */
    public static AbstractFactory getFactory(String factory) {
        if (factory.equals("SistemaFactory")) {
            return new SistemaFactory();
        } else if (factory.equals("BlindajeFactory")) {
            return new BlindajeFactory();
        } else if (factory.equals("CabinaFactory")) {
            return new CabinaFactory();
        } else if (factory.equals("ArmasFactory")) {
            return new ArmasFactory();
        }else{
            System.out.println("Parece que aún no tenemos esa fabrica");
             return null ;
        }
    }

}
