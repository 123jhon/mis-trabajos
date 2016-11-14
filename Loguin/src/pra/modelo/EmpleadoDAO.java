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
public class EmpleadoDAO {

    Conexion conexion;

    public EmpleadoDAO() {
        conexion = new Conexion();
    }

    public Empleado verificarpreparedstatement(String log_dni, String log_pass, String log_privilegios) {
        Empleado empleado = null;
        Connection accesoBD = conexion.getConexion();
        try {
            //? sirve para prevenir inyeccion de sql
            PreparedStatement ps = accesoBD.prepareStatement("select * from dao_empleado a where a.log_dni=? and a.log_contrasena=? and a.log_privilegio=? ");
            ps.setString(1, log_dni);
            ps.setString(2, log_pass);
            ps.setString(3, log_privilegios);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                empleado = new Empleado();
                empleado.setLog_dni(rs.getString(1));
                empleado.setLog_pass(rs.getString(2));
                empleado.setLog_Privilegios(rs.getString(7));
                empleado.setLog_primerApellido(rs.getString(3));
                empleado.setLog_segApellido(rs.getString(4));
                empleado.setLog_priNombre(rs.getString(5));
                empleado.setLog_segNombre(rs.getString(6));
                return empleado;
            }
        } catch (Exception e) {
        }
        return empleado;
    }
}
