
import java.util.Scanner;

/**
 * Clase que representará a Argentina con los métodos de vista
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */

public class ArgentinaVista {

    static Scanner scan = new Scanner(System.in);
    
    /* Para accedar a las vistas y controladores*/
    static RegistrarseControlador registro = new RegistrarseControlador();
    static ArgentinaControlador controlador = new ArgentinaControlador();

    /**
     * Los siguientes métodos permiten al usuario ingresar una opcion
     * dependiendo menu,componente y porsche que desee
     *
     * @return opcion del usuario
     */
    
    public int mostrarMenuVista() {
          System.out.println(" Bienvenido a la sucursusal argentina che" 
                + "\n Selecciona una opción che \n 1. Crear tu propio coche \n 2. Escoger uno de nuestra agencia \n ");
        int opcion = Integer.parseInt(scan.nextLine());
        return opcion;
    }

    public int armarAutoModelo() {
    	System.out.println("Escoge los componentes de tu auto\n ");
        System.out.println(" \t Modelo \n" + "Ingresa opcion que te gustaria\n\n"
                + "1. Modelo 718 \n" + "2. Modelo 911 \n" + "3. Modelo Macan \n" + "4. Modelo Cayenne \n");
        int opcion = Integer.parseInt(scan.nextLine());
        return opcion;
    }

    public int armarAutoCombustible() {
        System.out.println(" \t Tipo de combustible \n" + "Ingresa opcion que te gustaria\n"
                + "1. Gasolina \n" + "2. Hibrido \n");
        int opcion = Integer.parseInt(scan.nextLine());
        return opcion;
    }

    public int armarAutoPintura() {
        System.out.println(" \t Pintura exterior \n" + "Ingresa opcion que te gustaria\n"
                + "1. Pintura rojo metalico \n" + "2. Pintura blanco cromado \n" + "3. Pintura negra mate \n");
        int opcion = Integer.parseInt(scan.nextLine());
        return opcion;
    }

    public int armarAutoTransmision() {
        System.out.println(" \t  Tipo de transmision \n" + "Ingresa opcion que te gustaria\n"
                + "1. Manual \n" + "2. Automatico \n");
        int opcion = Integer.parseInt(scan.nextLine());
        return opcion;
    }

    public int armarAutoMotor() {
        System.out.println(" \t Motor \n" + "Ingresa opcion que te gustaria\n"
                + "1. Motor V6 \n" + "2. Motor V8 \n" + "3. Motor V10 \n");
        int opcion = Integer.parseInt(scan.nextLine());
        return opcion;
    }

    public int armarAutoAudio() {
        System.out.println(" \t Audio \n" + "Ingresa opcion que te gustaria\n"
                + "1. Audio Bose \n" + "2. Audio JBL \n" + "3. Audio Porsche \n");
        int opcion = Integer.parseInt(scan.nextLine());
        return opcion;

    }

    public int eligeAutoVista() {
        System.out.println("Elige el numero del carro que deseas comprar che:");
        int opcion = Integer.parseInt(scan.nextLine());
        return opcion;
    }
    
    /**
     * Método para desplegar la información del auto armado
     */
    public void armarAuto(){
        System.out.println(controlador.armarAutoAux());
     
    }
    
    /**
     * Método para desplegar la información de los autos prefabricado
     */
    public void autosPrefabricadosVista() {
        System.out.println(controlador.autosPrefabricadosAux());
    }

    /**
     * Metodo para terminar la compra
     * @return mensaje para el usuario
     */
    public String terminarCompraVista() {
        return " Iniciando tu compraa "
                + "\n Bienvenido/a " + registro.getUsuarioIngreso()
                + "\n \t Procederemos con tu compra segura "; 
    }

     /**
     * Metodo para que el usuario ingrese los datos para realizar el proxy
     */
    public void proxyVista() {
        System.out.println("Bienvenido a tu compra segura che");
        System.out.println("Ingresa tu CVC");
        String CVC = scan.nextLine();
        System.out.println("Ingresa tu usuario de nuevo");
        String userA = scan.nextLine();
        if (controlador.proxy(CVC, userA) == true) {
            System.out.println("\nTu compra se ha realizado con exito che! \n");
        } else {
            System.out.println("Tu compra se ha cancelado boludo): ");
        }
    }
    
}

