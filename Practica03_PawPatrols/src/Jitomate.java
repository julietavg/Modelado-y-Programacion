
/**
 * Clase que representa el ingrediente extra Jitomate 
 * 
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */ 
   public class Jitomate extends IngredientDecorator{
    
     double costo = 6.5;
   
    /**
     * Constructor del baggui con Jitomate
     * @param baggui 
     */
    public Jitomate(Baggui baggui){
        super(baggui);
    }

    @Override
    public String getDescription(){
        return baggui.getDescription() + "$" + costo + " Jitomate \n";
    }
    @Override
    public double getCost(){
        return baggui.getCost()+ costo;
    }

    
}