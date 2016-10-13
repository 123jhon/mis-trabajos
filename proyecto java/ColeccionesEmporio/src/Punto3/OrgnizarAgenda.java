/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3;

import java.util.Comparator;

/**
 *
 * @author jhone
 */
public class OrgnizarAgenda implements Comparator<IngresoAgenda>{

    @Override
    public int compare(IngresoAgenda obj1, IngresoAgenda obj2) {
        return obj1.getNombre().compareTo(obj2.getNombre());
    }
    
}
