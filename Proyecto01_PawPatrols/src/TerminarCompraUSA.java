
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TerminarCompraUSA extends Main implements TerminarCompra {

    @Override
    public void terminarCompra() {
        Date today = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(today);
        c.add(Calendar.DATE, 15);
        today = c.getTime();
        Scanner scan = new Scanner(System.in);
        System.out.println(" \n Initiating secure purchasing ");
        Usuario actual = ingresar(usuarioIngreso, contrasenaIngreso);
        System.out.println("Enter your id");
        String cuentaBancaria = scan.nextLine();
        System.out.println("Enter your username again");
        String userA = scan.nextLine();
        UsuarioProxy proxyy = new UsuarioProxy(actual);
        if (proxyy.compraSegura(cuentaBancaria, usuarios, userA) == true) {
            System.out.println(" \nYour purchase has been successfully completed! \n"
                    + "Your order will be delivered on " + new SimpleDateFormat("dd-MM-yyyy").format(today));

        } else {
            System.out.println("Your purchase has been cancelled dude ): ");
        }

    }

}
