/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.Comparator;

/**
 *
 * @author Ismael
 */
public class ComparadorEquipo implements Comparator<Equipo>{

    @Override
    public int compare(Equipo e1, Equipo e2){
        if(e1 != null && e2 != null){
            
            if(e1.getNombreEquipo().compareTo(e2.getNombreEquipo()) > 0){
                return 1;
            }else if(e1.getNombreEquipo().compareTo(e2.getNombreEquipo()) < 0){
                return -1;
            } else{
                if(e1.getNumEquipo() > e2.getNumEquipo()){
                    return 1;
                } else if(e1.getNumEquipo() < e2.getNumEquipo()){
                    return -1;
                } else{
                    return 0;
                }
            }
        } else{
            System.out.println("Error al comparar los equipos, objeto no definido.");
            return -2;
        }
    }
    
}
