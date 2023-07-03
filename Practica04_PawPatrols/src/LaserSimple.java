
/**
 * Clase que representa un tipo de armas el cual es
 *            laser simple
 *
 * @version 1.0 Abril 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */
public class LaserSimple implements Armas{

    @Override
    public int getPrecio() {
       return 800;
    }
    
    @Override
	public String getDescripcion() {
		String cadena = "Arma tipo Laser Simple"
				+ "\n"+ "Ataque -> +5";
		return cadena;
	}
}
