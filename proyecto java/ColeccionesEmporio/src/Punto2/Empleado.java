package Punto2;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author jhone
 */
public class Empleado {
    @SuppressWarnings("FieldMayBeFinal")
    private int numeroEmpleado;
    @SuppressWarnings("FieldMayBeFinal")
    private String nombre;
    @SuppressWarnings("FieldMayBeFinal")
    private String apellido;
    @SuppressWarnings("FieldMayBeFinal")
    private int dia;
    @SuppressWarnings("FieldMayBeFinal")
    private int mes;
    @SuppressWarnings("FieldMayBeFinal")
    private int ano;
    private int lonng;
    public Empleado(){}
    public Empleado(int numeroEmpleado, String nombre, String apellido, int dia, int mes, int ano) {
        this.numeroEmpleado = numeroEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }
    
    public int getlonng(){
     lonng=this.ano+this.dia+this.mes;
        return lonng;
    }
    
    public String getNombre(){
   
    return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        
        if (this.ano != other.ano && this.mes != other.mes && this.dia != other.dia) {
             System.out.println("el objeto"+obj+"ingreso en diferente dia "
                     + "mes y año");
            return false;
           
        }
        
        if (this.ano != other.ano && this.mes != other.mes) {
             System.out.println("no Año");
              System.out.println("el objeto"+obj+"ingreso en diferente"
                     + "mes y año");
             return false;
           
        }
        if (this.ano != other.ano && this.dia != other.dia) {
              System.out.println("ingreso en diferente dia y"
                     + " año");
           
             return false;
           
        }
         if (this.mes != other.mes && this.dia!=other.dia) {
             System.out.println("ingreso en diferente dia y"
                     + " mes");
             return false;    
            }
        if (this.ano != other.ano ) {
             System.out.println("diferente Año");
           
             return false;
           
        }
        
         if (this.mes != other.mes) {
             System.out.println("diferente mes");
             return false;    
            }
         if (this.dia != other.dia) {
             System.out.println("diferente dia");
            return false;
         }
        System.out.println("ingresaron el mismo dia");
        return true;
    }
//    public boolean (Object obj,){}
    
    

}
