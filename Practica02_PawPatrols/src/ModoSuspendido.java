

/**
 *
 * Clase que representa el estado "ModoSuspendido" que puede tomar el robot
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */
public class ModoSuspendido implements EstadoRobot {

    /*Creación del chefcito */
    Robot chefcito;

    /**
     * Contructor que crea a chefcito
     * @param chefcito
     */
    public ModoSuspendido(Robot chefcito) {
        this.chefcito = chefcito;
    }

    @Override
    public void activar() {
        if (chefcito.activarse()) {
            System.out.println(" \t  \" MODO CAMINANDO \" \n " + " \t   Ya estoy activado");
        } else {
            System.out.println(" \t  \" MODO SUSPENDIDO \" \n " + " \t    Activandome...");
               try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println(e);
        }
            chefcito.asignarNuevoEstado(chefcito.getEstadoCaminar());
        }
    }

    @Override
    public void caminar() {
        System.out.println(" \t  \" MODO SUSPENDIDO \" \n " + " \t   Estoy suspendido");
    }

    @Override
    public void atender() {
        System.out.println(" \t  \" MODO SUSPENDIDO \" \n " + " \t   Estoy suspendido");
    }

    @Override
    public void cocinar() {
        System.out.println(" \t  \" MODO SUSPENDIDO \" \n " + " \t   Estoy suspendido");
    }

    @Override
    public void suspenderse() {
        System.out.println(" \t  \" MODO SUSPENDIDO \" \n " + " \t   Estoy suspendido");
    }
}
