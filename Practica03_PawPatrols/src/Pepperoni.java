
/**
 * Clase que representa el ingrediente extra Pepperoni 
 * 
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */ 
   public class Pepperoni extends IngredientDecorator{
    
     double costo = 8.5;
   
    /**
     * Constructor del baggui con Pepperoni
     * @param baggui 
     */
    public Pepperoni(Baggui baggui){
        super(baggui);
    }

    @Override
    public String getDescription(){
        return baggui.getDescription() + "$" + costo + " Pepperoni \n";
    }
    @Override
    public double getCost(){
        return baggui.getCost()+ costo;
    }

    
}