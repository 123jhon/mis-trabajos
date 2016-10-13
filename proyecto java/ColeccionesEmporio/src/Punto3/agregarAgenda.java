/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3;

import java.util.*;


/**
 *
 * @author jhone
 */
public class agregarAgenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<IngresoAgenda> misDatos = new ArrayList<>();

        misDatos.add(new IngresoAgenda("jhon","joya","quintero","1","mi correo",1));
        misDatos.add(new IngresoAgenda("marcela","gonzales","tonguino","1","mi correo",2));
        misDatos.add(new IngresoAgenda("alexander","g","t","1","mi correo",3));

        Collections.sort(misDatos, new OrgnizarAgenda());
        for (IngresoAgenda impre : misDatos) {
            System.out.println(impre.toString());
        }

    }

}
