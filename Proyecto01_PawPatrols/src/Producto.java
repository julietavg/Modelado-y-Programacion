
public class Producto {

    /*Clase para representar los productos de la tienda*/

    /*Nombre*/
    String nombre;

    /*Codigo de barras*/
    int codigoDeBarras;

    /*Departamento*/
    String departamento;

    /*Precio*/
    double precio;

    /*Constructor*/
    public Producto(String nombre, int codigoDeBarras, String departamento, 
                    double precio) {

            this.nombre = nombre;
            this.codigoDeBarras = codigoDeBarras;
            this.departamento = departamento;
            this.precio = precio;
    }

    /*Getters y Setters*/
    public String getNombre() {
            return nombre;
    }

    public void setNombre(String nombre) {
            this.nombre = nombre;
    }

    public int getCodigoDeBarras() {
            return codigoDeBarras;
    }

    public String getDepartamento() {
            return departamento;
    }

    public double getPrecio() {
            return precio;
    }

    public void setPrecio(double precio) {
            this.precio = Math.round(precio);
    }

    /**
     * Metodo que devuelve los detalles de cada producto
     * @return cadena con los detalles
     */
    public String getDetalles() {
            String cadena = "";
            cadena += "Producto: "+this.getNombre()+"\n"+"Codigo de barras: "+this.getCodigoDeBarras()+"\n"+
            "Precio: $"+ this.getPrecio()+"\n\n";
            return cadena;

    }

}
