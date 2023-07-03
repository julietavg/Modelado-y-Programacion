
/**
 * Clase que representa el combustible de gasolina
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */
public class CombustibleGasolina implements Combustible{

    @Override
    public int getPrecio() {
        return 40000;
    }
    
    @Override
	public String getDescripcion() {
		String cadena = "\tCOMBUSTIBLE DE GASOLINA \n"; 
		return cadena;
	}
}

