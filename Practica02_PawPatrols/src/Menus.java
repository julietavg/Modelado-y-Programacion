import java.util.Iterator;

/**
 * Clase Menus que representar� todos los menus del restaurante
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */


public class Menus {

	/*MenuDinamico*/
	private MenuDinamico menuDinamico = new MenuDinamico();

	/*MenuEspecial*/
	private MenuEspecial menuEspecial = new MenuEspecial();

	/*MenuGeneral*/
	private MenuGeneral menuGeneral = new MenuGeneral();

	/*Constructor*/
	public Menus() {

		menuDinamico = new MenuDinamico();
		menuEspecial = new MenuEspecial();
		menuGeneral = new MenuGeneral();
	}

	/**
     * M�todo que regresa un objeto de tipo Iterator de la clase
     * MenuDinamico
     *@return Iterator.
     *
     */
	public Iterator getIteratorMenuDinamico() {

		return menuDinamico.iterator();
	}

	/**
     * M�todo que regresa un objeto de tipo Iterator de la clase
     * MenuEspecial
     *@return Iterator.
     *
     */
	public Iterator getIteratorMenuEspecial() {

		return menuEspecial.iterator();
	}

	/**
     * M�todo que regresa un objeto de tipo Iterador de la clase
     * MenuGeneral
     *@return Iterator.
     *
     */
	public Iterator getIteradorMenuGeneral() {

		return menuGeneral.iterator();
	}


}
