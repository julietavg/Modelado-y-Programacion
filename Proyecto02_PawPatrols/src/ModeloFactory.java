
/**
 * Clase que representa una fabrica de modelos
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */
public class ModeloFactory extends AbstractFactory {

    @Override
    public Object getComponente(String componente) {
        return getModelo(componente);
    }

    /**
     * Metodo que regresa un tipo de modelo
     *
     * @param tipoModelo a elegir
     * @return el tipo de modelo deseado
     */
    private Object getModelo(String tipoModelo) {
        switch (tipoModelo) {
            case "718":
                return new Modelo718();
            case "911":
                return new Modelo911();
            case "Macan":
                return new ModeloMacan();
            case "Cayenne":
                return new ModeloCayenne();
            default:
                System.out.println(" Escoge una):");
                return null;
        }

    }

}
