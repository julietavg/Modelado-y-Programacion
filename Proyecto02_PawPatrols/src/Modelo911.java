
/**
 * Clase que representa un tipo de modelo el cual es el 911
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */
public class Modelo911 implements Modelo {

    @Override
    public int getPrecio() {
        return 1998000;
    }

    @Override
    public String getDescripcion() {
        String cadena = " \t MODELO 911 \n"
                + "\nA nuestros ingenieros les gusta hablar del automovil\n"
                + "deportivo mas perfecto de la historia. Extremadamente\n"
                + "deportivo, comodo y apto para el dia a dia.\n";
        return cadena;
    }
}
