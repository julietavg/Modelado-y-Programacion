import java.util.ArrayList;

public class Descuento implements Observable{
	
    /*Lista de observadores*/
    private ArrayList <Observador> productos;

    /**
     * Metodo ue devuelve la lista de productos
     */
    public void enlazarProducto(Observador o) {

            productos.add(o);
    }

    public Descuento() {

            productos = new ArrayList<>();
    }

    /**
     * Metodo que ejectua la funcion notificarAlimentos
     */
    public void descuentaAlimentos() {
            notificarAlimentos();
    }

    /**
     * Metodo que ejectua la funcion notificarElectronica
     */
    public void descuentaElectronica() {
            notificarElectronica();
    }

    /**
     * Metodo que ejectua la funcion notificarDomesticos
     */
    public void descuentaElectroDomesticos() {
            notificarElectroDomesticos();
    }

    @Override
    public void notificarAlimentos() {
            for(Observador o:productos){
                    o.updateAlimentos();
            }	

    }

    @Override
    public void notificarElectronica() {
            for(Observador o:productos){
                    o.updateElectronica();
            }	
    }

    @Override
    public void notificarElectroDomesticos() {
            for(Observador o:productos){
                    o.updateElectroDomesticos();
            }	
    }

}
