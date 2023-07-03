
/**
 * Clase que realiza el cobro del costo gratutito de Spootify la cual implementa
 * una interfaz cobrador
 *
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */
public class SpootifyNormal implements Cobrador {

    @Override
    public void cobrar(Usuario cliente, Sujeto empresa) {

        if (!empresa.getClientesAct().contains(cliente)) {
            System.out.println('\t' + cliente.getNombre() + '\t' + " no estas suscrit@ ):");
            return;
        }
        if (cliente.getSaldo() >= 0) {
            cliente.setSaldo(cliente.getSaldo() - 0);
            System.out.println("############################### \n"
                    + '\t' + "Bienvenid@ " + cliente.getNombre() + "\n"
                    + '\t' + " Spootify Normal " + "\n"
                    + "############################### \n"
                    + "  se realizo un cobro de $" + 0 + "\n"
                    + "   por la version gratuita  \n"
                    + "  Tu saldo actual es de $" + cliente.getSaldo() + "\n"
                    + " llevas " + cliente.getMeses()[2] + " meses con nosotros. \n"
                    + "############################### \n");

        } else {
            empresa.cancelar(cliente);
            System.out.println('\t' + "No cuentas con dinero suficiente, finaliza tu suscripcion\n");
            return;
        }
    }

}
