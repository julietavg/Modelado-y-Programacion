
/**
 * Clase abstracta que representa una pizza
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */

public abstract class Pizza {
	
	/*Queso*/
	private String queso;
	
	/*Carne*/
	private String carne;
	
	/*Masa*/
	private String masa;
	
	/*Nombre*/
	private String nombre;
	
	/*Precio*/
	private double precio;
	
	/*Constructor*/
	public Pizza(String nombre, String queso, String carne, String masa, double precio) {
		
		this.nombre = nombre;
		this.queso = queso;
		this.carne = carne;
		this.masa = masa;
		this.precio = precio;
	}
	
	/**
     * M�todo que regresa el queso de la pizza
     *
     * @return el queso de la pizza
     */
	public String getQueso() {
		return queso;
	}
	
	/**
     * M�todo que regresa la carne de la pizza
     *
     * @return la carne de la pizza
     */
	public String getCarne() {
		return carne;
	}
	
	/**
     * M�todo que regresa la masa de la pizza
     *
     * @return la masa de la pizza
     */
	public String getMasa() {
		return masa;
	}
	
	/**
     * M�todo que regresa el precio de la pizza
     *
     * @return el precio de la pizza
     */
	public double getPrecio() {
		return precio;
	}
	
	/**
     * M�todo para representar la descripcion de la pizza
     *
     * @return la descripcion de la pizza
     */
	public String getDescripcion() {
		String aux = "";
		return aux +=  nombre + "\nCarne: " + this.getCarne() + "\nQueso: " + 
		this.getQueso() + "\nMasa: " + this.getMasa();
	}
}
