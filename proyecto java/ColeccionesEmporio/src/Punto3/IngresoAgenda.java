/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3;

/**
 *
 * @author jhone
 */
public class IngresoAgenda {

    private String nombre;
    private String apellido;
    private String segundoApellido;
    private String telefono;
    private String correoElectronico;
    private int movil;

    public IngresoAgenda(String nombre, String apellido, String segundoApellido, String telefono, String correoElectronico, int movil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.segundoApellido = segundoApellido;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.movil = movil;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getMovil() {
        return movil;
    }

    public void setMovil(int movil) {
        this.movil = movil;
    }

    @Override
    public String toString() {
        return  nombre + " " + apellido + " " 
                + segundoApellido + 
                 telefono +" " 
                + correoElectronico + "  " 
                + movil ;
    }

}
