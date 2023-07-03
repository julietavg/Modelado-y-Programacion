
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Usuario user; 
    static Pais ditto = new Pais();
    public static Scanner scan = new Scanner(System.in);

    public static Usuario chem = new Usuario("chem", "123",
            "Chemcito", "Avenida 12", "Mexico", "553029", "chem123");

    public static Usuario chemA = new Usuario("chemita", "321",
            "Chemcita", "Calle 16", "USA", "553129", "chemita321");

    public static Usuario chemB = new Usuario("chemito", "1234",
            "Chemito", "Cerrada 231", "Espana", "556123", "chemito1234");

    public static final ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

    public static String usuarioIngreso, contrasenaIngreso;
    public static boolean salir;
    public static Usuario actual;
    public static Main ingreso = new Main();

    public static void main(String[] args) {
        ingreso.bienvenida();
    }

    public void bienvenida() {
        while (true) {
            try {
                System.out.println(" \t Bienvenido \n ");
                System.out.println(" 1. Iniciar Sesion \n 2. Salir de la simuación");
                int opcion = Integer.parseInt(scan.nextLine());

                switch (opcion) {
                    case 1:
                        ingreso.simulacion();
                    case 2:
                        return;
                    default:
                        System.out.println(" Opcion no disponible \n");
                }

            } catch (NumberFormatException e) {
                System.out.println("Ingresa una entrada valida \n");
            }
        }
    }

    /**
     * Metodo para ingresar si los datos son correctos
     *
     * @param usuario a ingresar
     * @param contrasena del usuario
     */
    public static Usuario ingresar(String usuario, String contrasena) {
        for (Usuario user : usuarios) {
            if (user.getNombreUsuario().equals(usuario)) {
                if (user.getContrasena().equals(contrasena)) {
                    return user;
                }
            }
        }
        return null;
    }

    /**
     * Metodo para almacenar los datos recibidos
     */
    public void ingreso() {

        System.out.println("Ingresa tu usuario");
        usuarioIngreso = scan.nextLine();
        System.out.println("Ingresa tu contraseña");
        contrasenaIngreso = scan.nextLine();
        Main.actual = ingresar(usuarioIngreso, contrasenaIngreso);
    }

    /**
     * Método para iniciar la simulación
     */
    public void simulacion() {
        usuarios.add(chem);
        usuarios.add(chemA);
        usuarios.add(chemB);
        ingreso.ingreso();
        while (ingreso.actual == null) {
            System.out.println("\nNo estas en la base de datos" + "\n\tIntentalo de nuevo \n");
            ingreso.ingreso();
        }
        if (actual.getPaisOrigen().equals("Mexico")) {
            ditto.setSaludo(new SaludarMexico());
            ditto.mostrarSaludo();
            ditto.setMenu(new MostrarMenuMexico());
            ditto.mostrarMenu();
            if (salir == false) {
                ditto.setTerminarCompra(new TerminarCompraMexico());
                ditto.terminarCompra();
                ingreso.bienvenida();

            } else {
                ingreso.Salir(false);
                ingreso.bienvenida();
            }
        } else if (actual.getPaisOrigen().equals("Espana")) {
            ditto.setSaludo(new SaludarEspana());
            ditto.mostrarSaludo();
            ditto.setMenu(new MostrarMenuEspana());
            ditto.mostrarMenu();
            if (salir == false) {
                ditto.setTerminarCompra(new TerminarCompraEspana());
                ditto.terminarCompra();
                ingreso.bienvenida();
            } else {
                ingreso.Salir(false);
                ingreso.bienvenida();
            }
        } else if (actual.getPaisOrigen().equals("USA")) {
            ditto.setSaludo(new SaludarUSA());
            ditto.mostrarSaludo();
            ditto.setMenu(new MostrarMenuUSA());
            ditto.mostrarMenu();
            if (salir == false) {
                ditto.setTerminarCompra(new TerminarCompraUSA());
                ditto.terminarCompra();
                ingreso.bienvenida();
            } else {
                ingreso.Salir(false);
                ingreso.bienvenida();
            }
        }
    }

    /**
     * Metodo para obtener el usuario ingresado.
     */
    public String getUsuarioIngreso() {
        return usuarioIngreso;
    }

    /**
     * Metodo para modificar la salida del programa.
     */
    public void Salir(boolean salir) {
        this.salir = salir;
    }

}
