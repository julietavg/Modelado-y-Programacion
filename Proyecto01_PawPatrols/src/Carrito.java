
import java.util.LinkedList;

public class Carrito {

    /*Lista de productos*/
    LinkedList<Producto> productos = new LinkedList();

    public Carrito() {
        productos = new LinkedList<>();

    }

    /**
     * Metodo para agregar un producto al carrito
     *
     * @param Producto producto a agregar
     */
    public void add(Producto producto) {
        productos.add(producto);
    }

    /**
     * Metodo para mostrar los productos agregados
     */
    public void mostrar() {
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i).getDetalles());
        }
    }

    /**
     * Metodo para cobrar el monto total
     */
    public void cobrar() {
        double precio = 0;
        for (Producto costo : productos) {
            precio += costo.getPrecio();
        }

        System.out.println("$" + precio);

    }

    /**
     * Metodo para saber el tama�o del carrito
     *
     * @return tama�o del carrito
     */
    public int size() {
        return productos.size();
    }

}
