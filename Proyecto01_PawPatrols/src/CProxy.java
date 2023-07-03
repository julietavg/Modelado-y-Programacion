
public interface CProxy {
	
	/**
	 * Metodo para mostrar el catalogo de productos.
	 */
	public String mostrar();
	
	/**
	 * Metodo para buscar el producto en los departamentos.
	 * @param int codigo de barras.
	 * @return producto.
	 */
	public Producto buscarProducto(int codigoProducto);
}
