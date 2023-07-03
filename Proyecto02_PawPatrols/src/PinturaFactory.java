
/**
 * Clase que representa una fabrica de pintura
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */
public class PinturaFactory extends AbstractFactory {

    @Override
    public Object getComponente(String componente) {
        return getPintura(componente);
    }
 
    /**
     * Metodo que regresa un tipo de pintura
     *
     * @param tipoPintura a elegir
     * @return el tipo de pintura deseado
     */
    private Object getPintura(String tipoPintura) {
        switch (tipoPintura) {
            case "Roja":
                return new PinturaRoja();
            case "Blanca":
                return new PinturaBlanca();
            case "Negra":
                return new PinturaNegra();
            default:
                System.out.println(" Escoge una):");
                return null;
        }

    }

}
