import java.util.Scanner;

/**
 * Clase main donde se ejecuta el codigo
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */

public class Main {

    public static void main(String[] args) {
        int opcion;
        Baggui Baggui = null;
        Scanner scann = new Scanner(System.in);

        System.out.println("\t Bienvenido");
        try {
            Thread.sleep(700);
        } catch (Exception e) {
            System.out.println(e);
        }
        while (true) {
            try {
                while (true) {
                    System.out.println("\n Selecciona una opción \n 1. Bagguets\n 2. Pizzas \n 3. Salir\n ");
                    opcion = Integer.parseInt(scann.nextLine());

                    switch (opcion) {
                        case 1 -> {
                            Baggui = menuWaySub();
                            System.out.println("\t Ticket:\n\n" + Baggui.getDescription());
                            System.out.println("Costo total: $" + Baggui.getCost());
                            try {
                                Thread.sleep(700);
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                            break;
                        }
                        case 2 -> {
                            Baggui = menuPizza();
                            System.out.println("\t Ticket:\n\n" + Baggui.getDescription());
                            System.out.println("Costo total: $" + Baggui.getCost());
                            try {
                                Thread.sleep(700);
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                            break;
                        }
                        case 3 -> {
                            System.out.println("Hasta luego!");
                            return;
                        }

                        default ->
                            System.out.println("\n\tOpción no disponible.");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("\n\tTypea una entrada valida!");

            }

        }
    }

    private static Baggui menuPizza() {
        int respuesta;
        Scanner scann = new Scanner(System.in);
        Baggui platillo = null;
        Pizza pizza;

        System.out.println("\t Bienvenido a \"Las pizzas de don cangrejo\"");
        try {
            Thread.sleep(700);
        } catch (Exception e) {
            System.out.println(e);
        }

        while (true) {
            try {
                System.out.println("Escoge una pizza.\n" + "1.- Pizza de Salchicha $130\n" + "2.- Pizza de Carnes $200\n"
                        + "3.- Pizza de Quesos $180\n" + "4.- Pizza Maxi $250\n" + "5.- Pizza de Pollo $150");
                respuesta = Integer.parseInt(scann.nextLine());

                switch (respuesta) {
                    case 1 -> {
                        pizza = new PizzaSalchicha();
                        platillo = new PizzaAdapter(pizza);
                        return platillo;

                    }
                    case 2 -> {
                        pizza = new PizzaCarnes();
                        platillo = new PizzaAdapter(pizza);
                        return platillo;

                    }
                    case 3 -> {
                        pizza = new PizzaQuesos();
                        platillo = new PizzaAdapter(pizza);
                        return platillo;

                    }
                    case 4 -> {
                        pizza = new PizzaMaxi();
                        platillo = new PizzaAdapter(pizza);
                        return platillo;

                    }
                    case 5 -> {
                        pizza = new PizzaPollo();
                        platillo = new PizzaAdapter(pizza);
                        return platillo;

                    }
                  
                    default ->
                        System.out.println("\n\tOpción no disponible.");

                }
            } catch (NumberFormatException e) {
                System.out.println("\n\tTypea una entrada valida!");

            }
        }

    }

    private static Baggui menuWaySub() {
        Scanner scan = new Scanner(System.in);
        Scanner scancito = new Scanner(System.in);
        boolean error;
        boolean ingredient;

        System.out.println("\t Bienvenido a \" WaySub\"");

        try {

            Thread.sleep(700);
        } catch (Exception e) {
            System.out.println(e);
        }

        Baggui Baggui = null;
        do {
            error = true;
            try {
                System.out.println("Seleccione el pan de su preferencia");
                System.out.println("1. Ajo\n" + "2. Parmesano\n" + "3. Integral\n" + "4. Italiano\n");
                int pan = Integer.parseInt(scan.nextLine());
                switch (pan) {
                    case 1:
                        Baggui = new BagguiAjo();
                        break;
                    case 2:
                        Baggui = new BagguiParmesana();
                        break;
                    case 3:
                        Baggui = new BagguiIntegral();
                        break;
                    case 4:
                        Baggui = new BagguiItaliano();

                        break;
                    default:

                        System.out.println("\n\tOpción no disponible.");
                        error = false;
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("\n\tTypea una entrada valida!");
                error = false;
            }
            //}
        } while (!error);

        do {
            ingredient = false;

            try {

                System.out.println(" Ingresa los ingredientes que le gustaría en su baggui");
                System.out.println("1. Pollo \n" + "2. Pepperoni\n" + "3. Jamon\n" + "4. Lechuga\n"
                        + "5. Jitomate\n" + "6. Cebolla\n" + "7. Mostaza\n" + "8. Catsup\n"
                        + "9. Mayonesa\n" + "10. Son todos los ingredientes \n" + "Selecciona una opcion\n");
                int opcion = Integer.parseInt(scan.nextLine());
                switch (opcion) {
                    case 1:
                        Baggui = new Pollo(Baggui);
                        break;
                    case 2:
                        Baggui = new Pepperoni(Baggui);
                        break;
                    case 3:
                        Baggui = new Jamon(Baggui);
                        break;
                    case 4:
                        Baggui = new Lechuga(Baggui);
                        break;
                    case 5:
                        Baggui = new Jitomate(Baggui);
                        break;
                    case 6:
                        Baggui = new Cebolla(Baggui);
                        break;
                    case 7:
                        Baggui = new Mostaza(Baggui);
                        break;
                    case 8:
                        Baggui = new Catsup(Baggui);
                        break;
                    case 9:
                        Baggui = new Mayonesa(Baggui);
                        break;
                    case 10:
                        ingredient = true;
                        break;

                    default:
                        System.out.println("\n\tOpción no disponible.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("\n\tTypea una entrada valida!");
            }

        } while (!ingredient);
        return Baggui;

    }
}
