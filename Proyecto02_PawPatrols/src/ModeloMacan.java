
/**
 * Clase que representa un tipo de modelo el cual es macan
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */
public class ModeloMacan implements Modelo {

    @Override
    public int getPrecio() {
        return 1148000;
    }

    @Override
    public String getDescripcion() {
        String cadena = " \t MODELO MACAN \n"
                + "\nModelo joven, dinamico y urbano, con un amplio equipamiento\n"
                + "de serie, caracteristicas de diseno especaficas del modelo y,\n"
                + "por supuesto, las tipicas prestaciones de Porsche.\n";
        return cadena;
    }
}
