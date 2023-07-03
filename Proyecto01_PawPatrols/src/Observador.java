
import java.util.ArrayList;

public interface Observador {
	
    /**
     * Metodo que nos devuelve la lista del Dpto de Alimentos.
     * @return lista de productos
     */
    public ArrayList<Producto> getAlimentos();

    /**
     * Metodo que nos devuelve la lista del Dpto de ElectroDomesticos
     * @return lista de productos
     */
    public ArrayList<Producto> getElectroDomesticos();

    /**
     * Metodo que nos devuelve la lista del Dpto de Electronicos.
     * @return lista de productos
     */
    public ArrayList<Producto> getElectronicos(); 

    /**
     * Metodo para cambiar de estado a la lista de Alimentos
     */
    public void updateAlimentos();

    /**
     * Metodo para cambiar de estado a la lista de Electronica
     */
    public void updateElectronica();

    /**
     * Metodo para cambiar de estado a la lista de ElectroDomesticos
     */
    public void updateElectroDomesticos();
}
