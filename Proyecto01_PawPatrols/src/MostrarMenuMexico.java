
import java.util.Scanner;

public class MostrarMenuMexico implements MostrarMenu {

    public void mostrarMenu() {
        Carrito carrito = new Carrito();
        Main ingreso = new Main();
        int opcion;
        Scanner scan = new Scanner(System.in);
        CatalogoProductos catalogoReal = new CatalogoProductos();
        CatalogoProductosProxy catalogo = new CatalogoProductosProxy(catalogoReal);
        Descuento descuento = new Descuento();
        descuento.enlazarProducto(catalogo);

        boolean catalogoVisto = true;

        while (true) {
            try {
                while (true) {
                    System.out.println("\tPor favor ingresa una opcion");
                    System.out.print("\n 1. Ver catalogo \n 2. Ingresar articulo \n 3. Terminar compra \n 4. Salir \n");
                    opcion = Integer.parseInt(scan.nextLine());

                    switch (opcion) {
                        case 1:
                            System.out.println("*************************Catalogo*************************");
                            System.out.println(catalogo.mostrar());
                            System.out.println("\n\tMira los ofertas que tenemos para ti!\n ");
                            System.out.println("*************************Descontado*************************");
                            ;
                            if (catalogoVisto == true) {
                                descuento.descuentaAlimentos();
                            }
                            catalogoVisto = false;
                            for (int i = 0; i < catalogo.getAlimentos().size(); i++) {
                                System.out.println(catalogo.getAlimentos().get(i).getDetalles());
                            }
                            break;
                        case 2:
                             try {
                            while (true) {
                                System.out.println("\t Ingresa el articulo de tu interes \n "
                                        + "Recuerda poder únicamente el codigo de barras\n");
                                int codigoBarras = Integer.parseInt(scan.nextLine());
                                Producto p = catalogo.buscarProducto(codigoBarras);
                                if (catalogo.buscarProducto(codigoBarras) == null) {
                                    System.out.println(" El codigo de barras que ingresaste es incorrecto \n");

                                } else {
                                    carrito.add(p);
                                    System.out.println("Se ha agregado a tu carrito!");
                                }
                                break;

                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Ingresa una entrada valida");

                        }
                        break;
                        case 3:
                            if (carrito.size() == 0) {
                                System.out.println("Tu carrito está vacio");
                                break;
                            }
                            System.out.println(" \t \t Ticket \n");
                            carrito.mostrar();
                            System.out.println("El precio total de tu compra con descuento es ");
                            carrito.cobrar();
                            return;

                        case 4:
                            System.out.println("Saliendo..");
                            ingreso.Salir(true);
                            return;
                        default:
                            System.out.println("\n\tOpción no disponible.");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("\n\tIngresa una entrada valida!");

            }

        }
    }

}
