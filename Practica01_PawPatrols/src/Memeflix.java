import java.util.LinkedList;
import java.util.Random;

/**
 *
 * Clase que implementa la empresa Memeflix de una interfaz sujeto
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */

public class Memeflix implements Sujeto {

    /** Atributos */
    private LinkedList<Usuario> listaClientesAct = new LinkedList();

    private LinkedList<Usuario> listaClientesBD = new LinkedList();

    private String listaRecomendaciones[] = new String[13];

    private Cobrador ditto;

    private String nombre = "Memeflix";


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
        listaRecomendaciones[0] = "El padrino";
        listaRecomendaciones[1] = "Buscando a nemo";
        listaRecomendaciones[2] = "BobEsponja";
        listaRecomendaciones[3] = "Cars";
        listaRecomendaciones[4] = "Cars 2";
        listaRecomendaciones[5] = "Naruto";
        listaRecomendaciones[6] = "Despicable Me";
        listaRecomendaciones[7] = "Despicable Me 2";
        listaRecomendaciones[8] = "Despicable Me 3";
        listaRecomendaciones[9] = "Minions";
        listaRecomendaciones[10] = "Minions 2";
        listaRecomendaciones[11] = "Hercules";
        listaRecomendaciones[12] = "Batman";
    }

     /**
     * Cobro de un dispositivo en memeflix
     * @param cliente a cobrar
     */
    public void asigna1Dispositivo(Usuario cliente) {
        ditto = new Memeflix1();
        cliente.getMeses()[0] += 1;
        ditto.cobrar(cliente, this);

    }

    /**
     * Cobro de dos dispositivo en memeflix
     * @param cliente a cobrar
     */
    public void asigna2Dispositivos(Usuario cliente) {

        ditto = new Memeflix2();
        cliente.getMeses()[0] += 1;
        ditto.cobrar(cliente, this);
    }

    /**
     * Cobro de cuatro dispositivo en memeflix
     * @param cliente a cobrar
     */
    public void asigna4Dispositivos(Usuario cliente) {

        ditto = new Memeflix4();
        cliente.getMeses()[0] += 1;
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
