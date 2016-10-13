package Punto2;
import java.util.*;
/**
 *
 * @author jhone
 */
public class Main {

    /**
     * @param caramelo the command line arguments
     */
    public static void main(String[] caramelo) {
       
        List<Empleado> lista1 =new ArrayList<>();
       
        lista1.add (new Empleado(11, "jhon","alexander", 6,1,1999));
        lista1.add (new Empleado(12, "juan","arturo" ,7,2,2001));
        lista1.add (new Empleado(13, "jhon1","alexander",14,5,2013));
        lista1.add (new Empleado(14, "jhon2","alexander",24,3,1994));
        lista1.add (new Empleado(15, "jhon3","alexander",4,2,1991));
        lista1.add (new Empleado(16, "jhon4","alexander",13,1,1980));
        lista1.add (new Empleado(17, "jhon5","alexander",12,1,2016));
        
   
            Collections.sort(lista1, new EmpleadoComparator());
             for (Empleado in : lista1) {
                 System.out.println(in.getNombre()+" "+in.getNumeroEmpleado());
        }
            
    }
    
}
