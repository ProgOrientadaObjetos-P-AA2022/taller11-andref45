
package paquete2;

import taller11.*;

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
        MenuNinios mn = new MenuNinios();
        mn.establecerNomPlato("Niños 01");
        mn.establecervIMenu(2);
        mn.establecervHela(1);
        mn.establecervPast(1.5);
        mn.establecerValorCancelar();
        
        MenuNinios mn2 = new MenuNinios();
        mn2.establecerNomPlato("Niños 02");
        mn2.establecervIMenu(3);
        mn2.establecervHela(1);
        mn2.establecervPast(1.5);
        mn2.establecerValorCancelar();
        
        MenuEconom me = new MenuEconom();
        me.establecerNomPlato("Econo 001");
        me.establecervIMenu(4);
        me.establecerPor(25);
        me.calcularVMenu();
        
        MenuDia mdia = new MenuDia();
        mdia.establecerNomPlato("Dia 001");
        mdia.establecervIMenu(5);
        mdia.establecervBeb(1);
        mdia.establecervPost(1);
        mdia.establecerValorCancelar();
        
        
        MenuCarta mC = new MenuCarta();
        mC.establecerNomPlato("Carta 001");
        mC.establecervIMenu(6);
        mC.establecerVGuar(1.5);
        mC.establecervBeb(2);
        mC.establecerPor(10);
        mC.establecerValorCancelar();
        
    }
    
}
