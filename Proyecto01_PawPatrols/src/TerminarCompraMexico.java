
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TerminarCompraMexico extends Main implements TerminarCompra {

    @Override
    public void terminarCompra(){
        
        Date today = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(today);
        c.add(Calendar.DATE, 15);
        today = c.getTime();
        Scanner scan = new Scanner(System.in);
        System.out.println(" \n Iniciando compra segura ");
        Usuario actual = ingresar(usuarioIngreso, contrasenaIngreso);
        System.out.println("Ingresa tu id");
        String cuentaBancaria = scan.nextLine();
        System.out.println("Ingresa tu usuario de nuevo");
        String userA = scan.nextLine();
        UsuarioProxy proxyy = new UsuarioProxy(actual);
        if (proxyy.compraSegura(cuentaBancaria, usuarios, userA) == true) {
            System.out.println(" \nTu compra se ha realizado con exito! \n"
                    + "Tu pedido se entregara el día " + new SimpleDateFormat("dd-MM-yyyy").format(today));
            
        } else {
            System.out.println("Tu compra se ha cancelado amigo): ");
           
        }

    }

}
