
/**
 * Clase abstracta Hamburguesa que realiza las acciones de preparación
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */
public abstract class Hamburguesa {

    /*Id para identificar a la hamburguesa*/
    public int id;

    /*Nombre de la hamburguesa*/
    private String nombre;

    /*Atributo para describir a la hamburguesa*/
    private String descripcion;

    /*Precio de la hamburguesa*/
    private int precio;

    /*Atributo que inidca si la hamburguesa tiene queso o no*/
    protected boolean tieneQueso;

    /*Atributo que inidca si la hamburguesa es vegetariana o no*/
    private boolean esVegetariana;

    /*Constructor*/
    public Hamburguesa(int id, String nombre, String descripcion, int precio, boolean tieneQueso,
            boolean esVegetariana) {

        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tieneQueso = tieneQueso;
        this.esVegetariana = esVegetariana;
    }

    /**
     * Método template que llama a los demas metodos que cocinan a la
     * hamburguesa
     *
     */
    public void template() {
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println(e);
        }
        ponerPan1();
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println(e);
        }
        ponerMayonesa();
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println(e);
        }
        preparandoCarne();
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println(e);
        }
        ponerCarne();
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println(e);
        }
        ponerQueso();
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println(e);
        }
        ponerVegetales();
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println(e);
        }

        ponerCatsup();
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println(e);
        }
        ponerPan2();
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Método para poner el pan
     *
     */
    public void ponerPan1() {

        System.out.println("Preparando el pan y colocandolo...");
    }

    /**
     * Método para poner la mayonesa
     *
     */
    public void ponerMayonesa() {

        System.out.println("Poniendo mayonesa...");
    }

    /**
     * Método para preparar la carne de la hamburguesa
     *
     */
    public abstract void preparandoCarne();

    /**
     * Método para poner la carne
     *
     */
    public void ponerCarne() {

        System.out.println("Poniendo carne...");
    }

    /**
     * Método para poner el queso
     *
     */
    public abstract void ponerQueso();

    /**
     * Método para poner los vegetales
     *
     */
    public void ponerVegetales() {

        System.out.println("Poniendo vegetales...");
    }

    /**
     * Método para poner la catsup
     *
     */
    public void ponerCatsup() {

        System.out.println("Poniendo catsup...");
    }

    /**
     * Método para poner la tapa de pan
     *
     */
    public void ponerPan2() {

        System.out.println("Poniendo la tapa de pan...\n");
    }

    /**
     * Método para representar la descripcion de la hamburguesa
     *
     * @return la descripcion de la hamburguesa
     */
    @Override
    public String toString() {

        String auxiliar = "";
        if (esVegetariana) {
            auxiliar = "Hamburguesa vegetariana.";
        } else {
            auxiliar = "Hamburguesa NO vegetariana.";
        }

        String burguer = "ID: " + id + ".\n" + auxiliar + "\n" + "Nombre: " + nombre + ".\n" + "Descripcion: " + descripcion + ".\n" + "Precio:" + precio;
        return burguer;
    }
}
