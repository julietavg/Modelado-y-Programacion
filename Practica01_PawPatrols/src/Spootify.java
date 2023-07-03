
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * Clase que implementa la empresa Spootify de una interfaz sujeto
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutierrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 *
 */
public class Spootify implements Sujeto {

    /** Atributos */

    private LinkedList<Usuario> listaClientesAct = new LinkedList();

    private LinkedList<Usuario> listaClientesBD = new LinkedList();

    private String listaRecomendaciones[] = new String[13];

    private Cobrador ditto;

    private String nombre = "Spootify";

     /** Metodos */

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
        listaRecomendaciones[0] = "Sunflower (Post Malone y Swae Lee)";
        listaRecomendaciones[1] = "Closer (The Chainsmokers y Halsey)";
        listaRecomendaciones[2] = "Shape of you (Ed Sheeran)";
        listaRecomendaciones[3] = "Blinding Lights (The Weeknd)";
        listaRecomendaciones[4] = "Dance Monkey (Tones and I)";
        listaRecomendaciones[5] = "Rockstar (Post Malone, 21 Savage)";
        listaRecomendaciones[6] = "Someone You Loved (Lewis Capaldi)";
        listaRecomendaciones[7] = "One Dance (Drake)";
        listaRecomendaciones[8] = "Closer (The Chainsmokers)";
        listaRecomendaciones[9] = "Believer (Imagine Dragons)";
        listaRecomendaciones[10] = "God's Plan (Drake)";
        listaRecomendaciones[11] = "Bohemian Rhapsody (Queen)";
        listaRecomendaciones[12] = "All of Me (John Legend)";
    }

     /**
     * Cobro la version normal de spootify
     * @param cliente a cobrar
     */

    public void spootifyNormal(Usuario cliente){
        ditto = new SpootifyNormal();
        cliente.getMeses()[2] += 1;
        ditto.cobrar(cliente, this);
    }

     /**
     * Cobro la version premium de spootify
     * @param cliente a cobrar
     */
    public void spootifyPremium(Usuario cliente){
        ditto = new SpootifyPremium();
        cliente.getMeses()[2] += 1;
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
