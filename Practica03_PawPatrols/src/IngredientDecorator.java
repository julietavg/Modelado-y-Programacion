

/**
 * Clase que representa los ingredientes extras que pueden ser incluidos
 *         en la bagguet 
 * 
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutiérrez Julieta 318341945
 * @since Modelado y Programación 2022-2
 *
 */
public abstract class IngredientDecorator extends Baggui{
  
    /** Base de la baggui */
    Baggui baggui;
    
   
    /**
     * Constructor del ingrediente
     * @param baggui
     */    
    public IngredientDecorator(Baggui baggui){
        this.baggui = baggui;
    }
    
    /**
     * Descripcion del ingrediente
     * @return 
     */
    @Override
    public String getDescription(){
        return baggui.getDescription();
    }
    
    /**
     * Descripcion del costo
     * @return 
     */
    public double getCosto(){
        return baggui.getCost();
    }
    
    
}
