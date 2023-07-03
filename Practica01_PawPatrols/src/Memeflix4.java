
/**
 * Clase que realiza el cobro de cuatro dispositivos de Memeflix la cual
 * implementa una interfaz cobrador
 *
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */
public class Memeflix4 implements Cobrador {

    @Override
    public void cobrar(Usuario cliente, Sujeto empresa) {

        if (!empresa.getClientesAct().contains(cliente)) {
            System.out.println('\t' + cliente.getNombre() + '\t' + " no estas suscrit@ ):");
            return;
        }

        if (cliente.getSaldo() >= 200) {
            cliente.setSaldo(cliente.getSaldo() - 200);
            System.out.println("############################### \n"
                    + '\t' + "Bienvenid@ " + cliente.getNombre() + "\n"
                    + '\t' + "    MEMEFLIX" + "\n"
                    + "############################### \n"
                    + "  se realizo un cobro de $" + 200 + "\n"
                    + "      por 4 dispositivos \n"
                    + "  Tu saldo actual es de $" + cliente.getSaldo() + "\n"
                    + " llevas " + cliente.getMeses()[0] + " meses con nosotros. \n"
                    + "############################### \n");
        } else {
            empresa.cancelar(cliente);
            System.out.println('\t' + "No cuentas con dinero suficiente, finaliza tu suscripcion\n");
            return;
        }
    }

}
