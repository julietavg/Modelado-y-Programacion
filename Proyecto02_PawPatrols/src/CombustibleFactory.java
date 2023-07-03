
/**
 * Clase que representa una fabrica de combustibles
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */
public class CombustibleFactory extends AbstractFactory {

    @Override
    public Object getComponente(String componente) {
        return getCombustible(componente);
    }

    /**
     * Metodo que regresa un tipo de combustible
     *
     * @param tipoCombustible a elegir
     * @return el tipo de combustible deseado
     */
    private Object getCombustible(String tipoCombustible) {
        switch (tipoCombustible) {
            case "Gasolina":
                return new CombustibleGasolina();
            case "Hibrido":
                return new CombustibleHibrido();
            default:
                System.out.println(" Escoge una):");
                return null;
        }

    }

}
