import java.util.ArrayList;

public class CatalogoProductos implements Observador, CProxy{

	/** Electrodomesticos */
	private DptoElectrodomesticos electrodomesticos = new DptoElectrodomesticos();

	/** Electronica */    
	private DptoElectronica electronica = new DptoElectronica();

	/** Alimentos */    
	private DptoAlimentos alimentos = new DptoAlimentos();

	private RandomDescuento random = new RandomDescuento();

	public CatalogoProductos() {

	}

	public ArrayList<Producto> getAlimentos() {
		return alimentos.getLista();
	}

	public ArrayList<Producto> getElectroDomesticos() {
		return electrodomesticos.getLista();
	}


	public ArrayList<Producto> getElectronicos() {
		return electronica.getLista();
	}

	@Override
	public void updateAlimentos() {

		for(int i = 0; i < alimentos.getLista().size();i++) {
			alimentos.getLista().get(i).setPrecio(alimentos.getLista().get(i).getPrecio()*random.getRandomDescuento());
			alimentos.getLista().get(i).setNombre(alimentos.getLista().get(i).getNombre()+" �Articulo con descuento!");
		}
	}

	@Override
	public void updateElectronica() {

		for(int i = 0; i < electronica.getLista().size();i++) {
			electronica.getLista().get(i).setPrecio(electronica.getLista().get(i).getPrecio()*random.getRandomDescuento());
			electronica.getLista().get(i).setNombre(electronica.getLista().get(i).getNombre()+" �Articulo con descuento!");
		}
	}

	@Override
	public void updateElectroDomesticos() {

		for(int i = 0; i < electrodomesticos.getLista().size();i++) {
			electrodomesticos.getLista().get(i).setPrecio(electrodomesticos.getLista().get(i).getPrecio()*random.getRandomDescuento());
			electrodomesticos.getLista().get(i).setNombre(electrodomesticos.getLista().get(i).getNombre()+" �Articulo con descuento!");
		}
	}

	@Override
	public String mostrar() {

		String aux = "";

		for (int i = 0; i < alimentos.getLista().size();i++) { 		      
			aux+=alimentos.getLista().get(i).getDetalles(); 		
		}

		for (int i = 0; i < electrodomesticos.getLista().size();i++) { 		      
			aux+=electrodomesticos.getLista().get(i).getDetalles(); 		
		}

		for (int i = 0; i < electronica.getLista().size();i++) { 		      
			aux+=electronica.getLista().get(i).getDetalles(); 		
		}

		return aux;
	}
	
	@Override
	public Producto buscarProducto(int codigoProducto) {
        ArrayList <Producto> list = new ArrayList();
        list.addAll(alimentos.getLista());
        list.addAll(electronica.getLista());
        list.addAll(electrodomesticos.getLista());
        for (Producto producto : list) {
            if (producto.getCodigoDeBarras() == codigoProducto) {
                return producto;
            }
        }

        return null;
    }
}
