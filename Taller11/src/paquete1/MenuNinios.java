package paquete1;

/**
 *
 * @author andreflores
 */
public class MenuNinios extends Menu {

    private double vHela;
    private double vPast;

    public MenuNinios(String n, double v, double h, double p) {
        super(n, v);
        vHela = h;
        vPast = p;
    }
    
    public void establecervHela(double n) {
        vHela = n;
    }

    public void establecervPast(double n) {
        vPast = n;
    }

    @Override
    public void establecerVMenu() {
        vMenu = vIMnu + vHela + vPast;
    }

    public double obtenervHela() {
        return vHela;
    }

    public double obtenervPast() {
        return vPast;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menú de niños\n"
                + "   Plato: %s\n"
                + "   Valor inicial: %.2f\n"
                + "   Valor helado: %.2f\n"
                + "   Valor pastel: %.2f\n"
                + "   Valor del Menú: %.2f\n",
                nombrePlato,
                vIMnu,
                vHela,
                vPast,
                vMenu);
        return cadena;
    }

}
