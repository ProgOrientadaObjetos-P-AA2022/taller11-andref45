package taller11;

/**
 *
 * @author andreflores
 *
 * nombre del plato valor del menú valor inicial del menú valor de postre valor
 * de bebida
 *
 */
public class MenuDia extends Menu {

    private String nombrePlato;
    private double vMenu;
    private double vIMnu;
    private double vPost;
    private double vBeb;

    public void establecerNomPlato(String n) {
        nombrePlato = n;
    }

    public void establecervIMenu(double n) {
        vIMnu = n;
    }

    public void establecervPost(double n) {
        vPost = n;
    }

    public void establecervBeb(double n) {
        vBeb = n;
    }
    
    @Override
    public void establecerValorCancelar() {
        vMenu = vIMnu + vPost + vBeb;
    }

    public String obtenerNomPlato() {
        return nombrePlato;
    }

    public double obtenervIMenu() {
        return vIMnu;
    }

    public double obtenervPost() {
        return vPost;
    }

    public double obtenervBeb() {
        return vBeb;
    }

    public double obtenerVMenu() {
        return vMenu;
    }
}
