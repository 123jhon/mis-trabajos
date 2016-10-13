/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodearchivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SENA
 */
public class Escritura {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File archivo = null;
        FileWriter fw = null;
        PrintWriter pw = null;
        //BufferedWriter out = null;
        
        try {
            archivo = new File("./src/escritura.txt");
            fw = new FileWriter(archivo, false);
            pw = new PrintWriter(fw);
            //out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo), "UTF-8"));
        
            for (int i = 0; i < 10; i++) {
                pw.println("Linea N° " + i);
                //out.write("Linea N° " + i);
            }
        } catch (IOException ioe) {
            System.out.println("Error al iniciar la escritura del archivo.");
        } finally{
            if(fw != null){
                try {
                    fw.close();
                } catch (IOException ex) {
                    System.out.println("Error al intentar cerrar el archivo.");
                }
            }
        }
        
    }
}
