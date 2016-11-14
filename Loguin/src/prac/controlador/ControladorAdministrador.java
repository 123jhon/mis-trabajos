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
/**
 *
 * @author jhone
 */
public class ControladorAdministrador implements ActionListener{
    JFAdministrador vistaAdmin=new JFAdministrador();
    EmpleadoDAO modeloAdmin=new EmpleadoDAO();
    Empleado empleado=new Empleado();
    String dni,pass,privielgio;
    public ControladorAdministrador(JFAdministrador vistaAdmin,EmpleadoDAO modeloAdmin){
        this.vistaAdmin=vistaAdmin;
        this.modeloAdmin=modeloAdmin;
        this.vistaAdmin.btnDatosAdministrador.addActionListener(this);
    
    }
    public void iniciarAdministrador(String dni,String pass,String privilegio){
        this.dni=dni;
        this.pass=pass;
        this.privielgio=privilegio;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //metodo para valirdar por base de datos que trae la clase DAO
        empleado=modeloAdmin.verificarpreparedstatement(dni, pass, privielgio);
        JOptionPane.showMessageDialog(vistaAdmin, "Datos de Aministrador \n"
                + "Apellidos y Nombres: "+empleado.getLog_primerApellido()+" | "+empleado.getLog_segApellido()+
                " , "+empleado.getLog_priNombre()+" | "+empleado.getLog_segNombre()+"\n"+
                "Privilegio "+empleado.getLog_Privilegios());
    }
    
}
