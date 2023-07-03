
/**
 * Clase principal Factory la cual escoge que tipo de fabrica quiere
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */

public class Factory {

    /**
     * Método que nos un tipo de fabrica
     *
     * @param factory la fabrica
     * @return fabrica deseada null en otro caso
     */
    public static AbstractFactory getFactory(String factory) {
        if (factory.equals("ModeloFactory")) {
            return new ModeloFactory();
        } else if (factory.equals("CombustibleFactory")) {
            return new CombustibleFactory();
        } else if (factory.equals("PinturaFactory")) {
            return new PinturaFactory();
        } else if (factory.equals("TransmisionFactory")) {
            return new TransmisionFactory();
        } else if (factory.equals("MotorFactory")) {
            return new MotorFactory();
        } else if (factory.equals("AudioFactory")) {
            return new AudioFactory();
        } else {
            System.out.println("Parece que aún no tenemos esa fabrica");
            return null;
        }
    }

}
