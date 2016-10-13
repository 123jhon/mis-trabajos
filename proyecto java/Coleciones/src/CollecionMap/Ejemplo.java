/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollecionMap;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author jhone
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings({"StringEquality", "UnusedAssignment"})
    public static void main(String[] args) {
        // TODO code application logic here
        int menu, c;
        String a, b;
        Scanner lectura = new Scanner(System.in);
        @SuppressWarnings("Convert2Diamond")
        HashMap<String, Empleado> personal = new HashMap<String, Empleado>();
        personal.put("200", new Empleado("Jhon Alexander Joya Quintero"));

        personal.put("201", new Empleado("Victor Hugo Gaitan Gaitan"));

        personal.put("202", new Empleado("Ingrid marcela gonzales tonguino"));

        personal.put("203", new Empleado("Maira Lucila Joya Quintero"));
        System.out.println(personal);

        System.out.println("que personal desea para cambiar pulse 2 \npara"
                + " eliminar pulse 1 para cambiar\n"
                + "para agregar pulse 3"
                + "para visualizar la collecion pulse 4");
        do {    
            
        menu = lectura.nextInt();
        switch (menu) {
            case 1:
                System.out.println("digite el nombre de la persona ");
                a = lectura.next();
                personal.remove(a);
                System.out.println(personal);
                a = null;
                break;
            case 2:
                System.out.println("digite el numero de la persona que desea "
                        + "cambiar");
                a = lectura.next();
                System.out.println("digite el nombre de la persona");
                b = lectura.next();
                personal.put(a, new Empleado(b));
                System.out.println(personal);
                a = null;
                b = null;
                break;
            case 3:
                do {
                    System.out.println("digite el numero del empleado");
                    a = lectura.next();
                    System.out.println("digite el nombre de la persona");
                    b = lectura.next();
                    personal.put(a, new Empleado(b));
                    System.out.println("para finalizar pulse n");
                    a = lectura.next();
                } while (a != "n");
                
                break;
            case 4:
//                System.out.println(personal.entrySet());
                for(Map.Entry<String,Empleado> entrada: personal.entrySet()){
                    String clave=entrada.getKey();
                    Empleado valor=entrada.getValue();
                    System.out.println("clave-> "+clave+" valor-> "+valor);
                } 
                break;
            default:
                System.out.println("loco esa no es una opcion y no se termina }"
                        + "aqui");
        }
            System.out.println("desea terminar pulse 1"
                    + " o desea ejecutar otra opcion pulse cualquier numero");
            
            c=lectura.nextInt();
            System.out.println("conoces las instruciones");
        } while (c!=1);
        

    }

}

class Empleado {

    @SuppressWarnings("FieldMayBeFinal")
    private String nombre;
    @SuppressWarnings("FieldMayBeFinal")
    private double sueldo;

    public Empleado(String n) {
        this.nombre = n;
        this.sueldo = 2000;
    }

    @Override
    public String toString() {
        return " El empleado " + nombre + " tiene un sueldo de: " + sueldo;
    }

}
