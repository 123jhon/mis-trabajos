/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerospasos;

import javax.swing.JOptionPane;

/**
 *
 * @author jhone
 */
public class CalcularaArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String opc=JOptionPane.showInputDialog("ingrese una opion\n1 curadrado"
                + "\n2 rectangula\n3 triangulo\n4 circulo");
       int menu=Integer.parseInt(opc);
        
        switch (menu) {
            case 1:
                int lado=Integer.parseInt(JOptionPane.showInputDialog("ingrese"
                        + " un lado"));
                                                                     //lado(la base) y el dos seria el exponente
                System.out.println("el area del cuadrado es: "+Math.pow(lado,2));
                break;
            case 2:
                int base=Integer.parseInt(JOptionPane.showInputDialog(
                        "introduce la base"));
                int altura=Integer.parseInt(JOptionPane.showInputDialog(
                        "introduce la altura"));
                System.out.println("el area del rectangulo es"+base*altura);
                break;
            case 3:
                base=Integer.parseInt(JOptionPane.showInputDialog(
                        "introduce la base"));
                altura=Integer.parseInt(JOptionPane.showInputDialog(
                        "introduce la altura"));
                System.out.println("el area del triangulo"+(base*altura)/2);
                break;
            case 4:
                int radio=Integer.parseInt(JOptionPane.showInputDialog(
                        "introduce el radio"));
                System.out.println("el radio del circulo es: ");
                System.out.printf("%1.2f",Math.PI*(Math.pow(radio,2)));
                break;
            default:
                System.out.println("loco asi no!!!");
        }
        
    }
    
}
