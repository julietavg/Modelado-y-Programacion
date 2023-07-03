
import java.util.ArrayList;

public class DptoElectronica{
	
    /*Lista de Productos*/
    ArrayList<Producto> listaProductos = new ArrayList<>();

    /*Constructor*/
    public DptoElectronica() {

            Producto monitor = new Producto("monitor", 2001, "electronica", 3000.00);
            Producto teclado = new Producto("teclado", 2002, "electronica", 800.00);
            Producto televisor = new Producto("televisor", 2003, "electronica", 8000.00);
            Producto proyector = new Producto("proyector", 2004, "electronica", 2300.00);
            Producto airpods = new Producto("airpods", 2005,"electronica", 3500.00);
            Producto bocina = new Producto("bocina", 2006,"electronica", 1000.00);
            Producto tableta = new Producto("tableta", 2007, "electronica", 4000.00);

            listaProductos.add(monitor);
            listaProductos.add(teclado);
            listaProductos.add(televisor);
            listaProductos.add(proyector);
            listaProductos.add(airpods);
            listaProductos.add(bocina);
            listaProductos.add(tableta);
    }

    /**
     * Metodo que devuelve la lista de productos
     * @return listaProductos.
     */
    public ArrayList<Producto> getLista() {

            return listaProductos;
    }

	
	
	
}
