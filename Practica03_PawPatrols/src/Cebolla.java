
/**
 * Clase que representa el ingrediente extra Cebolla 
 * 
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */ 
   public class Cebolla extends IngredientDecorator{
    
     double costo = 4.5;
   
    /**
     * Constructor del baggui con Cebolla
     * @param baggui 
     */
    public Cebolla(Baggui baggui){
        super(baggui);
    }

    @Override
    public String getDescription(){
        return baggui.getDescription() + "$" + costo + " Cebolla \n";
    }
    @Override
    public double getCost(){
        return baggui.getCost()+ costo;
    }

    
}