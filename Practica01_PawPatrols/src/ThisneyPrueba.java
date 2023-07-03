
/**
 * Clase que realiza el cobro de la versión prueba de Thiney la cual
 *            implementa una interfaz cobrador
 *
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */
public class ThisneyPrueba implements Cobrador {


    @Override
    public void cobrar(Usuario cliente, Sujeto empresa) {

        if (!empresa.getClientesAct().contains(cliente)) {
            System.out.println('\t' + cliente.getNombre() + '\t' + " no estas suscrit@ ):");
            return;
        }
        if (cliente.getSaldo() >= 130) {
            cliente.setSaldo(cliente.getSaldo() - 130);
            System.out.println("############################### \n"
                    + '\t' + "Bienvenid@ " + cliente.getNombre() + "\n"
                    + '\t' + " Thisney Prueba " + "\n"
                    + "############################### \n"
                    + "  se realizo un cobro de $" + 130 + "\n"
                    + "   por la version de prueba \n"
                    + "  Tu saldo actual es de $" + cliente.getSaldo() + "\n"
                    + " llevas " + cliente.getMeses()[4] + " meses con nosotros. \n"
                    + "############################### \n");

        } else if (cliente.getSaldo() < 130) {
            System.out.println('\t' + "No cuentas con dinero suficiente");
            empresa.cancelar(cliente);
            return;
        } else {
            System.out.println('\t' + " Se acabó tu version de prueba \n");
            empresa.cancelar(cliente);
            return;
        }

    }
}
