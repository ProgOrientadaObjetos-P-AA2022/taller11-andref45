package paquete1;

/**
 *
 * @author andreflores
 */
public abstract class Menu {

    protected String nombrePlato;
    protected double vIMnu;
    protected double vMenu;
    

    public Menu(String n, double v) {
        nombrePlato = n;
        vIMnu = v;
    }

    public void establecerNomPlato(String n) {
        nombrePlato = n;
    }

    public void establecervIMenu(double n) {
        vIMnu = n;
    }

    public abstract void establecerVMenu();
    
    public String obtenerNomPlato() {
        return nombrePlato;
    }

    public double obtenervIMenu() {
        return vIMnu;
    }

    public double obtenerVMenu() {
        return vMenu;
    }
}
