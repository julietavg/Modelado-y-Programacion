
/**
 * Clase que representa un tipo de sistema de propulsion el cual es
 *                   viaje intercontinental
 *
 * @version 1.0 Abril 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */
public class ViajeIntercontinental implements SistemaDePropulsion{
    
	@Override
    public int getPrecio() {
       return 5000;
    }

	@Override
	public String getDescripcion() {
		String cadena = "Sistema de Propulsion de calibre"
				+ " Viaje Intercontinental \n"+ "Velocidad -> +70";
		return cadena;
	}
}
