package paquete1;

/**
 *
 * @author andreflores
 *
 * nombre del plato valor del menú valor inicial del menú valor de postre valor
 * de bebida
 *
 */
public class MenuDia extends Menu {

    private double vPost;
    private double vBeb;
    
    public MenuDia(String n, double v, double post, double beb) {
        super(n, v);
        vPost = post;
        vBeb = beb;
    }
    public void establecervPost(double n) {
        vPost = n;
    }

    public void establecervBeb(double n) {
        vBeb = n;
    }

    @Override
    public void establecerVMenu() {
        vMenu = vIMnu + vPost + vBeb;
    }

    public double obtenervPost() {
        return vPost;
    }

    public double obtenervBeb() {
        return vBeb;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menú del Día\n"
                + "   Plato: %s\n"
                + "   Valor Inicial: %.2f\n"
                + "   Valor Postre: %.2f\n"
                + "   Valor Bebida: %.2f\n"
                + "   Valor del Menú: %.2f\n",
                obtenerNomPlato(),
                obtenervIMenu(),
                obtenervPost(),
                obtenervBeb(),
                obtenerVMenu());

        return cadena;
    }
}
