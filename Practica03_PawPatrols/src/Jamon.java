
/**
 * Clase que representa el ingrediente extra Jamon 
 * 
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */ 
   public class Jamon extends IngredientDecorator{
    
     double costo = 7.5;
   
    /**
     * Constructor del baggui con Jamon
     * @param baggui 
     */
    public Jamon(Baggui baggui){
        super(baggui);
    }

    @Override
    public String getDescription(){
        return baggui.getDescription() + "$" + costo + " Jamon \n";
    }
    @Override
    public double getCost(){
        return baggui.getCost()+ costo;
    }

    
}