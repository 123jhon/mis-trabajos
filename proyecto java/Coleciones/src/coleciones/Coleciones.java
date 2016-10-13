/*Practica con las coleciones tema 1 'Clase' ArrayList */
package coleciones;
import java.util.ArrayList;
import java.util.Collection;
/** * * @author jhonex */
public class Coleciones {
    /**     * @param args the command line arguments*/
    public static void main(String[] Caramelo) {
        //El ArrayList se maneja con indices 
        ArrayList c1 = new ArrayList();
        //es decir al momento de agregar un elemento este ira
        c1.add("hello"); //en la posicion  '0'.......
        c1.add(5);//1
        c1.add(6);//2
        c1.add(2.3);//3
        //el c1.get(i) lo que retorna en un obejeto
        //para hacer la conversion hay que utilizar un integer
        //para pasar de objeto a un entero
        Object z=c1.get(3);
        //conversion para pasa el objeto a un numero
        Integer a=(Integer) c1.get(2);
        Integer b=(Integer) c1.get(2);
        
    }
    
}
