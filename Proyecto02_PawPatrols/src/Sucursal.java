
/**
 * Interfaz para realizar los metodos de cada tipo de sucursal
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */

public interface Sucursal {

    /** Metodo que desplegara las opciones que puede escoger el usuario*/
    public void mostrarMenu();

    /** Metodo que le permitira al usuario armar su auto con los componentes
     que el escoga*/
    public void armarAuto();

    /** Metodo que le permitira al usario escoger un auto ya prefabricado*/
    public void autosPrefabricados();

    /** Metodo que le permitira al usuario terminar su compra*/
    public void terminarCompra();
}
