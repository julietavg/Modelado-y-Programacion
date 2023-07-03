
import java.util.LinkedList;

/**
 *
 * Clase que implementa un usuario el cual será el observador
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutierrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 *
 */
public class Usuario implements Observer {

    /**   Atributos   */

    private String nombre;

    private Sujeto empresa;

    private LinkedList<Integer> misSuscripciones = new LinkedList();

    private LinkedList<Sujeto> misServicios = new LinkedList();

    private int[] meses = {0,0,0,0,0};

    private int saldo;

     /**
     * Constructor de un Usuario
     * @param nombre del usuario
     * @param saldo del usuario
     */
    public Usuario(String nombre, int saldo) {

        this.nombre = nombre;
        this.saldo = saldo;
    }

    /**
     * Metodo para obtener el nombre del usuario
     * @return
     */
    public String getNombre() {

        return nombre;
    }

    /**
     * Metodo para obtener los meses que llevas
     * trasncurridos en una empresa
     * @return meses transcurridos
     */

    public int[] getMeses() {
        return meses;
    }

    /**
     * Metodo para modificar los meses
     */
    public void setMeses() {
        meses[0] = 10;
    }

    /**
     * Metodo para modificar el saldo
     * @param saldo del usuario
     */
    public void setSaldo(int saldo) {

        this.saldo = saldo;
    }

    /**
     * Metodo para obtener el saldo
     * @return saldo del usuario
     */
    public int getSaldo() {

        return saldo;
    }

    /**
     * Lista de empresas de un usuario
     * @return misServivios
     */
    public LinkedList<Sujeto> getServicios() {

        return misServicios;
    }

    /**
     * Metodo para suscribirse a una empresa
     * @param empresa a suscribir
     */
    public void suscribirse(Sujeto empresa) {

        this.empresa = empresa;
        misServicios.add(empresa);

    }

    /**
     * Metodo para cancelar la suscripcion
     * @param empresa a cancelar
     */
    public void cancelarSuscripcion(Sujeto empresa) {

        misServicios.remove(empresa);
    }

    @Override
    public void update(Sujeto empresa) {
        System.out.println(empresa.getNombre() + ": Hola! " + this.getNombre() + " deberias echarle \n"
                + "   un vistazo a " + empresa.getRecomendacion() + "\n");
    }

}
