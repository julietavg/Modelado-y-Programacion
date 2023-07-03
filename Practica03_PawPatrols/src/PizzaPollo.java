
/**
 * Clase abstracta que representa una pizza de pollo 
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */

public class PizzaPollo extends Pizza{
	
	private static String nombre = "Pizza de Pollo"; 
	
	private static String queso = "cheddar";
	
	private static String carne = "pollo";
	
	private static String masa = "delgada";
	
	private static double precio = 150;
	
	public PizzaPollo() {
		super(nombre, queso, carne, masa, precio);
	}	
}
