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
public class PracticaInputs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String name_user=   JOptionPane.showInputDialog("deposit your name please");
    String age=JOptionPane.showInputDialog("deposit your age please");
    int age_user=Integer.parseInt(age);
        System.out.println("hey "+name_user+" your have "+(age_user+1)+" age");
    }
    
}
