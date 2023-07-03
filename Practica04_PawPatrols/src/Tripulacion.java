
/**
 * Clase que representa un tipo de cabina el cual es
 *                  tripulacion
 *
 * @version 1.0 Abril 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */
public class Tripulacion implements Cabina{

    @Override
    public int getPrecio() {
       return 3000;
    }
    
    @Override
	public String getDescripcion() {
		String cadena = "Cabina de Tripulacion \n"+ "Peso -> +6";
		return cadena;
	}
}
