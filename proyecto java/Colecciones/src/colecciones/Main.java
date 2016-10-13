/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Ismael
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Equipo> equiposInscritos = new ArrayList<>();
        
        Map<Integer, Equipo> equiposMap = new HashMap<>();
        
        equiposMap.put(1111, new Equipo(1, "Las Aguilas", "Pepito"));
        equiposMap.put(2222, new Equipo(5, "Los Peludos", "Andres"));
        equiposMap.put(3333, new Equipo(8, "Los Calvos", "Rodolfo"));
        equiposMap.put(4444, new Equipo(6, "Los Calvos", "Andrea"));
        equiposMap.put(5555, new Equipo(3, "Naranja Mecánica", "Felipe"));
        
        //Iterator<Equipo> it = equiposInscritos.iterator();
        Iterator<Integer> it = equiposMap.keySet().iterator();
        
        while(it.hasNext()){
            Integer key = it.next();
            Equipo e = equiposMap.get(key);
            System.out.println(e);
        }
        
        equiposInscritos.add(new Equipo(1, "Las Aguilas", "Pepito"));
        equiposInscritos.add(new Equipo(5, "Los Peludos", "Andres"));
        equiposInscritos.add(new Equipo(8, "Los Calvos", "Rodolfo"));
        equiposInscritos.add(new Equipo(6, "Los Calvos", "Andrea"));
        equiposInscritos.add(new Equipo(3, "Naranja Mecánica", "Felipe"));
        
        for (Equipo equiposInscrito : equiposInscritos) {
            System.out.println(equiposInscrito);
            System.out.println("*****************************");
        }
        
        ComparadorEquipo ce = new ComparadorEquipo();
        if(equiposInscritos.get(1).compareTo(equiposInscritos.get(3)) == 1){
            System.out.println("El equipo que está en la ubicación 1 es mayor que el ubicado en la 3");
        }
        
        
        equiposInscritos.sort(ce);
        
        System.out.println("======================================");
        for (Equipo equiposInscrito : equiposInscritos) {
            System.out.println(equiposInscrito);
            System.out.println("*****************************");
        }
    }
    
}
