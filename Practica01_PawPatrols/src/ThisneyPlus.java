

import java.util.LinkedList;
import java.util.Random;

/**
 *
 * Clase que implementa la empresa Thisney+ de una interfaz sujeto
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */
public class ThisneyPlus implements Sujeto {

    /** Atributos  */

    private LinkedList<Usuario> listaClientesAct = new LinkedList();

    private LinkedList<Usuario> listaClientesBD = new LinkedList();

    private String listaRecomendaciones[] = new String[13];

    private String nombre = "ThisneyPlus";

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
        listaRecomendaciones[0] = "El rey leon";
        listaRecomendaciones[1] = "La bella y la bestia";
        listaRecomendaciones[2] = "Lilo y Stitch";
        listaRecomendaciones[3] = "Coco";
        listaRecomendaciones[4] = "Los increibles";
        listaRecomendaciones[5] = "Toy Story";
        listaRecomendaciones[6] = "Soul";
        listaRecomendaciones[7] = "Una nueva esperanza";
        listaRecomendaciones[8] = "Capitan America";
        listaRecomendaciones[9] = "Guardianes de la Galaxia";
        listaRecomendaciones[10] = "Los Vengadores";
        listaRecomendaciones[11] = "Pesadilla antes de Navidad";
        listaRecomendaciones[12] = "Harry Potter";

    }

    /**
     * Asigna que tipo de suscripción tendra el cliente y que tipo
     * de pago será dependiendo los meses
     * @param cliente a cobrar
     */

    public void asigna(Usuario cliente) {
        if (cliente.getMeses()[4] <= 2) {
            asignaPruebaTH(cliente);
        } else {
            asignaNormalTH(cliente);
        }
    }

     /**
     * Cobro al cliente de la thisney version prueba
     * @param cliente a cobrar
     */
    public void asignaPruebaTH(Usuario cliente) {
        ditto = new ThisneyPrueba();
        cliente.getMeses()[4] += 1;
        ditto.cobrar(cliente, this);
    }

     /**
     * Cobro al cliente de la thisney version normal
     * @param cliente a cobrar
     */
    public void asignaNormalTH(Usuario cliente) {
        ditto = new ThisneyNormal();
        cliente.getMeses()[4] += 1;
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
