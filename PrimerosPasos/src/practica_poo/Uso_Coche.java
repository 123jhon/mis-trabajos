/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_poo;

/**
 *
 * @author jhone
 */
public class Uso_Coche {
    public static void main(String[] caramelo){
            //instanciando una clase
        Coche micarrito=new Coche(300,120, 300,4,12,"se complace en mostrar la"
                + "nueva linea de autos inteligentes con estas carateristicas"
                + ":");//Ejemplar de clase
        //ejemplarizando una clase
        Coche misegundocarro=new Coche(300, 400, 212, 4, 220," es bueno ");
//        System.out.println(micarrito.toString());
        System.out.println(misegundocarro.toString());
    
    }
}
