
/**
 * Clase que representa un tipo de armas el cual es
 *         láser destructor de planetas
 *
 * @version 1.0 Abril 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */
public class LaserDestructor implements Armas{

    @Override
    public int getPrecio() {
       return 3000;
    }

    @Override
	public String getDescripcion() {
		String cadena = "Arma tipo Laser Destructor de Planetas"
				+ "\n"+ "Ataque -> +12";
		return cadena;
	}
}
