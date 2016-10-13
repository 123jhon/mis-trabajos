/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodearchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SENA
 */
public class Lectura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader bf = null;

        /*do{
            linea = bf.readLine(); 
            if(linea != null){
                System.out.println(linea);
            }
        }while(linea != null);
         */
        try {
            //archivo = new File("C:\\Users\\SENA\\Documents\\NetBeansProjects\\ManejoDeArchivos\\src\\lectura.txt");
            archivo = new File("./src/lectura.txt");
            fr = new FileReader(archivo);
            bf = new BufferedReader(fr);

            String linea = "";
            while ((linea = bf.readLine()) != null) {
                System.out.println(linea);
                String[] datos = linea.split(";");
                if(datos.length == 3){
                    System.out.println("Nombres: " + datos[0]);
                    System.out.println("Apellidos: " + datos[1]);
                    System.out.println("Cargo: " + datos[2]);
                    System.out.println("***********************************");
                }
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("Error al iniciar la lectura del archivo.");
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            System.out.println("Error al leer una linea del archivo.");
            ioe.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException ex) {
                    System.out.println("Error al intentar cerrar el archivo.");
                }
            }
        }

    }

}
