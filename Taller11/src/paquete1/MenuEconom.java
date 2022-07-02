package paquete1;

/**
 *
 * @author andreflores
 *
 */
public class MenuEconom extends Menu {

    private double por;

    public MenuEconom(String n, double v, double p) {
        super(n, v);
        por = p;
    }

    public void establecerPor(double n) {
        por = n;
    }

    @Override
    public void establecerVMenu() {
        vMenu = vIMnu - (vIMnu * por / 100);
    }

    public double obtenerPor() {
        return por;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menú Económico\n"
                + "   Plato: %s\n"
                + "   Valor inicial: %.2f\n"
                + "   Porcentaje Adicional: %.2f\n"
                + "   Valor del Menú: %.2f\n",
                nombrePlato,
                vIMnu,
                por,
                vMenu);
        return cadena;
    }
}
