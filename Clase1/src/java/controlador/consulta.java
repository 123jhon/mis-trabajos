/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author jhone
 */
public class consulta  {
    
    Conexion conexion ;
    
    public boolean autenticacion(String usuario , String password){
    
    
     PreparedStatement ejemplo=null; 
     ResultSet rs=null;
      try { 
          
          String consulta = "select * from usuario where=?";
          
           ejemplo=conexion.getCn().prepareStatement(consulta);
           
           ejemplo.setString(1, usuario);
           ejemplo.setString(2, contraseña);
           rs = ejemplo.executeQuery();
           
           
                  
           
          
    } catch(Exeption e ){}
            finally {
          try {
              
              if (getConection ! =null ) getCn ().close();
              
          } catch (Exception e) {
          }
                    
                    
                    }}
           
}
