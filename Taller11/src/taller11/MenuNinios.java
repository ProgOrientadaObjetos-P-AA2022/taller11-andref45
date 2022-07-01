package taller11;

/**
 *
 * @author andreflores nombre del plato valor del menú valor inicial del menú
 * valor de porción de helado valor de porción de pastel
 */
public class MenuNinios extends Menu {

    private String nombrePlato;
    private double vMenu;
    private double vIMnu;
    private double vHela;
    private double vPast;

    public void establecerNomPlato(String n) {
        nombrePlato = n;
    }

    public void establecervIMenu(double n) {
        vIMnu = n;
    }

    public void establecervHela(double n) {
        vHela = n;
    }

    public void establecervPast(double n) {
        vPast = n;
    }

    @Override
    public void establecerValorCancelar() {
        vMenu = vIMnu + vHela + vPast;
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

    public double obtenervHela() {
        return vHela;
    }

    public double obtenervPast() {
        return vPast;
    }

    @Override
    public String toString() {
        String cadena = String.format("Plato: %s\n"
                + "Valor inicial: %.2f\n"
                + "Valor helado: %.2f\n"
                + "Valor pastel: %.2f\n"
                + "Valor del Menú: %.2f\n",
                nombrePlato,
                vIMnu,
                vHela,
                vPast,
                vMenu);
        return cadena;
    }

}
