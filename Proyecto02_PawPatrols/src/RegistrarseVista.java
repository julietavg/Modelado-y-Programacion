
import java.io.*;
import java.util.Scanner;

/**
 * Clase que simula el registro e ingreso de los usuarios con métodos de la
 * vista
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */
public class RegistrarseVista {

    public static Scanner scan = new Scanner(System.in);
    RegistrarseControlador controlador = new RegistrarseControlador();

    /**
     * Método que le pide las entradas al usuario para registrarse
     * @throws java.io.IOException en caso que haya un error en la escritura
     */
    public void registrarseVista() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nombre ");
        String nombre = sc.nextLine();
        System.out.println("Ingresa tu contrasena ");
        String contrasena = sc.nextLine();
        System.out.println("Ingresa tu direccion ");
        String direccion = sc.nextLine();
        while (true) {
            try {
                System.out.println("Ingresa tu tarjeta bancaria ");
                int tarjeta = Integer.parseInt(scan.nextLine());
                System.out.println("Ingresa tu CVC");
                int cvc = Integer.parseInt(scan.nextLine());
                RegistrarseControlador.registrarseController(nombre, contrasena, direccion, tarjeta, cvc);
                break;
            } catch (NumberFormatException e) {
                System.out.println("\n\t Solo puedes ingresar numeros");
            }
        }
    }

    /**
     * Metodo que le permite a un usuario ingresar para verificar sus datos
     * @return true si lo encuentra false en otro caso
     */
    public boolean ingresoVista() {
        System.out.println("Ingresa tu usuario");
        controlador.usuarioIngreso = scan.nextLine();
        System.out.println("Ingresa tu contraseña");
        controlador.contrasenaIngreso = scan.nextLine();
        controlador.ingresoController(controlador.usuarioIngreso, controlador.contrasenaIngreso);
        if (controlador.ingresoController(controlador.usuarioIngreso, controlador.contrasenaIngreso) == "Bienvenido") {
            return true;
        } else {
            System.out.println(controlador.ingresoController(controlador.usuarioIngreso, controlador.contrasenaIngreso));
            return false;
        }
    }

    /**
     * Metodo que permite ver las opciones al usuario por si quiere registrarse
     * o entrar
     * @return opcion del usuario
     */
    public int inicioVista() {
        System.out.println("Que quieres hacer? \n 1. Ingresar \n 2. Registrarse ");
        int opcion = Integer.parseInt(scan.nextLine());
        return opcion;
    }

}
