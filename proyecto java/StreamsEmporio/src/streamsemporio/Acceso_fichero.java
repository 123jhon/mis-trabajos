package streamsemporio;

import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Acceso_fichero {

    public static void main(String[] args) {
        leer_Fichero ver = new leer_Fichero();
        ver.read();
    }

}

class leer_Fichero {

    public void read() {
        FileReader entrada = null;
        try {
            entrada = new FileReader("C:/Users/jhone/Documents/ejemplo Emporio.txt");
            int c = 0;
            while (c != -1) {

                c = entrada.read();
                char letra = (char) c;
                System.out.print(letra);

            }
        } catch (IOException ioe) {
            System.out.println("donde esta!!!!!!! la hemos liado :(");
        } finally {
            try {
                entrada.close();
            } catch (IOException ex) {
                Logger.getLogger(leer_Fichero.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
