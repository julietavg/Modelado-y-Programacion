
/**
 *
 * Clase que representa el estado "ModoCaminado" que puede tomar el robot
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */

public class ModoCaminando implements EstadoRobot {

    /*Creación del chefcito */
    Robot chefcito;

    /**
     * Contructor que crea a chefcito
     * @param chefcito
     */
    public ModoCaminando(Robot chefcito) {
        this.chefcito = chefcito;
    }

    @Override
    public void activar() {
        System.out.println(" \t  \" MODO CAMINANDO \" \n " + " \t   Ya estoy activado");

    }

    @Override
    public void caminar() {
        System.out.println(" \t  \" MODO CAMINANDO \" \n " + " \t   Estoy en camino");
        chefcito.asignarNuevoEstado(chefcito.getEstadoAtendiendo());
    }

    @Override
    public void atender() {
        System.out.println(" \t  \" MODO CAMINANDO \" \n " + " \t  Aún no estoy caminado \n"
                + "\tPor favor escoge la opción 2");
    }

    @Override
    public void cocinar() {
        System.out.println(" \t  \" MODO CAMINANDO \" \n " + " \t   Aún no estoy caminando\n"
                + "\tPor favor escoge la opción 2");
    }

    @Override
    public void suspenderse() {
        System.out.println(" \t  \" MODO CAMINANDO \" \n " + " \t  Me suspenderé");
        chefcito.asignarNuevoEstado(chefcito.getEstadoSuspendido());

    }
}
