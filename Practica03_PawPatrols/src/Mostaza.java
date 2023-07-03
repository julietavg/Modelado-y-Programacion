
/**
 * Clase que representa el ingrediente extra Mostaza 
 * 
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */ 
   public class Mostaza extends IngredientDecorator{
    
     double costo = 3;
   
    /**
     * Constructor del baggui con Mostaza
     * @param baggui 
     */
    public Mostaza(Baggui baggui){
        super(baggui);
    }

    @Override
    public String getDescription(){
        return baggui.getDescription() + "$" + costo + " Mostaza \n";
    }
    @Override
    public double getCost(){
        return baggui.getCost()+ costo;
    }

    
}