
/**
 * Clase que representa una fabrica de transmision
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */
public class TransmisionFactory extends AbstractFactory {

    @Override
    public Object getComponente(String componente) {
        return getTransmision(componente);
    }
    /**
     * Metodo que regresa un tipo de transmision
     *
     * @param tipoTransmision a elegir
     * @return el tipo de transmision deseado
     */
    private Object getTransmision(String tipoTransmision) {
        switch (tipoTransmision) {
            case "Manual":
                return new TransmisionManual();
            case "Automatico":
                return new TransmisionAutomatico();  
            default:
                System.out.println(" Escoge una):");
                return null;
        }

    }

}
