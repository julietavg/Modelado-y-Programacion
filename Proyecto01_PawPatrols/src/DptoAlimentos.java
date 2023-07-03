
import java.util.ArrayList;
public class DptoAlimentos {
	
    /*Lista de Productos*/
    ArrayList<Producto> listaProductos = new ArrayList<>();

    /*Constructor*/
    public DptoAlimentos() {

            Producto harina = new Producto("harina", 3001, "alimentos", 50.00);
            Producto huevo = new Producto("huevo", 3002, "alimentos", 40.00);
            Producto pasta = new Producto("pasta", 3003, "alimentos", 28.00);
            Producto helado = new Producto("helado", 3004, "alimentos",80.00);
            Producto cafe = new Producto("cafe", 3005,"alimentos", 90.00);
            Producto frootloops = new Producto("frootloops", 3006,"alimentos", 85.00);
            Producto mazapan = new Producto("mazapan", 3007, "alimentos", 9.00);

            listaProductos.add(harina);
            listaProductos.add(huevo);
            listaProductos.add(pasta);
            listaProductos.add(helado);
            listaProductos.add(cafe);
            listaProductos.add(frootloops);
            listaProductos.add(mazapan);
    }

    /**
     * Metodo que devuelve la lista de productos.
     *@return listaProductos
     */
    public ArrayList<Producto> getLista() {

            return listaProductos;
    }

	
	
	
}
