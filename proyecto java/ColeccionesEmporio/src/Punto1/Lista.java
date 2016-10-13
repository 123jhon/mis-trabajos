    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package Punto1;

    import static java.lang.Math.E;
    import java.util.*;
    import java.util.Scanner;

    /**
     *
     * @author jhone
     */
    public class Lista {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {

            List<ListadoNumero> numeros = new ArrayList<>();
            int metodo;
            Scanner opcion = new Scanner(System.in);
             System.out.println("Por favor Ingrese el numero a almacenar");
            opcion = new Scanner(System.in);
            String entrada = "";
            Scanner entradaScaner = new Scanner(System.in);
            /**
             * Con este while se evalua la entrada al ciclo para la asigmacion de
             * numeros al arreglo
             *
             * @param entrada es la varariable que recibe el objeto scaner por el
             * teeclado
             * @param numero es la veriable que recibe el scrip cnverito en int para
             * agregarlo al arreglo
             *
             */
            int i = 0;
            do {
                System.out.println("Ingrese el numero" + " " + (i + 1));
                entrada = entradaScaner.next();
                if (!entrada.equalsIgnoreCase("fin")) {
                    int numero = Integer.parseInt(entrada);
                    numeros.add(new ListadoNumero(numero));
                    i++;
                }
            } while (!entrada.equalsIgnoreCase("fin"));

        }

    }

    class ListadoNumero implements Comparable<ListadoNumero> {

        private int numero;

        public ListadoNumero() {
        }

        public ListadoNumero(int numero) {
            this.numero = numero;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        @Override
        public String toString() {
            return "numero=" + numero;
        }

        @Override
        public int compareTo(ListadoNumero o) {
            if (o != null) {
                if (this.numero > o.getNumero()) {
                    return 1;
                } else if (this.numero < o.getNumero()) {
                    return -1;
                } else {
                    return 0;
                }
            } else {
                System.out.println("Error al comparar los numero, objeto no definido.");
                return -2;

            }
        }

    }
