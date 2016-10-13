package LinkendList;
import java.util.*;
public class EjemploList{

    public static void main(String[] caramelo) {
        @SuppressWarnings("Convert2Diamond")
        LinkedList<String> people=new LinkedList<String>();
        people.add("marcela");
        people.add("jhon");
        people.add("ingrid");
        people.add("alexander");
        System.out.println("cantidad de personas "+people.size());
        ListIterator<String> it= people.listIterator();
        it.next();
        it.add("te amo");
        for (String people1 : people) {
            System.out.println(people1);
        }
    }
}
