package primerospasos;
import javax.swing.JOptionPane;
public class NumeroFactorial {
    /** * @param args the command line arguments */
    public static void main(String[] args) {
        Long resultado=1L;
        int numero=Integer.parseInt(JOptionPane.showInputDialog("ingrese el "
                + "numero factorial \n(solo el numero)"));
        for (int i = numero; i > 0; i--) {
            resultado=resultado*i; 
            System.out.println("n "+resultado+" f "+i);
        }
            System.out.println("el factorial del numero "+numero+" es igual "
                 +resultado);
    }

}
