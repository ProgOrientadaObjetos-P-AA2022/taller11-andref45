
package paquete2;

import paquete1.MenuNinios;
import paquete1.Menu;
import paquete1.Cuenta;
import paquete1.MenuEconom;
import paquete1.MenuCarta;
import paquete1.MenuDia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {

    /**
     * @param args the command line arguments
     * Factura
    Cliente: René Elizalde
    Menu del Día:
	Plato: Niños 01
	Valor Inicial: 2,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 4,50

    Menu del Día:
	Plato: Niños 02
	Valor Inicial: 3,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 5,50

    Menu Económico:
	Plato: Econo 001
	Valor Inicial: 4,00
	Porcentaje Descuento: 25,00
	Valor del Menú: 3,00

    Menu del Día:
	Plato: Dia 001
	Valor Inicial: 5,00
	Valor bebida: 1,00
	Valor postre: 1,00
	Valor del Menú: 7,00

    Menu a la Carta:
	Plato: Carta 001
	Valor Inicial: 6.0
	Valor guarnición: 1.5
	Valor bebida: 2.0
	Porcentaje Adicional: 10,00
	Valor del Menú: 10,10

    Subtotal: 30,1
    IVA: 10,0%
    Total a pagar: 33,110

     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Menu> menu = new ArrayList<>();
        MenuNinios mn = new MenuNinios("Niños 01", 2, 1, 1.5);
        menu.add(mn);
        
        MenuNinios mn2 = new MenuNinios("Niños 02", 3, 1, 1.5);
        menu.add(mn2);
        
        MenuEconom me = new MenuEconom("Econo 001", 4, 25);
        menu.add(me);
        
        MenuDia mdia = new MenuDia("Dia 001", 5, 1, 1);
        menu.add(mdia);
        
        MenuCarta mC = new MenuCarta("Carta 001", 6, 1.5, 2, 10);  
        menu.add(mC);
        
        for (int i = 0; i < menu.size(); i++) {
            menu.get(i).establecerVMenu();
        }
        
        Cuenta cuenta = new Cuenta("René Elizalde", menu, 10);
        cuenta.establecerSubtotal();
        cuenta.establecerValorCancelar();

        System.out.println(cuenta);
    }
    
}
