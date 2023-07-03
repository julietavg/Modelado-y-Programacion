import java.util.LinkedList;
import java.util.Random;

/**
 *
 * Clase que implementa la empresa Momazon de una interfaz sujeto
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */

public class Momazon implements Sujeto {

    /** Atributos*/

    private LinkedList<Usuario> listaClientesAct = new LinkedList();

    private LinkedList<Usuario> listaClientesBD = new LinkedList();

    private String listaRecomendaciones[] = new String[13];

    private Cobrador ditto;

    private String nombre = "Momazon";

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
            System.out.println( " \t" +" Bienvenido de vuelta " + cliente.getNombre() + "!");
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
        listaRecomendaciones[0] = "Erase una vez en... Hollywood";
        listaRecomendaciones[1] = "Rocketman";
        listaRecomendaciones[2] = "Un lugar tranquilo 2";
        listaRecomendaciones[3] = "Un momento en el tiempo";
        listaRecomendaciones[4] = "El hombre invisible";
        listaRecomendaciones[5] = "El faro";
        listaRecomendaciones[6] = "La guerra del manana";
        listaRecomendaciones[7] = "Synchronic. Los limites del tiempo";
        listaRecomendaciones[8] = "Midsommar";
        listaRecomendaciones[9] = "Sin remordimientos";
        listaRecomendaciones[10] = "Sound of Metal";
        listaRecomendaciones[11] = "The Florida Project";
        listaRecomendaciones[12] = "El sacrificio de un ciervo sagrado";
    }


     /**
     * Cobro la version normal de momazon
     * @param cliente a cobrar
     */

    public void momazonNormal(Usuario cliente){
        ditto = new MomazonNormal();
        cliente.getMeses()[1] += 1;
        ditto.cobrar(cliente, this);
    }

     /**
     * Cobro la version premium de momazon
     * @param cliente a cobrar
     */
    public void momazonPremium(Usuario cliente){
        ditto = new MomazonPremium();
        cliente.getMeses()[1] += 1;
        ditto.cobrar(cliente, this);
    }

    @Override
    public String getRecomendacion() {

    	int random = new Random().nextInt(listaRecomendaciones.length);
        return listaRecomendaciones[random];

    }

    @Override
    public void actualizar() {
    	for(Usuario usuario : listaClientesAct) {
    		usuario.update(this);
    	}
    }
}
