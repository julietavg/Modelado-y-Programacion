
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que simula el registro e ingreso de los usuarios con métodos del
 * controlador
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */
public class RegistrarseControlador {

    /** Usuario*/
    static Usuario usuario;
    
    /** Usuario que ingreso y su contraseña*/
    static String usuarioIngreso, contrasenaIngreso;
    
    /** Lista de usuarios */
    static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    
    /** Para tener acceso al registrarse vista*/
    static RegistrarseVista registrarseVista = new RegistrarseVista();

    /**
     * Método que busca un usuarios desde un archivo txt
     * @throws IOException en caso de tener un error con 
     *  el archivo
     */
    public static void encontrarUsuario() throws IOException {
        List data = new ArrayList<String>();
        try {
            String str;
            BufferedReader reader = new BufferedReader(new FileReader("Usuarios.txt"));

            while ((str = reader.readLine()) != null) {
                data.add(str);
            }
        } catch (FileNotFoundException e) {
            System.out.println(" El archivo no existe");
        } catch (IOException e) {
            System.out.println(" No se puede leer el archivo");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < data.size(); i++) {
            String nombre = (String) data.get(i);
            i++;
            String contrasena = (String) data.get(i);
            i++;
            String direccion = (String) data.get(i);
            i++;
            String tarjetaBancaria = (String) data.get(i);
            i++;
            String cvc = (String) data.get(i);
            i++;
            usuario = new Usuario(nombre, contrasena, direccion, tarjetaBancaria, cvc);
            usuarios.add(usuario);

        }
    }

     /**
      * Método que registrará en nuevo usuario y lo guardará en el txt
      * @param nombre del usuario a registrar
      * @param contrasena del usuario a registrar
      * @param direccion del usuario a registrar
      * @param tarjetaBancaria del usuario a registrar
      * @param cvc del usuario a registrar
      * @throws IOException en caso de que haya un error al escribir
      */
    public static void registrarseController(String nombre, String contrasena, String direccion,
            int tarjetaBancaria, int cvc) throws IOException {
        try {
            File archivo = new File("Usuarios.txt");
            FileWriter escribir = new FileWriter(archivo, true);
            escribir.write("\n");
            escribir.write(nombre + "\n");
            escribir.write(contrasena + "\n");
            escribir.write(direccion + "\n");
            escribir.write(tarjetaBancaria + "\n");
            escribir.write(cvc + "\n");
            escribir.close();
        } //Si existe un problema al escribir cae aqui
        catch (Exception e) {
            System.out.println("Error al escribir");
        }
    }

    /**
     * Metodo para verificar si el usuario existe en nuestra base de datos
     * @param usuarioingreso a verificar
     * @param contrasena a verificar
     * @return usuario si lo encuentra null en otro caso
     */
    public static Usuario ingresarController(String usuarioingreso, String contrasena) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUsuario().equals(usuarioingreso)) {
                if (usuario.getContrasena().equals(contrasena)) {
                    return usuario;
                }
            }
        }
        return null;
    }

    /**
     * Método para ver que tipo de mensaje se le mandará al usuario
     * @param usuarioIngreso a verificar
     * @param contrasenaIngreso a verficar
     * @return la respuesta que dependerá si se encuentra en la base de datos o no
     */
    public String ingresoController(String usuarioIngreso, String contrasenaIngreso) {
        if (ingresarController(usuarioIngreso, contrasenaIngreso) != null) {
            return "Bienvenido";
        } else {
            return "No estás en la base de datos";
        }
    }

    /**
     * Método que hará el menu de opciones que permitirá registrarte o iniciar sesion
     * @throws IOException problema del lectura del archivo
     */
    public void inicioController() throws IOException {
        while (true) {
            try {
                while (true) {
                    encontrarUsuario();
                    switch (registrarseVista.inicioVista()) {
                        case 1:
                            if (registrarseVista.ingresoVista() == true) {
                                return;
                            } else {
                                break;
                            }

                        case 2:
                            registrarseVista.registrarseVista();
                            break;
                        default:
                            System.out.println("\n \tOpción no disponible por el momento");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("\n\tTypea una entrada valida!");

            }
        }
    }

    /**
     * Metodo que regresa la lista de usuarios
     * @return lista de usuarios
     */    
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * Metodo que regresa el usuario de ingreso
     * @return usuario de ingreso
     */
    public String getUsuarioIngreso() {
        return usuarioIngreso;
    }

    /**
     * Metodo que regresa la contrasena de ingreso
     * @return contrasena de ingreso
     */
    public String getContrasenaIngreso() {
        return contrasenaIngreso;
    }

}
