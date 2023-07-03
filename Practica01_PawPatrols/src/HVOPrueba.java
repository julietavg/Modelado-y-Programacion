
/**
 * Clase que realiza el cobro de la version prueba de HVO la cual implementa una
 * interfaz cobrador
 *
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Guti�rrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 *
 */
public class HVOPrueba implements Cobrador {

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
                    + '\t' + "    HVO Prueba " + "\n"
                    + "############################### \n"
                    + "  se realizo un cobro de $" + 0 + "\n"
                    + "   por la version de prueba \n"
                    + "  Tu saldo actual es de $" + cliente.getSaldo() + "\n"
                    + " llevas " + cliente.getMeses()[3] + " meses con nosotros. \n"
                    + "############################### \n");
        } else if (cliente.getSaldo() < 0) {
            System.out.println('\t' + "No cuentas con dinero suficiente");
            empresa.cancelar(cliente);

        }

    }
}
