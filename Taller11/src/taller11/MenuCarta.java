package taller11;

/**
 *
 * @author andreflores
 *
 * nombre del plato valor del menú
 *
 * valor inicial del menú valor de porción de guarnición valor de bebida
 * porcentaje adicional por servicio en relación del valor inicial del menú
 *
 */
public class MenuCarta extends Menu {

    private String nombrePlato;
    private double vMenu;
    private double vIMnu;
    private double vGuar;
    private double vBeb;
    private double por;

    public void establecerNomPlato(String n) {
        nombrePlato = n;
    }

    public void establecervIMenu(double n) {
        vIMnu = n;
    }

    public void establecerVGuar(double n) {
        vGuar = n;
    }

    public void establecervBeb(double n) {
        vBeb = n;
    }

    public void establecerPor(double n) {
        por = n;
    }
    @Override 
    public void establecerValorCancelar() {
        vMenu = (vIMnu + vGuar + vBeb) - (por / 100);
    }

    public String obtenerNomPlato() {
        return nombrePlato;
    }

    public double obtenervIMenu() {
        return vIMnu;
    }

    public double obtenerVGuar() {
        return vGuar;
    }

    public double obtenervBeb() {
        return vBeb;
    }

    public double obtenerPor() {
        return por;
    }

    public double obtenerVMenu() {
        return vMenu;
    }

    @Override
    public String toString() {
        String cadena = String.format("Plato: %s\n"
                + "Valor inicial: %.2f\n"
                + "Valor guarnición: %.2f\n"
                + "Valor bebida: %.2f\n"
                + "Porcentaje Adicional: %.2f\n"
                + "Valor del Menú: %.2f\n",
                nombrePlato,
                vIMnu,
                vGuar,
                vBeb,
                por,
                vMenu);
        return cadena;
    }
}

