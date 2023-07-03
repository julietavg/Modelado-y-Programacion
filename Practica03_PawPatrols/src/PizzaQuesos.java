
/**
 * Clase abstracta que representa una pizza de quesos
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */

public class PizzaQuesos extends Pizza{
	
	private static String nombre = "Pizza de Quesos"; 
	
	private static String queso = "cheddar, manchego";
	
	private static String carne = "sin carne";
	
	private static String masa = "delgada";
	
	private static double precio = 180;
	
	public PizzaQuesos() {
		super(nombre, queso, carne, masa, precio);
	}	
	
	
}
