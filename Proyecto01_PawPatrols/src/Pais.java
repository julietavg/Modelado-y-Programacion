
public class Pais {

    /*Atributos que se distinguen en el idioma del pais*/
    Saludar saludar;
    MostrarMenu mostrarMenu;
    TerminarCompra terminarCompra;

    public Pais() {
    }

    /**
     * Metodo que muestra el saludo
     */
    public void mostrarSaludo() {
        saludar.saludar();
    }

    /**
     * Metodo que muestra el menu
     */
    public void mostrarMenu() {
        mostrarMenu.mostrarMenu();
    }

    /**
     * Metodo que termina la compra
     */
    public void terminarCompra() {
        terminarCompra.terminarCompra();
    }

    /**
     * set saludo
     *
     * @param sl
     */
    public void setSaludo(Saludar sl) {
        saludar = sl;
    }

    /**
     * set menu
     *
     * @param MostrarM
     */
    public void setMenu(MostrarMenu mostrarM) {
        mostrarMenu = mostrarM;
    }

    /**
     * set TerminarCompra
     *
     * @param mostrarOf
     */
    public void setTerminarCompra(TerminarCompra terminarC) {
        terminarCompra = terminarC;
    }

}
