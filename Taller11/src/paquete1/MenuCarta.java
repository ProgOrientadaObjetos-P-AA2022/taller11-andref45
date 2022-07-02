package paquete1;

/**
 *
 * @author andreflores
 *
 */
public class MenuCarta extends Menu {

    private double vGuar;
    private double vBeb;
    private double por;
    private double po;

    public MenuCarta(String n, double v,
            double vG, double vB, double p) {
        super(n, v);
        vGuar = vG;
        vBeb = vB;
        po = p;
    }

    public void establecerVGuar(double n) {
        vGuar = n;
    }

    public void establecervBeb(double n) {
        vBeb = n;
    }

    public void establecerPor() {
        por = po * vIMnu / 100;

    }

    @Override
    public void establecerVMenu() {
        vMenu = vIMnu + vGuar + vBeb + (vIMnu*po/100) ;
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

    @Override
    public String toString() {
        String cadena = String.format("Menú a la Carta\n"
                + "   Plato: %s\n"
                + "   Valor inicial: %.2f\n"
                + "   Valor guarnición: %.2f\n"
                + "   Valor bebida: %.2f\n"
                + "   Porcentaje Adicional: %.2f\n"
                + "   Valor del Menú: %.2f\n",
                nombrePlato,
                vIMnu,
                vGuar,
                vBeb,
                po,
                vMenu);
        return cadena;
    }
}
