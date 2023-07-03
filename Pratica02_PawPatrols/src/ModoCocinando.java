
/**
 *
 * Clase que representa el estado "ModoCocinando" que puede tomar el robot
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */
public class ModoCocinando implements EstadoRobot {

    /*Creación del chefcito */
    Robot chefcito;

    /**
     * Contructor que crea a chefcito
     * @param chefcito
     */
    public ModoCocinando(Robot chefcito) {
        this.chefcito = chefcito;
    }

    @Override
    public void activar() {
        System.out.println(" \t  \" MODO COCINANDO \" \n " + " \t   Ya estoy activado");

    }

    @Override
    public void caminar() {
        System.out.println(" \t  \" MODO COCINANDO \" \n " + " \t   Estoy cocinando no puedo moverme");

    }

    @Override
    public void suspenderse() {
        System.out.println(" \t  \" MODO COCINANDO \" \n " + " \t   Ya estoy suspendido");
        chefcito.asignarNuevoEstado(chefcito.getEstadoSuspendido());
    }

    @Override
    public void atender() {
        System.out.println(" \t  \" MODO COCINANDO \" \n " + " \t   Estoy cocinando no puedo atenderte");
    }

    @Override
    public void cocinar() {
        System.out.println("\t Empezando tu pedido " + chefcito.getHamburguesa());
        Hamburguesa platoPorCocinar = chefcito.getHamburguesa();
        platoPorCocinar.template();
        chefcito.setHamburguesa(0);
        System.out.println("\t Platillo listo, me suspenderé...");
        chefcito.asignarNuevoEstado(chefcito.getEstadoSuspendido());
    }
}
