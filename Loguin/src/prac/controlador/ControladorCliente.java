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
import pra.vista.JFCliente;

/**
 *
 * @author jhone
 */
public class ControladorCliente implements ActionListener{
    JFCliente vistaCliente = new JFCliente();
    EmpleadoDAO modeloCliente = new EmpleadoDAO();
    Empleado empleado=new Empleado();
    String dni,pass,privilegio;
    
    public ControladorCliente(JFCliente vistaCliente, EmpleadoDAO modeloCliente){
     this.vistaCliente=vistaCliente;
     this.modeloCliente=modeloCliente;
     this.vistaCliente.btnDatosCliente.addActionListener(this);
    }
    
    public void iniciarCliente(String dni,String pass,String privilgio){
        this.dni=dni;
        this.pass=pass;
        this.privilegio=privilgio;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     empleado=modeloCliente.verificarpreparedstatement(dni, pass, privilegio);
        JOptionPane.showMessageDialog(vistaCliente,"Datos Cliente \n"
                + "Apellidos y nombres"+empleado.getLog_primerApellido()+
                " | "+empleado.getLog_segApellido()+" \n "+
                empleado.getLog_priNombre()+" | "+empleado.getLog_segNombre()+"\n"+
                "Privilegio "+empleado.getLog_Privilegios());
    }
    
}
