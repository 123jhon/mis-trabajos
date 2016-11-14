/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loguin;

import pra.modelo.EmpleadoDAO;
import pra.vista.JFLoguin;
import prac.controlador.ControladorLoguin;

/**
 *
 * @author jhone
 */
public class Loguin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFLoguin vistaL=new JFLoguin();
        EmpleadoDAO modeloL=new EmpleadoDAO();
        ControladorLoguin controladoL = new ControladorLoguin(vistaL, modeloL); 
        
        vistaL.setVisible(true);
        vistaL.setLocationRelativeTo(null);
    }
    
}
