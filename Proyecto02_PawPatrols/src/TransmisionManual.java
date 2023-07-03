
/**
 * Clase que representa un tipo de transmision el cual es manual
 *
 */
public class TransmisionManual implements Transmision{

    @Override
    public int getPrecio() {
        return 35000;
    }
    
    @Override
	public String getDescripcion() {
		String cadena = "\tTRANSMISION MANUAL \n"
                                + "\nEsta anade un golpe de acelerador cuando el conductor reduce\n"
                                + "de marcha,para aumentar las revoluciones del motor y adaptarlas\n"
                                + "a la mayor velocidad con que gira el engranaje del cambio al\n"
                                + "insertar esa marcha mas baja.\n";
		return cadena;
	}
}

