package TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author jhone
 */
public class PreubaTreeSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
        //        @SuppressWarnings("Convert2Diamond")
        //        TreeSet<String> ordenarPersonas = new TreeSet<String>();
        //        ordenarPersonas.add("juan");
        //        ordenarPersonas.add("juan andres");
        //        ordenarPersonas.add("amanda");

        //        for (String Personas : ordenarPersonas) {
        //            System.out.println(Personas);
        //        }
        Articulo primero = new Articulo(1, "primer articulo");
        Articulo segundo = new Articulo(2, "segundo articulo");
        Articulo tercero = new Articulo(3, "tercero articulo");

        System.out.println("/////////ordenado por compareTo////////");
        @SuppressWarnings("Convert2Diamond")
        TreeSet<Articulo> ordenarArticulos = new TreeSet<Articulo>();
        ordenarArticulos.add(segundo);
        ordenarArticulos.add(primero);
        ordenarArticulos.add(tercero);

        for (Articulo j : ordenarArticulos) {
            System.out.println(j.getDescripcion());
        }
        System.out.println("\n este metodo organiza por indice int \n");

        System.out.println("\n///////////oyehha...//////////\n");

//        System.out.println("////////////ordenado por compare//////////");
//        ComparadorArticulos compara_art = new ComparadorArticulos();
//
//        TreeSet<Articulo> ordenaArticulo2 = new TreeSet<Articulo>(compara_art);
        TreeSet<Articulo> ordenaArticulo2 = new TreeSet<Articulo>(new Comparator<Articulo>() {
            public int compare(Articulo o1, Articulo o2) {
                String descri1 = o1.getDescripcion();
                String descri2 = o2.getDescripcion();
                return descri1.compareTo(descri2);

            }
        });
        ordenaArticulo2.add(primero);
        ordenaArticulo2.add(tercero);
        ordenaArticulo2.add(segundo);
        for (Articulo orde : ordenaArticulo2) {
            System.out.println(orde.getDescripcion());
        }

        System.out.println("\n este metodo organiza de forma alfabetica \n");

    }

}
//clase que se desea ordenar

class Articulo implements Comparable<Articulo> {

    @SuppressWarnings("FieldMayBeFinal")
    private int numero_articulo;
    @SuppressWarnings("FieldMayBeFinal")
    private String descripcion;

    public Articulo(int num, String dec) {
        this.descripcion = dec;
        this.numero_articulo = num;
    }

    public String getDescripcion() {

        return descripcion;
    }

    @Override
    public int compareTo(Articulo o) {

        return numero_articulo - o.numero_articulo;
    }

}
/*
 en caso de que se desea ordenar (alfabeticamente) 
 una clase que no hemos creado y para no implementar
 una interfaz 'en la clase que se desea ordenar' se 
 utiliza este procedimiento que se puede decir que 
 es util.
 */

//class ComparadorArticulos implements Comparator<Articulo> {
//
//    @Override
//    public int compare(Articulo o1, Articulo o2) {
//        String descri1 = o1.getDescripcion();
//        String descri2 = o2.getDescripcion();
//        return descri1.compareTo(descri2);
//
//    }
//
//}
