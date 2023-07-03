
import java.util.Scanner;

/**
 * Clase que representará a Canada con los métodos de vista
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */
public class CanadaVista {

    static Scanner scan = new Scanner(System.in);

    /* Para accedar a las vistas y controladores*/
    static RegistrarseControlador registro = new RegistrarseControlador();
    static CanadaControlador controlador = new CanadaControlador();

    
    /**
     * Los siguientes métodos permiten al usuario ingresar una opcion
     * dependiendo menu,componente y porsche que desee
     *
     * @return opcion del usuario
     */
    
    public int mostrarMenuVista() {
        System.out.println(" Welcome to our Canadian branch "
                + "\n Select an option\n 1. Create your own car\n 2. Choose one from our selection ");
        int opcion = Integer.parseInt(scan.nextLine());
        return opcion;
    }

    public int armarAutoModelo() {
    	System.out.println("Choose the components of your car\n ");
        System.out.println(" \t Model \n" + "Enter the number of the option you would like to select\n"
                + "1. Model 718 \n" + "2. Model 911 \n" + "3. Macan model \n" + "4. Cayenne model \n");
        int opcion = Integer.parseInt(scan.nextLine());
        return opcion;
    }

    public int armarAutoCombustible() {
        System.out.println(" \t Type of fuel \n" + "Enter the number of the option you would like to select\n"
                + "1. Gas \n" + "2. Hybrid \n");
        int opcion = Integer.parseInt(scan.nextLine());
        return opcion;
    }

    public int armarAutoPintura() {
        System.out.println(" \t Exterior paint \n" + "Enter the number of the option you would like to select\n"
                + "1. Metallic red paint \n" + "2. White chrome paint \n" + "3. Matte black paint \n");
        int opcion = Integer.parseInt(scan.nextLine());
        return opcion;
    }

    public int armarAutoTransmision() {
        System.out.println(" \t  Transmission type \n" + "Enter the number of the option you would like to select\n"
                + "1. Manual \n" + "2. Automatic \n");
        int opcion = Integer.parseInt(scan.nextLine());
        return opcion;
    }

    public int armarAutoMotor() {
        System.out.println(" \t Motor \n" + "Enter the number of the option you would like to select\n"
                + "1. Motor V6 \n" + "2. Motor V8 \n" + "3. Motor V10 \n");
        int opcion = Integer.parseInt(scan.nextLine());
        return opcion;
    }

    public int armarAutoAudio() {
        System.out.println(" \t Audio \n" + "Enter the number of the option you would like to select\n"
                + "1. Audio Bose \n" + "2. Audio JBL \n" + "3. Audio Porsche \n");
        int opcion = Integer.parseInt(scan.nextLine());
        return opcion;

    }

    public int eligeAutoVista() {
        System.out.println("Choose the number of the car you want to buy ");
        int opcion = Integer.parseInt(scan.nextLine());
        return opcion;
    }

    /**
     * Método para desplegar la información del auto armado
     */
    public void armarAuto() {
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
                + "\n \t Procederemos con tu compra segura " + " Recuerda solo tienes 1 minuto para realizar tu pago"
                + "si no tu compra sera cancelada \n";
    }

    /**
     * Metodo para que el usuario ingrese los datos para realizar el proxy
     */
    public void proxyVista() {
        System.out.println("Welcome to your secure purchase");
        System.out.println("Enter your cvc");
        String CVC = scan.nextLine();
        System.out.println("Enter your username again");
        String userA = scan.nextLine();
        if (controlador.proxy(CVC, userA) == true) {
            System.out.println(" \n Your purchase has been successfully completed! \n");
        } else {
            System.out.println("Your purchase has been cancelled my friend):");
        }
    }
}
