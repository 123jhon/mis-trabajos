/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.baloto.controlador;

import edu.baloto.modelo.Numeros;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Sena
 */
@ManagedBean
@SessionScoped
public class balotoControlador {
    
    private int[] baloto = new int[6];
    /**
     * Creates a new instance of balotoControlador
     */
    public balotoControlador() {
    }

    public int[] getBaloto() {
        return baloto;
    }

    public void setBaloto(int[] baloto) {
        this.baloto = baloto;
    }
    
    public String mostrarNumeros(){
    Numeros miObj = new Numeros();
    baloto = miObj.genararNumero();
    return "index";
    }
}
