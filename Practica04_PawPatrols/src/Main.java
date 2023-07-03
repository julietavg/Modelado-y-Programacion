import java.util.Scanner;

/**
 * Clase main
 *
 * @version 1.0 Abril 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */
public class Main {

    static AbstractFactory fabricaCabina = Factory.getFactory("CabinaFactory");
    static AbstractFactory fabricaArmas = Factory.getFactory("ArmasFactory");
    static AbstractFactory fabricaBlindaje = Factory.getFactory("BlindajeFactory");
    static AbstractFactory fabricaPropulsion = Factory.getFactory("SistemaFactory");

    static Cabina cabina = null;
    static Blindaje blindaje = null;
    static SistemaDePropulsion sistema = null;
    static Armas armas = null;
    static Nave nave = null;

    public static void main(String[] args) {

        int opcion;
        Scanner scan = new Scanner(System.in);

        System.out.println(" Bienvenido a \"El Imperio Galáctico\"");
        while (true) {
            try {
                while (true) {
                    System.out.print("\n Selecciona una opción \n 1. Crear tu propia nave \n 2. Salir\n ");
                    opcion = Integer.parseInt(scan.nextLine());

                    switch (opcion) {
                        case 1 -> {
                            armarNave();
                            break;
                        }
                        case 2 -> {
                            System.out.println("Saliendo...");
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

    public static void armarNave() {
        Scanner scancito = new Scanner(System.in);
        Scanner scann = new Scanner(System.in);
        System.out.print(" Ingresa tu presupuesto \n");
        int presupuesto = scancito.nextInt();
        boolean seguir = true;
        System.out.println("Escoge los componentes de tu nave\n ");
        boolean seguir2 = true;
        while (seguir2) {
            try {
                System.out.println(" \t Sistema de propulsión \n" + "Ingresa el número de la que te gustaria\n"
                        + "1. Viaje intercontinental \n" + "2. Viaje interplanetario \n" + "3. Viaje intergaláctico \n");
                int opcion = Integer.parseInt(scann.nextLine());
                switch (opcion) {
                    case 1:
                        sistema = (SistemaDePropulsion) fabricaPropulsion.getPieza("Intercontinental");
                        seguir2 = false;
                        break;
                    case 2:
                        sistema = (SistemaDePropulsion) fabricaPropulsion.getPieza("Interplanetario");
                        seguir2 = false;
                        break;
                    case 3:
                        sistema = (SistemaDePropulsion) fabricaPropulsion.getPieza("Intergalactico");
                        seguir2 = false;
                        break;
                    default:
                        System.out.println("\tEscoge una opción valida\n ");
                }

            } catch (NumberFormatException e) {
                System.out.println(" \t Escoge una opción valida ");
            }
        }
        while (seguir) {
            try {
                System.out.println(" \t Cabinas \n" + "Ingresa el número de la que te gustaria\n"
                        + "1. Un piloto\n" + "2. Tripulación pequeña\n" + "3. Ejercito\n");
                int opcion = Integer.parseInt(scann.nextLine());
                switch (opcion) {
                    case 1:
                        cabina = (Cabina) fabricaCabina.getPieza("Piloto");
                        seguir = false;
                        break;
                    case 2:
                        cabina = (Cabina) fabricaCabina.getPieza("Tripulacion");
                        seguir = false;
                        break;
                    case 3:
                        cabina = (Cabina) fabricaCabina.getPieza("Ejercito");
                        seguir = false;
                        break;
                    default:
                        System.out.println("\tEscoge una opción valida\n ");
                }

            } catch (NumberFormatException e) {
                System.out.println(" \t Escoge una opción valida ");
            }
        }

        boolean seguir3 = true;
        while (seguir3) {
            try {
                System.out.println(" \t Armas \n" + "Ingresa el número de la que te gustaria\n"
                        + "1. Laser simple \n" + "2. Misiles Plasma \n" + "3. Laser destructor de planetas \n");
                int opcion = Integer.parseInt(scann.nextLine());
                switch (opcion) {
                    case 1:
                        armas = (Armas) fabricaArmas.getPieza("LaserSimple");
                        seguir3 = false;
                        break;
                    case 2:
                        armas = (Armas) fabricaArmas.getPieza("MisilesPlasma");
                        seguir3 = false;
                        break;
                    case 3:
                        armas = (Armas) fabricaArmas.getPieza("LaserDestructor");
                        seguir3 = false;
                        break;
                    default:
                        System.out.println("\tEscoge una opción valida\n ");
                }
            } catch (NumberFormatException e) {
                System.out.println(" \t Escoge una opción valida ");
            }
        }

        boolean seguir1 = true;
        while (seguir1) {
            try {
                System.out.println(" \t  Blindaje \n" + "Ingresa el número de la que te gustaria\n"
                        + "1. Simple \n" + "2. Reforzado \n" + "3. Fortaleza \n");
                int opcion = Integer.parseInt(scann.nextLine());
                switch (opcion) {
                    case 1:
                        blindaje = (Blindaje) fabricaBlindaje.getPieza("Simple");
                        seguir1 = false;
                        break;
                    case 2:
                        blindaje = (Blindaje) fabricaBlindaje.getPieza("Reforzado");
                        seguir1 = false;
                        break;
                    case 3:
                        blindaje = (Blindaje) fabricaBlindaje.getPieza("Fortaleza");
                        seguir1 = false;
                        break;
                    default:
                        System.out.println("\tEscoge una opción valida\n ");
                }

            } catch (NumberFormatException e) {
                System.out.println(" \t Escoge una opción valida ");
            }
        }

        Nave navecita = new Nave(sistema, blindaje, cabina, armas);
        navecita.muestraNave();
        Scanner sc = new Scanner(System.in);
        if (presupuesto < navecita.getPrecio()) {

            boolean salir = true;
            while (salir) {
                try {
                    System.out.println("No te alcanza): puedes checar nuestra seleccion fija\n"
                            + "1. Nave individual de combate \n"
                            + "2. Nave militar de transporte \n"
                            + "3. Base espacial de guerra \n");
                    int opcion = Integer.parseInt(sc.nextLine());
                    switch (opcion) {
                        case 1:
                            sistema = (SistemaDePropulsion) fabricaPropulsion.getPieza("Intercontinental");
                            cabina = (Cabina) fabricaCabina.getPieza("Piloto");
                            armas = (Armas) fabricaArmas.getPieza("LaserSimple");
                            blindaje = (Blindaje) fabricaBlindaje.getPieza("Simple");
                            salir = false;
                            break;
                        case 2:
                            sistema = (SistemaDePropulsion) fabricaPropulsion.getPieza("Interplanetario");
                            cabina = (Cabina) fabricaCabina.getPieza("Tripulacion");
                            armas = (Armas) fabricaArmas.getPieza("MisilesPlasma");
                            blindaje = (Blindaje) fabricaBlindaje.getPieza("Reforzado");
                            salir = false;
                            break;
                        case 3:
                            sistema = (SistemaDePropulsion) fabricaPropulsion.getPieza("Intergalactico");
                            cabina = (Cabina) fabricaCabina.getPieza("Ejercito");
                            armas = (Armas) fabricaArmas.getPieza("LaserDestructor");
                            blindaje = (Blindaje) fabricaBlindaje.getPieza("Fortaleza");
                            salir = false;
                            break;
                        default:
                            System.out.println("\tEscoge una opción valida\n ");
                    }

                } catch (NumberFormatException e) {
                    System.out.println(" \t Escoge una opción valida ");
                }
            }
            nave = new Nave(sistema, blindaje, cabina, armas);
            nave.muestraNave();
            if (presupuesto < nave.getPrecio()) {
                System.out.println("No te alcanza): puedes salir o ingresar distinto presupuesto ");

            } else {
                System.out.println("\n Tu nave se entregará pronto!");
            }

        } else {
            System.out.println("\n Tu nave se entregará pronto!");
        }
    }
}
