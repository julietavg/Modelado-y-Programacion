import java.util.ArrayList;
import java.util.Iterator;

/**
 * Clase para poder interactuar con el usuario y proporcionarle el Porsche
 * deseado
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 *
 */
public class PorscheMexico {

    /*Catalogo de prefabricados en Mexico*/
    private ArrayList<Porsche> catalogo = new ArrayList<>();

    /*Combustibles*/
    private CombustibleGasolina gasolina = new CombustibleGasolina();
    private CombustibleHibrido hibrido = new CombustibleHibrido();

    /*Pinturas*/
    private PinturaBlanca blanca = new PinturaBlanca();
    private PinturaNegra negra = new PinturaNegra();
    private PinturaRoja roja = new PinturaRoja();

    /*Transmisiones*/
    private TransmisionAutomatico automatica = new TransmisionAutomatico();
    private TransmisionManual manual = new TransmisionManual();

    /*Motores*/
    private MotorV6 v6 = new MotorV6();
    private MotorV8 v8 = new MotorV8();
    private MotorV10 v10 = new MotorV10();

    /*Audios*/
    private AudioBose bose = new AudioBose();
    private AudioPorsche porsche = new AudioPorsche();
    private AudioJBL jbl = new AudioJBL();

    /*Porsche 718*/
    private Modelo718 m718 = new Modelo718();

    /*Porsche 911*/
    private Modelo911 m911 = new Modelo911();

    /*Porsche Cayenne*/
    private ModeloCayenne mCayenne = new ModeloCayenne();

    /*Porsche Macan*/
    private ModeloMacan mMacan = new ModeloMacan();

    /*Porsche Exclusivo*/
    private ModeloMacan exclusivoMacan = new ModeloMacan();

    public PorscheMexico() {

        Porsche porsche718 = new Porsche("1.- Porsche 718", m718, gasolina, negra, manual, v6, bose);
        Porsche porsche911 = new Porsche("2.- Porsche 911", m911, hibrido, blanca, manual, v10, jbl);
        Porsche porscheCayenne = new Porsche("3.- Porsche Cayenne", mCayenne, hibrido, roja, automatica, v10, bose);
        Porsche porscheMacan = new Porsche("4.- Porsche Macan", mMacan, hibrido, negra, automatica, v8, porsche);
        Porsche porscheExclusivo = new Porsche("5.- Porsche Macan Edicion Especial", exclusivoMacan, hibrido, blanca, automatica, v10, bose);

        catalogo.add(porsche718);
        catalogo.add(porsche911);
        catalogo.add(porscheCayenne);
        catalogo.add(porscheMacan);
        catalogo.add(porscheExclusivo);
    }

    /**
     * Metodo que regresa un objeto de tipo Iterator.
     * @return Iterator.
     */
    public Iterator getIterador() {
        return this.catalogo.iterator();
    }

}
