
/**
 * Clase que va a adaptar la pizza a una baggui 
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */

public class PizzaAdapter extends Baggui{
	
	/*Atributo Pizza*/
	private Pizza pizza;

	/*Constructor*/
	public PizzaAdapter(Pizza pizza) {
		this.pizza = pizza;
	}

	/**
     * M�todo que regresa la descripcion de la pizza
     *
     * @return la descripcion de la pizza
     */
	@Override
	public String getDescription() {
		
		return this.pizza.getDescripcion();
	}
	
	/**
     * M�todo que regresa el costo de la pizza
     *
     * @return el costo de la pizza
     */
	@Override
	public double getCost() {

		return this.pizza.getPrecio();
	}

}
