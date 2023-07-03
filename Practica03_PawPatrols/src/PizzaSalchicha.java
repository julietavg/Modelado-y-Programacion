
/**
 * Clase abstracta que representa un pizza de salchicha
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */

public class PizzaSalchicha extends Pizza{
	
	private static String nombre = "Pizza de Salchicha";
	
	private static String queso = "manchego";
	
	private static String carne = "salchicha";
	
	private static String masa = "gruesa";
	
	private static double precio = 130;
	
	public PizzaSalchicha() {
		super(nombre, queso, carne, masa, precio);
	}	
}
