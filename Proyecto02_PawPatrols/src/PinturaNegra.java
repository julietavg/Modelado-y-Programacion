
/**
 * Clase que representa un tipo de pintura el cual es pintura roja
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */
public class PinturaNegra implements Pintura{

    @Override
    public int getPrecio() {
        return 50000;
    }
    
    @Override
	public String getDescripcion() {
		String cadena = "\tCOLOR NEGRO MATE \n";
		return cadena;
	}
}

