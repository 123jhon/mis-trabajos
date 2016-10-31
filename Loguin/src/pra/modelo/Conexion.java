/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pra.modelo;
import java.sql.*;
/**
 *
 * @author jhone
 */
public class Conexion {
        
    //creacion de constructor
    public Conexion(){}
    
    public Connection getConexion(){
        Connection con=null;
        //manejo de excepciones en el momento
        //al hacer conexion a la bd
        try {
            /*Instanciar el driver de db*/
            /*se encuentra en la ibreria jdbc */
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            //Conexion a la base de datos
            //PRIMERO EL URL DE conexion el segundo el cliente en este caso 
            //root de la bd
            // en el otro la contraseña
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_prueba","root","nbuser");
        } catch (Exception e) {
        }
 
        return con;
    }
           
}
