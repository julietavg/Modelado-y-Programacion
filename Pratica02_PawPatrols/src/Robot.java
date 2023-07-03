
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Iterator;

/**
 *
 * Clase que representa al robot
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */
public class Robot {

    /*Hashtable del menu*/
    private Hashtable<Integer, Hamburguesa> menu;

    /* Estados del robot*/
    private boolean activado;
    private EstadoRobot estadoActual;
    private EstadoRobot modoSuspendido;
    private EstadoRobot modoCaminando;
    private EstadoRobot modoAtendiendo;
    private EstadoRobot modoCocinando;
    private EstadoRobot modoActivado;

    private int Hamburguesa = 0;

    /* Constructor de la clase */
    public Robot() {

        modoSuspendido = new ModoSuspendido(this);
        modoCaminando = new ModoCaminando(this);
        modoAtendiendo = new ModoAtendiendo(this);
        modoCocinando = new ModoCocinando(this);
        estadoActual = modoSuspendido;
        this.menu = new Hashtable<Integer, Hamburguesa>();
    }

    /**
     * Menu interno del robot con todos las hamburguesas disponibles
     */
    public void menuRobot(Iterator iterator) {
        while (iterator.hasNext()) {
            Hamburguesa hamburguesa = (Hamburguesa) iterator.next();
            this.menu.put(hamburguesa.id, hamburguesa);
        }
    }

    /**
     * Iterando el menú para mostrarlo
     */
    public void desplegarMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    /**
     * Muestra los platilos guardados en el menu interno del robot
     */
    public void muestraHamburguesa() {
        Iterator iteradorInterno = this.menu.values().iterator();
        while (iteradorInterno.hasNext()) {
            System.out.println(iteradorInterno.next());
        }
    }

    /**
     * Recibe la pedido del usuario y la guarda en la variable Hamburguesa
     * @return Integer pedido que se va a cocinar
     */
    public int tomarPedido() {
        Scanner scan = new Scanner(System.in);
        int pedido = 0;
        do {
            System.out.println("Ingrese el id ");
            if (scan.hasNextInt()) {
                pedido = scan.nextInt();
                if (!this.verificarID(pedido)) {
                    System.out.println("\t ID invalido\n"
                            + "Por favor escoge uno de los mostrados");
                }
            } else {
                scan.nextLine();
                System.out.println("\t ID invalido\n"
                        + "Por favor escoge uno de los mostrados");
            }
        } while (!this.verificarID(pedido));
        return pedido;
    }

    /**
     * Método booleano que verifica si el ID del usario 
     * se encuentra en el menu
     * @param id
     * @return 
     */
    private boolean verificarID(Integer id) {
        for (Hamburguesa plato : this.menu.values()) {
            if (plato.id == id) {
                return true;
            }
        }
        return false;
    }

    /**
     * Método para modificar la hamburguesa
     * @param Hamburguesa a modificar
     */
    public void setHamburguesa(int Hamburguesa) {
        this.Hamburguesa = Hamburguesa;
    }
    /**
     * Método para obtener la hamburguesa
     * @return hamburguesa
     */
    public Hamburguesa getHamburguesa() {
        return this.menu.get(this.Hamburguesa);
    }

    /**
     * Cambiar el estado el cual es robot se encuentra
     * @param nuevoEstado el estado al cual será cambiado
     */
    public void asignarNuevoEstado(EstadoRobot nuevoEstado) {
        estadoActual = nuevoEstado;
    }

    /**
     * Regresa el estado suspendido del robot
     * @return modoSuspendido
     */
    public EstadoRobot getEstadoSuspendido() {
        return modoSuspendido;
    }

    /**
     * Regresa el estado caminando del robot
     * @return modoCaminando
     */
    public EstadoRobot getEstadoCaminar() {
        return modoCaminando;
    }

    /**
     * Regresa el estado atentiendo del robot
     * @return modoAtendiendo
     */
    public EstadoRobot getEstadoAtendiendo() {
        return modoAtendiendo;
    }

    /**
     * Regresa el estado cocinando del robot
     * @return modoCocinado
     */
    public EstadoRobot getEstadoCocinando() {
        return modoCocinando;
    }

    /**
     * Método para activar al robot
     */
    public void activar() {
        estadoActual.activar();
    }

    /**
     * Método para hacer caminar al robot
     */
    public void caminar() {
        estadoActual.caminar();
    }

    /**
     * Método para que el robot atienda
     */
    public void atendiendo() {
        estadoActual.atender();
    }

    /**
     * Método para que el doctor cocine
     */
    public void cocinando() {
        estadoActual.cocinar();
    }

    /**
     * Método para suspender al robot
     */
    public void suspender() {
        estadoActual.suspenderse();
    }

    public boolean activarse() {
        return activado;
    }

    /**
     * Muestra los platilos guardados en el menu interno del robot
     */
    public void muestraConjuntoMenus() {
        Iterator iteradorConjunto = this.menu.values().iterator();
        while (iteradorConjunto.hasNext()) {
            System.out.println(iteradorConjunto.next());
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("   ");
        }
    }
}
