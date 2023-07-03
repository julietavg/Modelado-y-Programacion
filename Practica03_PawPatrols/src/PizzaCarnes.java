
/**
 * Clase abstracta que representa una pizza de carnes 
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */

public class PizzaCarnes extends Pizza{
		
		private static String nombre = "Pizza de Carnes"; 
	
		private static String queso = "cheddar";
		
		private static String carne = "jamon, salchicha";
		
		private static String masa = "gruesa";
		
		private static double precio = 200;
		
		public PizzaCarnes() {
			super(nombre, queso, carne, masa, precio);
		}	

}
