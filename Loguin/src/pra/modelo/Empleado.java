    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pra.modelo;

/**
 *
 * @author jhone
 */
public class Empleado {
    private int log_dni;
    private String log_pass;
    private String log_primerApellido;
    private String log_segApellido;
    private String log_priNombre;
    private String log_segNombre;
    private String log_Privilegios;
    public Empleado(){
        this.log_dni=0;
        this.log_primerApellido="";
        this.log_segApellido="";
        this.log_priNombre="";
        this.log_segNombre="";
        this.log_Privilegios="";
        
    }

    public int getLog_dni() {
        return log_dni;
    }

    public void setLog_dni(int log_dni) {
        this.log_dni = log_dni;
    }

    public String getLog_pass() {
        return log_pass;
    }

    public void setLog_pass(String log_pass) {
        this.log_pass = log_pass;
    }

    public String getLog_primerApellido() {
        return log_primerApellido;
    }

    public void setLog_primerApellido(String log_primerApellido) {
        this.log_primerApellido = log_primerApellido;
    }

    public String getLog_segApellido() {
        return log_segApellido;
    }

    public void setLog_segApellido(String log_segApellido) {
        this.log_segApellido = log_segApellido;
    }

    public String getLog_priNombre() {
        return log_priNombre;
    }

    public void setLog_priNombre(String log_priNombre) {
        this.log_priNombre = log_priNombre;
    }

    public String getLog_segNombre() {
        return log_segNombre;
    }

    public void setLog_segNombre(String log_segNombre) {
        this.log_segNombre = log_segNombre;
    }

    public String getLog_Privilegios() {
        return log_Privilegios;
    }

    public void setLog_Privilegios(String log_Privilegios) {
        this.log_Privilegios = log_Privilegios;
    }
    
}
