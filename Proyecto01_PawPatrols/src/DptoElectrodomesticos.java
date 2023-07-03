import java.util.ArrayList;
public class DptoElectrodomesticos {

    /*Lista de Productos*/
    ArrayList<Producto> listaProductos = new ArrayList<>();

    /*Constructor*/
    public DptoElectrodomesticos() {

            Producto ventilador = new Producto("ventilador", 1001, "electrodomesticos", 700.00);
            Producto horno = new Producto("horno", 1002, "electrodomesticos", 1000.00);
            Producto refrigerador = new Producto("refrigerador", 1003, "electrodomesticos", 5000.00);
            Producto lavadora = new Producto("lavadora", 1004, "electrodomesticos", 4000.00);
            Producto plancha = new Producto("plancha", 1005, "electrodomesticos", 1200.00);
            Producto cafetera = new Producto("cafetera", 1006, "electrodomesticos", 1500.00);
            Producto estufa = new Producto("estufa", 1007, "electrodomesticos", 7000.00);

            listaProductos.add(ventilador);
            listaProductos.add(horno);
            listaProductos.add(refrigerador);
            listaProductos.add(lavadora);
            listaProductos.add(plancha);
            listaProductos.add(cafetera);
            listaProductos.add(estufa);
    }

    /**
     * Metodo que devuelve la lista de productos.
     *@return listaProductos
     */
    public ArrayList<Producto> getLista() {

            return listaProductos;
    }

	
	
}
