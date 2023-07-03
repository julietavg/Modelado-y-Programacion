
/**
 * Clase que representa un tipo de transmision el cual es automatica
 *
 */
public class TransmisionAutomatico implements Transmision{

    @Override
    public int getPrecio() {
        return 50000;
    }
    
    @Override
	public String getDescripcion() {
		String cadena = "\tTRANSMISION AUTOMATICA \n"
                                + "\nEste tipo de transmision ofrece una ventaja significativa,\n"
				+ "en combinacion con los motores turbo.\n";
		return cadena;
	}
}

