
/**
 * Clase que representa un porsche con todos sus componentes
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */
public class Porsche {

    /*Precio*/
    int precio = 0;

    /*Componentes*/
    String nombre;
    Modelo modelo;
    Combustible combustible;
    Pintura pintura;
    Transmision transmision;
    Motor motor;
    Audio audio;

    /**
     * Constructor de un auto
     *
     * @param modelo del auto
     * @param combustible tipo de combustible
     * @param pintura del auto
     * @param transmision tipo de transmision
     * @param motor del auto
     * @param audio del auto
     */
    public Porsche(String nombre, Modelo modelo, Combustible combustible, Pintura pintura, Transmision transmision,
            Motor motor, Audio audio) {

        this.nombre = nombre;
        this.modelo = modelo;
        this.combustible = combustible;
        this.pintura = pintura;
        this.transmision = transmision;
        this.motor = motor;
        this.audio = audio;
    }

    /**
     * Método para saber el precio del auto
     * @return precio de la nave
     */
    public int getPrecio() {
        precio = modelo.getPrecio() + combustible.getPrecio() + pintura.getPrecio() + transmision.getPrecio()
                + motor.getPrecio() + audio.getPrecio();
        return precio;
    }

    /**
     * Método que mostrara el precio del auto
     */
    public String muestraPorsche() {
        return "*****Descripcion del Porsche *****\n\n" + nombre + "\n\n" + modelo.getDescripcion() + "\n" + combustible.getDescripcion()
                + "\n" + pintura.getDescripcion() + "\n" + transmision.getDescripcion() + "\n" + motor.getDescripcion() + "\n"
                + audio.getDescripcion() + "\n\n" + "Precio total: $" + this.getPrecio() + "\n";
    }

}
