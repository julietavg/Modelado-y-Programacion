import java.util.LinkedList;
import java.util.Random;

/**
 *
 * Clase que implementa la empresa HVO Max de una interfaz sujeto
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */

public class HVOMax implements Sujeto {

    /** Atributos */
    private LinkedList<Usuario> listaClientesAct = new LinkedList();

    private LinkedList<Usuario> listaClientesBD = new LinkedList();

    private String listaRecomendaciones[] = new String[13];

    private String nombre = "HVO MAX";

    private Cobrador ditto;

    /** Métodos */

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public Usuario getCliente(String nombre) {
        return null;
    }

    @Override
    public LinkedList<Usuario> getBD() {

        return listaClientesBD;
    }

    @Override
    public LinkedList<Usuario> getClientesAct() {
        return listaClientesAct;
    }

    @Override
    public void registrar(Usuario cliente) {
        if (listaClientesBD.contains(cliente) == false) {
            System.out.println("   Bienvenido a " + this.getNombre() + " " + cliente.getNombre() + "\n" +
                    "     inicia tu suscripción ");
            listaClientesBD.add(cliente);
            listaClientesAct.add(cliente);
        }
        if (listaClientesBD.contains(cliente) && !listaClientesAct.contains(cliente)) {
            System.out.println(" Bienvenido de vuelta " + cliente.getNombre() + "!");
            listaClientesAct.add(cliente);
        }

    }

    @Override
    public void cancelar(Usuario cliente) {
        listaClientesAct.remove(cliente);
        System.out.println(" Lamentamos que dejes el servicio): de " +
                this.getNombre() + " "+ cliente.getNombre());
    }

    @Override
    public void llenaBD() {
        listaRecomendaciones[0] = "Insomnia";
        listaRecomendaciones[1] = "The Great Gatsby";
        listaRecomendaciones[2] = "Jurassic Park";
        listaRecomendaciones[3] = "2001: Una odisea en el espacio";
        listaRecomendaciones[4] = "The Knick";
        listaRecomendaciones[5] = "Matrix";
        listaRecomendaciones[6] = "Silicon Valley";
        listaRecomendaciones[7] = "Game of Thrones";
        listaRecomendaciones[8] = "The oficce";
        listaRecomendaciones[9] = "House";
        listaRecomendaciones[10] = "Succession";
        listaRecomendaciones[11] = "House";
        listaRecomendaciones[12] = "Aquaman";
    }

    /**
     * Asigna que tipo de suscripción tendra el cliente y que tipo
     * de pago será dependiendo los meses
     * @param cliente a cobrar
     */
    public void asigna(Usuario cliente) {
        if (cliente.getMeses()[3] <= 2) {
            asignaPruebaHVO(cliente);
        } else {
            asignaNormalHVO(cliente);
        }
    }

    /**
     * Cobro del cliente de HVO Prueba
     * @param cliente a cobrar
     */

    public void asignaPruebaHVO(Usuario cliente) {
        ditto = new HVOPrueba();
        cliente.getMeses()[3] += 1;
        ditto.cobrar(cliente, this);
    }

    /**
     * Cobro del cliente de HVO Normal
     * @param cliente a cobrar
     */

    public void asignaNormalHVO(Usuario cliente) {
        ditto = new HVONormal();
        cliente.getMeses()[3] += 1;
        ditto.cobrar(cliente, this);
    }

    @Override
    public String getRecomendacion() {
        int random = new Random().nextInt(listaRecomendaciones.length);
        return listaRecomendaciones[random];
    }

    @Override
    public void actualizar() {
        for (Usuario usuario : listaClientesAct) {
            usuario.update(this);
        }
    }


}
