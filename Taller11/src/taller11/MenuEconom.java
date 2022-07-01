package taller11;

/**
 *
 * @author andreflores
 *
 * nombre del plato valor del menú valor inicial del menú porcentaje de
 * descuento, en referencia al valor inicial del menú
 *
 */
public class MenuEconom {

    private String nombrePlato;
    private double vMenu;
    private double vIMnu;
    private double por;

    public void establecerNomPlato(String n) {
        nombrePlato = n;
    }

    public void establecervIMenu(double n) {
        vIMnu = n;
    }

    public void establecerPor(double n) {
        por = n;
    }

    public void calcularVMenu() {
        vMenu = vIMnu - (por / 100);
    }

    public String obtenerNomPlato() {
        return nombrePlato;
    }

    public double obtenerVMenu() {
        return vMenu;
    }

    public double obtenervIMenu() {
        return vIMnu;
    }

    public double obtenerPor() {
        return por;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Plato: %s\n"
                + "Valor inicial: %.2f\n"
                + "Porcentaje Adicional: %.2f\n"
                + "Valor del Menú: %.2f\n",
                nombrePlato,
                vIMnu,
                por,
                vMenu);
        return cadena;
    }
}
