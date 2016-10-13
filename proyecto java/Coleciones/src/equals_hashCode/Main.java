package equals_hashCode;
/**
 *
 * @author jhone
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro libro1=new Libro("Bajo la misma estrella","john green",97895857);
        Libro libro2=new Libro("Bajo la misma estrella","john green",97895857);
        
//        libro1=libro2;
        if (libro1.equals(libro2)) {
            System.out.println("caray tiene un excelente libro"
                    + "\npero es repetido");
                 System.out.println(libro1.hashCode());
                 System.out.println(libro2.hashCode());
       
        }else{
            System.out.println("como para leer el libro 1");
            System.out.println(libro1.hashCode());
            System.out.println(libro2.hashCode());
        }
    }
    
}
