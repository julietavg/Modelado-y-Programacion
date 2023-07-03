import java.util.ArrayList;

public interface IProxy {
	
	/**
	 * Metodo para realizar la compra segura
	 * dentro de la tienda
	 * @return true si los datos de compra coinciden con la base de datos.
	 */
	 public boolean compraSegura(String cuentaBancaria, ArrayList<Usuario> lista,String telefono);
}
