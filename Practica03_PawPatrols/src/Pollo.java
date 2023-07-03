
/**
 * Clase que representa el ingrediente extra pollo 
 * 
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */ 
   public class Pollo extends IngredientDecorator{
    
     double costo = 10;
   
    /**
     * Constructor del baggui con pollo
     * @param baggui 
     */
    public Pollo(Baggui baggui){
        super(baggui);
    }

    @Override
    public String getDescription(){
        return baggui.getDescription() + "$" + costo + " Pollo \n";
    }
    @Override
    public double getCost(){
        return baggui.getCost()+ costo;
    }

    
}