/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamsemporio;

import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author jhone
 */
public class Escribiendo_Fichero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Escritor writer_first =new Escritor();
        writer_first.ecribir();
        writer_first.ecribirRescribir();
                
    
    }

}

class Escritor{

    public void ecribir() {
        
            String frase = "bueno y ahora que?";
        try {
           FileWriter escritura = new FileWriter("C:/Users/jhone/Documents/ejemplo Emporior.txt");
            for (int i = 0; i <frase.length(); i++) {
                escritura.write(frase.charAt(i));
            }
            escritura.close();  
        } catch (IOException ex) {
                ex.printStackTrace();
        }
    }
    public void ecribirRescribir() {
        
            String frase = "\nmm seguir que mas";
        try {
           FileWriter escritura = new FileWriter("C:/Users/jhone/Documents/ejemplo Emporior.txt",true);
            for (int i = 0; i <frase.length(); i++) {
                escritura.write(frase.charAt(i));
            }
            escritura.close();  
        } catch (IOException ex) {
                ex.printStackTrace();
        }
    }
}
