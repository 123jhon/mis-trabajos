/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac.controlador;
import javax.swing.*;
import java.awt.event.*;
import pra.modelo.Empleado;
import pra.modelo.EmpleadoDAO;
import pra.vista.JFAdministrador;
import pra.vista.JFLoguin;

/**
 *
 * @author jhone
 */ 
public class ControladorLoguin  implements ActionListener{
        JFLoguin vistaLoguin= new JFLoguin();
        EmpleadoDAO modeloLoguin=new EmpleadoDAO();
        Empleado empleado=new Empleado();
        
        public ControladorLoguin(JFLoguin vistaLoguin,EmpleadoDAO modeloLoguin){
         this.vistaLoguin=vistaLoguin;
         this.modeloLoguin=modeloLoguin;
         this.vistaLoguin.btnIngresar.addActionListener(this);
                 
        }
        public void inicarLoguin(){}
        public void actionPerformed(ActionEvent e){
            String dni=vistaLoguin.txtDni.getText();
            //porque existe una mascara en este iput de tipo password 
            String pass=String.valueOf(vistaLoguin.txtPas.getText());
            String privilegio=String.valueOf(vistaLoguin.txtPri.getSelectedItem());
            empleado=modeloLoguin.verificarpreparedstatement(dni, pass, privilegio);
            if (empleado==null) {
                JOptionPane.showMessageDialog(vistaLoguin, "Empleado no encontrado....\n mira unas tetas (.)(.)");
                
            }else{
                    JOptionPane.showMessageDialog(vistaLoguin, "Datos correctos");
                    JFAdministrador vistaA=new JFAdministrador(); 
                    vistaA.lblBienvenida.setText("Bienvenido "+empleado.getLog_priNombre());
                    ControladorAdministrador controladorA=new ControladorAdministrador(vistaA, modeloLoguin);
                    controladorA.iniciarAdministrador(dni, pass, privilegio);
                    
                    //para mostrar la vista administrador
                    vistaA.setVisible(true);
                    vistaA.setLocationRelativeTo(null);
                    //para ocultar la vista loguin
                    vistaLoguin.setVisible(false);
            }
        }
}
