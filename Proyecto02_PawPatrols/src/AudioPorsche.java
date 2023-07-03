
/** 
 * Clase que representa el audio Porsche
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */
public class AudioPorsche implements Audio{

    @Override
    public int getPrecio() {
        return 20000;
    }
    
    @Override
	public String getDescripcion() {
		String cadena = "El equipo de sonido original de Porsche esta bastante limitado y es restrictivo\n "
				+ "con los matices que deberian apreciarse de los instrumentos y la voz.";
		return cadena;
	}
}

