
/**
 * Clase abstracta que representa una pizza Maxi
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */

public class PizzaMaxi extends Pizza{
	
	private static String nombre = "Pizza Maxi"; 
	
	private static String queso = "cheddar, manchego";
	
	private static String carne = "salchicha, jamon y pollo";
	
	private static String masa = "gruesa";
	
	private static double precio = 250;
	
	
	public PizzaMaxi() {
		super(nombre, queso, carne, masa, precio);
	}	
}
