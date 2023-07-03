
/**
 * Clase que representa un tipo de cabina el cual es
 *             piloto
 *
 * @version 1.0 Abril 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */
public class Piloto implements Cabina{

    @Override
    public int getPrecio() {
       return 800;
    }
    
    @Override
	public String getDescripcion() {
		String cadena = "Cabina de Piloto \n"+ "Peso -> +3";
		return cadena;
	}
}
