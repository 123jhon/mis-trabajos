/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkendList;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author jhone
 */
public class PruebaLinkendList {

    public static void main(String[] ags) {
        @SuppressWarnings({"Convert2Diamond", "MismatchedQueryAndUpdateOfCollection"})
        LinkedList<String> paises=new LinkedList<String>();
        
        paises.add("colombia");
        paises.add("españa");
        paises.add("Mexico");
        paises.add("peru");
        
        
        @SuppressWarnings({"MismatchedQueryAndUpdateOfCollection", "Convert2Diamond"})
        LinkedList<String> capitales=new LinkedList<String>();
        
        capitales.add("bogota");
        capitales.add("madrid");
        capitales.add("D.F");
        capitales.add("lima");
        
        ListIterator<String> iterA=paises.listIterator();
        ListIterator<String> iterB=capitales.listIterator();
        while(iterB.hasNext()){
            if (iterA.hasNext()) {
                iterA.next();
            }
            iterA.add(iterB.next());
        }   
        System.out.println(paises);
        iterB=capitales.listIterator();
        while (iterB.hasNext()) {
            iterB.next();
            if (iterB.hasNext()) {
                iterB.next();
                System.out.println("-----");
                iterB.remove();
             System.out.println(capitales);
             paises.removeAll(capitales);
                System.out.println(paises);
            }
        }
    
    }
}
