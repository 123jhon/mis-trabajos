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
public class EnterNuber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x=21.00000;
        System.out.printf("%1.2f",x/3);
        
        String num1=JOptionPane.showInputDialog("ingresa un numero");
        double num2=Double.parseDouble(num1);
        System.out.println("the raiz of "+num2+" is: ");
        System.out.printf("%1.2f",Math.sqrt(num2));
    }
    
}
