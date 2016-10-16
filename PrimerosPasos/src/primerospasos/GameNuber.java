package primerospasos;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author jhone
 */
public class GameNuber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aleatorio = (int) (Math.random() * 100);
        Scanner lectura = new Scanner(System.in);
        int numero = 0;
        int intentos = 0;

        do {
            intentos++;
            System.out.println("Adivina que numero es?");
            numero = lectura.nextInt();
            if (aleatorio < numero) {
                System.out.println("mas bajo");
            }
            if (aleatorio > numero) {
                System.out.println("mas alto");
            }

        } while (numero != aleatorio);

        System.out.println("lo adivinaste y tuviste una muy buena racha"
                + " tus intentos fueron" + intentos);

    }

}
