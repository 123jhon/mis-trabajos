/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.crudbasico.modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ismael
 */
public class Conexion {
    public final static String SERVER_NAME = "localhost";
    public final static String SERVER_PORT = "3306";
    public final static String DB_NAME = "db_session";
    public final static String DB_USER = "root";
    public final static String DB_PASS = "";
    
    private static Conexion singleton;
    private Connection cn;
    
    private Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // jdbc:motorBD://nombreSevidor:puerto/nombreBD
            String url = "jdbc:mysql://" + SERVER_NAME + ":" + SERVER_PORT + "/" + DB_NAME;
            this.cn = DriverManager.getConnection(url, DB_USER, DB_PASS);
        } catch (ClassNotFoundException ex) {
            System.out.println("Verifique el conector jdbc");
        } catch (SQLException ex) {
            if(ex.getErrorCode() == 1049){
                System.out.println(ex.getErrorCode() +": Verifique el nombre de la base de datos.");
            } else if(ex.getErrorCode() == 1045){
                System.out.println(ex.getErrorCode() +": Verifique el usuario de la base de datos.");
            } else{
                System.out.println(ex.getErrorCode() +": Verifique la concexion al servidor y datos de conexión.");
            }
        }
    }
    
    public static Conexion getInstance(){
        if(singleton == null){
            singleton = new Conexion();
        }
        return singleton;
    }
    
    public Connection getCn(){
        return cn;
    }
}
