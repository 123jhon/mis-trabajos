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
public class IngresoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String user = "juan";
        String pass = "";
//        while(!user.equals("jhon")&&!password.equals("fun")){   
//        user=JOptionPane.showInputDialog("deposit user");
//        pass=JOptionPane.showInputDialog("deposit password");
//        if (user.equals("jhon")&&pass.equals("fun")) {
//            System.out.println("ingreso exitoso");
//        }else{
//            System.out.println("access X");
//        }
//        }
        while (user.equals(pass) == false) {
            user = JOptionPane.showInputDialog("deposit user");
            pass = JOptionPane.showInputDialog("deposit password");
            if (user.equals(pass) == false) {
                System.out.println("contraseña incorrecta");
            }
        
        }
        System.out.println("good.... correct password");
    }

}
