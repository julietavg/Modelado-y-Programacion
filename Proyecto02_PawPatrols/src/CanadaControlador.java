
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que representará a Canada con los métodos del controlador
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */
public class CanadaControlador implements Sucursal {

    /* Para accedar a las vistas y controladores*/
    static CanadaVista vista = new CanadaVista();
    static CanadaControlador canada = new CanadaControlador();
    static RegistrarseVista registroVista = new RegistrarseVista();
    static RegistrarseControlador registro = new RegistrarseControlador();

    /*Porsches de Canada*/
    PorscheCanada autosCanada = new PorscheCanada();

    /*Iterador*/
    Iterator iterador;

    @Override
    public void mostrarMenu() {
        Pais pais = new Pais();
        boolean armarCarro = false, autosPrefabricados = false;
        while (true) {
            try {
                while (true) {
                    switch (vista.mostrarMenuVista()) {
                        case 1:
                            armarAuto();
                            pais.setArmarCarro(armarCarro == false);
                            return;
                        case 2:
                            autosPrefabricados();
                            pais.setAutosPrefabricados(autosPrefabricados == false);
                            return;
                        default:
                            System.out.println("\tChoose a valid option\n ");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("\tChoose a valid option\n ");

            }

        }
    }

    @Override
    public void armarAuto() {
        vista.armarAuto();
    }

    /**
     * Auxiliar que nos permitira escoger entre los componentes del coche que el
     * usuario escogera
     *
     * @return coche terminado
     */
    public String armarAutoAux() {
        String aux = "";
        AbstractFactory fabricaModelo = Factory.getFactory("ModeloFactory");
        AbstractFactory fabricaCombustible = Factory.getFactory("CombustibleFactory");
        AbstractFactory fabricaPintura = Factory.getFactory("PinturaFactory");
        AbstractFactory fabricaTransmision = Factory.getFactory("TransmisionFactory");
        AbstractFactory fabricaMotor = Factory.getFactory("MotorFactory");
        AbstractFactory fabricaAudio = Factory.getFactory("AudioFactory");

        Modelo modelo = null;
        Combustible combustible = null;
        Pintura pintura = null;
        Transmision transmision = null;
        Motor motor = null;
        Audio audio = null;
        Porsche porsche = null;
        boolean seguir = true;
        boolean seguir2 = true;
        while (seguir2) {
            try {
                switch (vista.armarAutoModelo()) {
                    case 1:
                        modelo = (Modelo) fabricaModelo.getComponente("718");
                        seguir2 = false;
                        break;
                    case 2:
                        modelo = (Modelo) fabricaModelo.getComponente("911");
                        seguir2 = false;
                        break;
                    case 3:
                        modelo = (Modelo) fabricaModelo.getComponente("Macan");
                        seguir2 = false;
                        break;
                    case 4:
                        modelo = (Modelo) fabricaModelo.getComponente("Cayenne");
                        seguir2 = false;
                        break;
                    default:
                        System.out.println("\tChoose a valid option\n ");
                }

            } catch (NumberFormatException e) {
                System.out.println("\tChoose a valid option\n ");
            }
        }
        while (seguir) {
            try {
                switch (vista.armarAutoCombustible()) {
                    case 1:
                        combustible = (Combustible) fabricaCombustible.getComponente("Gasolina");
                        seguir = false;
                        break;
                    case 2:
                        combustible = (Combustible) fabricaCombustible.getComponente("Hibrido");
                        seguir = false;
                        break;
                    default:
                        System.out.println("\tChoose a valid option\n ");
                }

            } catch (NumberFormatException e) {
                System.out.println("\tChoose a valid option\n ");
            }
        }

        boolean seguir3 = true;
        while (seguir3) {
            try {
                switch (vista.armarAutoPintura()) {
                    case 1:
                        pintura = (Pintura) fabricaPintura.getComponente("Roja");
                        seguir3 = false;
                        break;
                    case 2:
                        pintura = (Pintura) fabricaPintura.getComponente("Blanca");
                        seguir3 = false;
                        break;
                    case 3:
                        pintura = (Pintura) fabricaPintura.getComponente("Negra");
                        seguir3 = false;
                        break;
                    default:
                        System.out.println("\tChoose a valid option\n ");
                }
            } catch (NumberFormatException e) {
                System.out.println("\tChoose a valid option\n ");
            }
        }
        boolean seguir1 = true;
        while (seguir1) {
            try {
                switch (vista.armarAutoTransmision()) {
                    case 1:
                        transmision = (Transmision) fabricaTransmision.getComponente("Manual");
                        seguir1 = false;
                        break;
                    case 2:
                        transmision = (Transmision) fabricaTransmision.getComponente("Automatico");
                        seguir1 = false;
                        break;
                    default:
                        System.out.println("\tChoose a valid option\n ");
                }

            } catch (NumberFormatException e) {
                System.out.println("\tChoose a valid option\n ");
            }
        }
        boolean seguir4 = true;
        while (seguir4) {
            try {
                switch (vista.armarAutoMotor()) {
                    case 1:
                        motor = (Motor) fabricaMotor.getComponente("V6");
                        seguir4 = false;
                        break;
                    case 2:
                        motor = (Motor) fabricaMotor.getComponente("V8");
                        seguir4 = false;
                        break;
                    case 3:
                        motor = (Motor) fabricaMotor.getComponente("V10");
                        seguir4 = false;
                        break;
                    default:
                        System.out.println("\tChoose a valid option\n ");
                }
            } catch (NumberFormatException e) {
                System.out.println("\tChoose a valid option\n ");
            }
        }
        boolean seguir5 = true;
        while (seguir5) {
            try {
                switch (vista.armarAutoAudio()) {
                    case 1:
                        audio = (Audio) fabricaAudio.getComponente("AudioBose");
                        seguir5 = false;
                        break;
                    case 2:
                        audio = (Audio) fabricaAudio.getComponente("AudioJBL");
                        seguir5 = false;
                        break;
                    case 3:
                        audio = (Audio) fabricaAudio.getComponente("AudioPorsche");
                        seguir5 = false;
                        break;
                    default:
                        System.out.println("\tChoose a valid option\n ");
                }
            } catch (NumberFormatException e) {
                System.out.println("\tChoose a valid option\n ");
            }
        }
        porsche = new Porsche("Your model looks as follows", modelo, combustible, pintura, transmision, motor, audio);
        aux += porsche.muestraPorsche();
        return aux;

    }

    @Override
    public void autosPrefabricados() {
        vista.autosPrefabricadosVista();
        Porsche auto = canada.eligeAuto();
        auto.muestraPorsche();
    }

    /**
     * Auxiliar para ver los autos prefabricados
     * @return
     */
    public String autosPrefabricadosAux() {
        return canada.muestraAutos();
    }

    /*
     * Metodo para imprimir los autos y sus caracteristicas.
     **/
    public String muestraAutos() {
        String aux = "";
        iterador = autosCanada.getIterador();
        aux += "******* Prefabricated Cars *******";
        while (iterador.hasNext()) {
            aux += ((Porsche) iterador.next()).muestraPorsche();
        }
        return aux;
    }

    /*
     * Metodo que regresa el Porsche de acuerdo a la cadena 
     * que recibe como parametro
     * @param String porsche  a buscar
     * @return Porsche
     * */
    private Porsche auxiliar(String porsche) {
        Porsche auxiliar;
        iterador = autosCanada.getIterador();
        while (iterador.hasNext()) {
            auxiliar = (Porsche) iterador.next();
            if (auxiliar.nombre.equals(porsche)) {
            	System.out.println("Congratulations for your new car! \n"+auxiliar.muestraPorsche());
                return auxiliar;
            }
        }
        return null;
    }

    /*
     * Metodo para preguntarle al usuario que Porsche desea comprar
     * @return Porsche elegido.
     * */
    public Porsche eligeAuto() {
        while (true) {
            try {
                while (true) {
                    switch (vista.eligeAutoVista()) {
                        case 1:

                            return this.auxiliar("1.- Porsche 718");
                        case 2:

                            return this.auxiliar("2.- Porsche 911");
                        case 3:

                            return this.auxiliar("3.- Porsche Cayenne");

                        case 4:
                            return this.auxiliar("4.- Porsche Macan");

                        case 5:

                            return this.auxiliar("5.- Porsche 718 Edicion Especial");
                        default:
                            System.out.println("\tChoose a valid option\n");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println(" \tChoose a valid option\n");
            }
        }
    }

    @Override
    public void terminarCompra() {
        vista.terminarCompraVista();
        try {
            registro.inicioController();
        } catch (IOException ex) {
            Logger.getLogger(CanadaControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        vista.proxyVista();
    }

    /**
     * Metodo para ver si la compra fue existosa
     *
     * @param CVC del usuario para verificar con la base de datos
     * @param userA usuario que ingreso
     * @return true si fue exitosa false en otro caso
     */
    public boolean proxy(String CVC, String userA) {
        Usuario actual = registro.ingresarController(registro.getUsuarioIngreso(), registro.getContrasenaIngreso());
        UsuarioProxy proxyy = new UsuarioProxy(actual);
        if (proxyy.compraSegura(CVC, registro.getUsuarios(), userA) == true) {
            return true;
        } else {
            return false;
        }

    }

}
