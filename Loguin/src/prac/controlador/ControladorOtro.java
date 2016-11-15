/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac.controlador;

import java.awt.event.*;
import javax.swing.*;
import pra.modelo.Empleado;
import pra.modelo.EmpleadoDAO;
import pra.vista.JFOtro;

/**
 *
 * @author jhone
 */
public class ControladorOtro implements ActionListener{
    //instancia la vista del formulario JF
    JFOtro vistaOtro =new JFOtro();
    //instanciacionde base de datos cn la consulta
    EmpleadoDAO modeloOtro=new EmpleadoDAO();
    //instanciacion de el lenguaje java que maneja los datos de db
    Empleado empleado=new Empleado();
    String dni,pass,privilegio;
    //constructor de la clase
    public ControladorOtro(JFOtro vistaOtro,EmpleadoDAO modeloOtro){
    this.vistaOtro=vistaOtro;
    this.modeloOtro=modeloOtro;
    this.vistaOtro.btnOtro.addActionListener(this);
    }
    public void inciarOtro(String dni,String pass,String privilegio){
        this.dni=dni;
        this.pass=pass;
        this.privilegio=privilegio;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
          JOptionPane.showMessageDialog(vistaOtro,"Datos GOD \n"
                + "Apellidos y nombres"+empleado.getLog_primerApellido()+
                " | "+empleado.getLog_segApellido()+" \n "+
                empleado.getLog_priNombre()+" | "+empleado.getLog_segNombre()+"\n"+
                "Privilegio "+empleado.getLog_Privilegios());
    }
    
}
