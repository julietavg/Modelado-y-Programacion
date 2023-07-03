
/**
 * Clase que representa el combustible hibrido
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */
public class CombustibleHibrido implements Combustible{

    @Override
    public int getPrecio() {
        return 60000;
    }
    
    @Override
	public String getDescripcion() {
		String cadena = "\tCOMBUSTIBLE HIBRIDO \n"; 
		return cadena;
	}
}

