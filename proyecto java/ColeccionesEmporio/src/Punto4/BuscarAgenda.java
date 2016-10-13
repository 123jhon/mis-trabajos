    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto4;

import Punto3.IngresoAgenda;
import java.util.*;
import java.util.Map.Entry;

/**
 *
 * @author jhone
 */
public class BuscarAgenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, IngresoAgenda> entrada = new HashMap<String, IngresoAgenda>();
        Scanner read = new Scanner(System.in);
        int num, menu;
        String a, b, c, d, f, g;
        entrada.put("jhon", (new IngresoAgenda("jhon", "joya", " quintero ", " 3208606505 ", " mi correp ", 1)));
        entrada.put("marcela", (new IngresoAgenda("marcela", " gonzales ", " tonguino ", "1", " mi correo ", 2)));
        entrada.put("alexander", (new IngresoAgenda("alexander ", "g", "t", "1", "mi correo", 3)));

        System.out.println("para insertar datos pulsar 1"
                + "\npulsar 2 si desea buscar un contacto ");

        menu = read.nextInt();
        switch (menu) {
            case 1:

                do {
                    System.out.println("ingrese nombre");
                    a = read.next();
                    System.out.println("ingrese primer apellido");
                    c = read.next();
                    System.out.println("ingrese segundo quintero");
                    d = read.next();
                    System.out.println("ingrese numero de telefono");
                    f = read.next();
                    System.out.println("ingrese correo electronico");
                    g = read.next();
                    System.out.println("ingrese numero");
                    num = read.nextInt();
                    entrada.put(a, (new IngresoAgenda(a, c, d, f, g, num)));
                    a = null;
                    g = null;
                    g = read.next();
                } while (!g.equals("end") );
                break;
            case 2:
                System.out.println("escriba el nombre del contacto que desea buscar");
                 a = read.next();
                 entrada.get(a);
                 System.out.println(entrada.get(a).toString());
               
                break;
            default:
                throw new AssertionError();
        }

    }

}
