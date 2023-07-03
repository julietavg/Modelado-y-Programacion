import java.util.Scanner;

/**
 *
 * Clase que representa el estado "ModoAtendiendo" que puede tomar el robot
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */
public class ModoAtendiendo implements EstadoRobot {

    /*Creación del chefcito */
    Robot chefcito;

    /**
     * Contructor que crea a chefcito
     * @param chefcito
     */
    public ModoAtendiendo(Robot chefcito) {
        this.chefcito = chefcito;
    }

    /* Menus */
    MenuDinamico menuDiario = new MenuDinamico();
    MenuGeneral menuGeneral = new MenuGeneral();
    MenuEspecial menuEspecial = new MenuEspecial();

    /* Scanner para el usuario*/
    Scanner sc = new Scanner(System.in);
    int opcion;

    @Override
    public void activar() {
        System.out.println(" \t  \" MODO ATENDIENDO \" \n " + " \t   Ya estoy activado");
    }

    @Override
    public void caminar() {
        System.out.println(" \t  \" MODO ATENDIENDO \" \n " + " \t   Te estoy atendiendo no puedo caminar.");

    }

    @Override
    public void atender() {

        chefcito.menuRobot(menuGeneral.iterator());
        chefcito.menuRobot(menuDiario.getIterador());
        chefcito.menuRobot(menuEspecial.getIterador());

        System.out.println("Mostrando el menú \n");

        chefcito.muestraConjuntoMenus();

        System.out.println("Por favor escoge el id de la hamburguesa");
        chefcito.setHamburguesa(chefcito.tomarPedido());
        chefcito.asignarNuevoEstado(chefcito.getEstadoCocinando());
        System.out.println("\tPara cocinar tu pedido por favor escoge opcion 4");
    }

    @Override
    public void cocinar() {
        System.out.println(" \t  \" MODO ATENDIENDO \" \n " + " \t  Aún no tengo tu orden.");
    }

    @Override
    public void suspenderse() {
        System.out.println(" \t  \" MODO ATENDIENDO \" \n " + " \t   Te estoy atendiendo no puedo apagarme.");
    }
}
