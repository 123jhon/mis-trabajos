/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerospasos;

import javax.swing.*;

/**
 *
 * @author jhone
 */
public class PesoIdeal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String genero = "";
        do {
            genero = JOptionPane.showInputDialog("introducsca su genero(H/M)");
                                          //EL (equalsIgnoreCase) sirve para
            //ignorar si es mayuscula o minuscula
            //la letra que este dentro del parametro.
        } while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);
        int altura = Integer.parseInt(JOptionPane.showInputDialog("introduce tu altura en cm"));
        int pesoIdeal = 0;
        if (genero.equalsIgnoreCase("H")) {
            pesoIdeal = altura - 110;
        } else if (genero.equalsIgnoreCase("M")) {
            pesoIdeal = altura - 120;
        }
        System.out.println("tu peso ideal es: "+pesoIdeal);
        
    
    }
    
}
