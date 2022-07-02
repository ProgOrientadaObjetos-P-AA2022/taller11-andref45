package paquete1;

import java.util.ArrayList;

/**
 *
 * @author andreflores 
 */
public class Cuenta {

    private String nom;
    private double iva;
    private ArrayList<Menu> listCar;
    private double sub;
    private double v_Canc;

    public Cuenta(String n, ArrayList<Menu> m, double i) {
        nom = n;
        listCar = m;
        iva = i;
    }

    public void establecerNombre(String n) {
        nom = n;
    }

    public void establecerIva(double n) {
        iva = n / 100;
    }

    public void establecerListaCartas(ArrayList<Menu> n) {
        listCar = n;
    }

    public void establecerSubtotal() {
        for (int i = 0; i < obtenerListaCartas().size(); i++) {
            sub += obtenerListaCartas().get(i).vMenu;
        }
    }

    public void establecerValorCancelar() {
        v_Canc = sub + (sub * (iva/100));
    }

    public String obtenerNom() {
        return nom;
    }

    public double obtenerIva() {
        return iva;
    }

    public ArrayList<Menu> obtenerListaCartas() {
        return listCar;
    }

    public double obtenerSubtotal() {
        return sub;
    }

    public double obtenerV_Can() {
        return v_Canc;
    }

    @Override
    public String toString() {
        String cadena = String.format("Factura\n"
                + "Cliente: %s\n", nom);
        for (int i = 0; i < obtenerListaCartas().size(); i++) {
            cadena = String.format("%s"
                    + "%s\n",
                    cadena,
                    obtenerListaCartas().get(i));
        }
        cadena = String.format("%sSubtotal: %.2f\n"
                + "Iva: %.1f%%\n"
                + "Total a cancelar: %.3f\n",
                cadena,
                sub,
                iva,
                v_Canc);
        return cadena;
    }

}
