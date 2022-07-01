package taller11;

import java.util.ArrayList;

/**
 *
 * @author andreflores con datos iniciales como: nombre del cliente, IVA,
 * listado de cartas -menú-, valor a cancelar total
 */
public class Cuenta {

    private String nom;
    private int iva;
    private ArrayList<Menu> listCar;
    private double sub;
    private double v_Canc;

    public Cuenta(String n, ArrayList<Menu> m, int i) {
        nom = n;
        listCar = m;
        iva = i;
    }

    public void establecerNombre(String n) {
        nom = n;
    }

    public void establecerIva(int n) {
        iva = n;
    }

    public void establecerListaCartas(ArrayList<Menu> n) {
        listCar = n;
    }

    public void establecerSubtotal() {
        for (int i = 0; i < obtenerListaCartas().size(); i++) {
            sub += obtenerListaCartas().get(i).obtenerValorCancelar();
        }
    }

    public void establecerValorCancelar() {

    }

    public String obtenerNom() {
        return nom;
    }

    public int obtenerIva() {
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
    
    /*@Override
    public String toString(){
    String cadena = String.format(nom, args)
    }*/
}
