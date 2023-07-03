
/**
 * Clase que representa el ingrediente extra Lechuga 
 * 
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */ 
   public class Lechuga extends IngredientDecorator{
    
     double costo = 5;
   
    /**
     * Constructor del baggui con Lechuga
     * @param baggui 
     */
    public Lechuga(Baggui baggui){
        super(baggui);
    }

    @Override
    public String getDescription(){
        return baggui.getDescription() + "$" + costo + " Lechuga \n";
    }
    @Override
    public double getCost(){
        return baggui.getCost()+ costo;
    }

    
}