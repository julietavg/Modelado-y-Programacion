import java.util.ArrayList;

public class RandomDescuento {

    /*Lista de los posibles descuentos a aplicar*/
    ArrayList<Double> descuentos = new ArrayList<>();


    public void llenaDescuentos() {

            descuentos.add(0.50);
            descuentos.add(0.70);
            descuentos.add(0.80);
    }

    /**
     * Metodo que genera un descuento de manera aleatoria.
     * @return descuento.
     */
    public double getRandomDescuento() {

            llenaDescuentos();
            int indice = 0;
            for(int i = 0; i<descuentos.size();i++) {
                    indice = (int)(Math.random() * descuentos.size());
            }
            return descuentos.get(indice);
    }
}
