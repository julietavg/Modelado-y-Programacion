

/**
 * Clase que representa una fabrica de audios
 *
 * @version 1.0 Mayo 2022
 * @author Castellanos Palacios Gerardo 318245630
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 */
public class AudioFactory extends AbstractFactory {

    @Override
    public Object getComponente(String componente) {
        return getAudio(componente);
    }

    /**
     * Metodo que regresa un tipo de audio
     *
     * @param tipoAudio a elegir
     * @return el tipo de audio deseado
     */
    private Object getAudio(String tipoAudio) {
        switch (tipoAudio) {
            case "AudioBose":
                return new AudioBose();
            case "AudioJBL":
                return new AudioJBL();
            case "AudioPorsche":
                return new AudioPorsche();
            default:
                System.out.println(" Escoge una):");
                return null;
        }

    }

}
