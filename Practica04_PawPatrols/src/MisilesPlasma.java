
/**
 * Clase que representa un tipo de armas el cual es
 *            misiles de plama
 *
 * @version 1.0 Abril 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */
public class MisilesPlasma implements Armas{

    @Override
    public int getPrecio() {
       return 1300;
    }
    
    @Override
	public String getDescripcion() {
		String cadena = "Arma tipo Misiles de Plasma"
				+ "\n"+ "Ataque -> +9";
		return cadena;
	}
}
