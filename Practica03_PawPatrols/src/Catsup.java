
/**
 * Clase que representa el ingrediente extra Catsup 
 * 
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */ 
   public class Catsup extends IngredientDecorator{
    
     double costo = 3.5;
   
    /**
     * Constructor del baggui con Catsup
     * @param baggui 
     */
    public Catsup(Baggui baggui){
        super(baggui);
    }

    @Override
    public String getDescription(){
        return baggui.getDescription() + "$" + costo + " Catsup \n";
    }
    @Override
    public double getCost(){
        return baggui.getCost()+ costo;
    }

    
}