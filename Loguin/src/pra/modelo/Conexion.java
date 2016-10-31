/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pra.modelo;
import java.sql.*;
import java.lang.*;
import javax.swing.JOptionPane;
/**
 *
 * @author jhone
 */
public class Conexion {
            //Conexion a la base de datos
            //PRIMERO EL URL DE conexion el segundo el cliente en este caso 
            //root de la bd
            // en el otro la contraseña
    public final static String SERVER_NAME = "localhost";
    public final static String SERVER_PORT = "3306";
    public final static String DB_NAME = "db_session";
    public final static String DB_USER = "root";
    public final static String DB_PASS = "nbuser"; 
    //creacion de constructor
    public Conexion(){}
    
        private static Conexion singleton;
        private Connection con;
    
    public Connection getConexion(){
        //manejo de excepciones en el momento
        //al hacer conexion a la bd
        try {
            /*Instanciar el driver de db*/ /*se encuentra en la ibreria jdbc */
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://" + SERVER_NAME + ":" + SERVER_PORT + "/" + DB_NAME; 
            this.con = DriverManager.getConnection(url, DB_USER, DB_PASS);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showInputDialog("Verifique el conector jdbc");
        } catch (SQLException ex) {
            if(ex.getErrorCode() == 1049){
                JOptionPane.showInputDialog(ex.getErrorCode() +": Verifique el nombre de la base de datos.");
            } else if(ex.getErrorCode() == 1045){
                JOptionPane.showInputDialog(ex.getErrorCode() +": Verifique el usuario de la base de datos.");
            } else{
                JOptionPane.showInputDialog(ex.getErrorCode() +": Verifique la concexion al servidor y datos de conexión.");
            }
        }
        catch (IllegalAccessException | InstantiationException II) {
            JOptionPane.showInputDialog("Caray hiciste algo mal");
        }
 
        return con;
    }
           
}
