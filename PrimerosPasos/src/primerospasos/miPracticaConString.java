/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerospasos;

/**
 *
 * @author jhone
 */
public class miPracticaConString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String miName="jhonsito";
        System.out.println("numero"+miName.length());
        System.out.println("pos "+miName.charAt(3));
    int ultima_letra=miName.length();
        System.out.println(miName.charAt(ultima_letra-1));
        
        String frase="hola mi nombre es jhon estooy afinando mis conocimientos en java";
        String frase_resumen=frase.substring(1,5);
        System.out.println(frase_resumen);
            
    }
    
}
