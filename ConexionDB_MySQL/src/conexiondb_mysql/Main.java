/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiondb_mysql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;
/**
 *
 * @author Ismael
 */
public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion conexion = Conexion.getInstance();
        System.out.println("Conexión exitosa!!");
        Scanner lectura=new Scanner(System.in);
        System.out.print("ingrese un ID-> ");
        
        
        String sql = "Select * from usuarios where id=?";
        try {
            PreparedStatement ps = conexion.getCn().prepareStatement(sql);
           
            ps.setInt(1, 1);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("ID="+rs.getInt("id")+rs.getString("primer_nombre"));
            }
            } catch (SQLException ex) {
            System.out.println("mierda-> " + ex.getMessage());
        }
    }

}
