
import java.util.Scanner;

public class MostrarMenuUSA implements MostrarMenu {

    @Override
    public void mostrarMenu() {
        Main ingreso = new Main();
        int opcion;
        Scanner scan = new Scanner(System.in);
        CatalogoProductos catalogoReal = new CatalogoProductos();
        CatalogoProductosProxy catalogo = new CatalogoProductosProxy(catalogoReal);
        Descuento descuento = new Descuento();
        descuento.enlazarProducto(catalogo);
        Carrito carrito = new Carrito();
        boolean catalogoVisto = true;

        while (true) {
            try {
                while (true) {
                    System.out.println("\tPlease enter an option");
                    System.out.print("\n 1. Display catalog \n 2. Enter item \n 3. Complete purchase \n 4. Exit \n");
                    opcion = Integer.parseInt(scan.nextLine());

                    switch (opcion) {
                        case 1:
                            System.out.println("*************************Catalog*************************");
                            System.out.println(catalogo.mostrar());
                            System.out.println("\n\tCheck out the offers we have for you!\n ");
                            System.out.println("*************************Discounted*************************");
                            if (catalogoVisto == true) {
                                descuento.descuentaElectroDomesticos();
                            }
                            catalogoVisto = false;
                            for (int i = 0; i < catalogo.getElectroDomesticos().size(); i++) {
                                System.out.println(catalogo.getElectroDomesticos().get(i).getDetalles());
                            }
                            break;
                        case 2:
                             try {
                            while (true) {
                                System.out.println("\t Enter the item of your interest \n "
                                        + "Remember that you can only enter the barcode\n");
                                int codigoBarras = Integer.parseInt(scan.nextLine());
                                Producto p = catalogo.buscarProducto(codigoBarras);
                                if (catalogo.buscarProducto(codigoBarras) == null) {
                                    System.out.println(" The barcode you entered is incorrect \n");

                                } else {
                                    carrito.add(p);
                                    System.out.println("Added to your cart!");
                                }
                                break;

                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Enter a valid input");

                        }
                        break;
                        case 3:
                            if (carrito.size() == 0) {
                                System.out.println("Your shopping cart is empty");
                                break;
                            }
                            System.out.println(" \t \t Ticket \n");
                            carrito.mostrar();
                            System.out.println("The total price of your discounted purchase is ");
                            carrito.cobrar();
                            return;

                        case 4:
                            System.out.println("Leaving..");
                            ingreso.Salir(true);
                            return;
                        default:
                            System.out.println("\n\tOption not available.");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("\n\tEnter a valid input!");

            }

        }
    }

}
