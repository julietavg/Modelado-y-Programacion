
/**
 * Clase que representa un tipo de cabina el cual es
 *                  ejercito
 *
 * @version 1.0 Abril 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */
public class Ejercito implements Cabina{

    @Override
    public int getPrecio() {
       return 9000;
    }

	@Override
	public String getDescripcion() {
		String cadena = "Cabina de Ejercito \n"+ "Peso -> +9";
		return cadena;
	}
    
    
}
