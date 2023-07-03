
/**
 * Clase que muestra las cualidades y componentes de una nave
 *
 * @version 1.0 Abril 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */
public class Nave {
    /*Precio*/
    int precio = 0;

    /*Componentes*/
    SistemaDePropulsion propulsion;

    Blindaje blindaje;

    Cabina cabina;

    Armas armas;

    /**
     * Construcor de una nave
     * @param propulsion sistema de propulsión que tendra
     * @param blindaje tipo de blindaje
     * @param cabina tipo de cabina que tendra
     * @param armas tipo de armas que tendra
     */
    public Nave(SistemaDePropulsion propulsion, Blindaje blindaje, Cabina cabina,
             Armas armas) {

        this.propulsion = propulsion;
        this.blindaje = blindaje;
        this.cabina = cabina;
        this.armas = armas;
    }

    /**
     * Método para saber el precio de la nave
     * @return precio de la nave
     */
    public int getPrecio() {
        precio = propulsion.getPrecio() + blindaje.getPrecio() + cabina.getPrecio() + armas.getPrecio();
        return precio;
    }

    /**
     * Método que mostrara la descripción de la nave
     */
    public void muestraNave() {
        System.out.println("*****Descripción de la nave*****\n\n" + propulsion.getDescripcion() + "\n" + cabina.getDescripcion()
                + "\n" + armas.getDescripcion() + "\n" + blindaje.getDescripcion() + "\n" + "Precio total: $" + this.getPrecio() +  "\n");
    }

}
