
/**
 * Clase que representa el ingrediente extra Mayonesa 
 * 
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */ 
   public class Mayonesa extends IngredientDecorator{
    
     double costo = 2;
   
    /**
     * Constructor del baggui con Mayonesa
     * @param baggui 
     */
    public Mayonesa(Baggui baggui){
        super(baggui);
    }

    @Override
    public String getDescription(){
        return baggui.getDescription() + "$" + costo + " Mayonesa \n";
    }
    @Override
    public double getCost(){
        return baggui.getCost()+ costo;
    }

    
}