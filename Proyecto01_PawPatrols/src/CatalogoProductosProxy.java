import java.util.ArrayList;

/**
 * Clase que representa un representante de un Catalogo que implementa
 * la Observer y CProxy
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 *
 */

public class CatalogoProductosProxy implements Observador, CProxy{

	/*Catalogo Real*/
	private CatalogoProductos catalogoReal = new CatalogoProductos();

	public CatalogoProductosProxy(CatalogoProductos catologoReal) {
		this.catalogoReal = catalogoReal;
	}

	public ArrayList<Producto> getAlimentos() {
		return catalogoReal.getAlimentos();
	}

	public ArrayList<Producto> getElectroDomesticos() {
		return catalogoReal.getElectroDomesticos();
	}

	
	public ArrayList<Producto> getElectronicos() {
		return catalogoReal.getElectronicos();
	}

	@Override
	public void updateAlimentos() {
		catalogoReal.updateAlimentos();
	}

	@Override
	public void updateElectronica() {

		catalogoReal.updateElectronica();
	}

	@Override
	public void updateElectroDomesticos() {
		catalogoReal.updateElectroDomesticos();	

	}

	@Override
	public String mostrar() {
		return catalogoReal.mostrar();
	}
	
	@Override
	public Producto buscarProducto(int codigoProducto){
        return catalogoReal.buscarProducto(codigoProducto);
   }
}
