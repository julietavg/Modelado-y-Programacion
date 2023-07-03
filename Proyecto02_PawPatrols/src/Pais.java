
/**
 * Clase que representa cada uno de los paises del programa
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */
public class Pais {

    /** Tipo de pais/sucursal */
    Sucursal sucursal; 
   
    /** Auxiliares para escoger en el switch*/
    boolean armarCarro = false, autosPrefabricados = false;
    
    /**
     * Método que muestra las funciones que puede hacer una sucursal como
     * mostrar menu, armar auto, autos prefabricados y terminar su compra
     */
    public void sucursal() {
        sucursal.mostrarMenu();
        if (armarCarro == true) {
            sucursal.armarAuto();
        } else if (autosPrefabricados == true) {
            sucursal.autosPrefabricados();
        }
        sucursal.terminarCompra();

    }

    /**
     * Método que modifica la sucursal
     *
     * @param sucursal el pais/sucursal a elegir
     */
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    /**
     * Método que nos dice si el usuario decidio armar un auto
     *
     * @param armarCarro la desición del usuario
     */
    public boolean setArmarCarro(boolean armarCarro) {
        return this.armarCarro = armarCarro;
    }

    /**
     * Método que nos dice si el usuario decidio escoger un auto prefabricado
     *
     * @param autosPrefabricados la desición del usuario
     */
    public boolean setAutosPrefabricados(boolean autosPrefabricados) {
        return this.autosPrefabricados = autosPrefabricados;
    }

}
