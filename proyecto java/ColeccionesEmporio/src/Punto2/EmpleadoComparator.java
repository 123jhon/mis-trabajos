/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;

import java.util.*;

/**
 *
 * @author jhone
 */
public class EmpleadoComparator implements Comparator<Empleado>{

    @Override
    public int compare(Empleado obj1, Empleado obj2) {
       int rta=0;
        if (obj1.getlonng() > obj2.getlonng()) {
            rta=1;
        }else if(obj1.getlonng() < obj2.getlonng()){
        rta=-1;
        }else{
            System.out.println("------");
            if(obj1.getNumeroEmpleado()>obj2.getNumeroEmpleado()){
                rta=1;
            }
            if(obj1.getNumeroEmpleado()<obj2.getNumeroEmpleado()){
                rta=-1;
            }else{
            
                rta=0;
            }
        }
        
        return rta;
    }
    
}
