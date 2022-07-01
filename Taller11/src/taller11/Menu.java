
package taller11;

/**
 *
 * @author andreflores
 */
public abstract class Menu {
    protected double v_Can;
    
    
    public abstract void establecerValorCancelar();
    
    public double obtenerValorCancelar(){
        return v_Can;
    }
}
