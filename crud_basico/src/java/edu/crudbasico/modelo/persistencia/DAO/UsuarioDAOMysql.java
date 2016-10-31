/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.crudbasico.modelo.persistencia.DAO;

import edu.crudbasico.modelo.dto.UsuarioDTO;
import edu.crudbasico.modelo.persistencia.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jhone
 */
public class UsuarioDAOMysql extends usuarioDAO{

    @Override
    public UsuarioDTO login(long documento, String clave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UsuarioDTO buscarPorPK(int pk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UsuarioDTO> buscarPorTodos() {
    Conexion conexion=Conexion.getInstance();
        String sql = "Select * from usuarios where id=?";
        List<UsuarioDTO> usuarios=new ArrayList<>();
        try {
            PreparedStatement ps = conexion.getCn().prepareStatement(sql);
           
            ps.setInt(1, 1);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
//                UsuarioDTO u=new UsuarioDTO(rs.getInt("id"));
                System.out.println("ID="+rs.getInt("id")+rs.getString("primer_nombre"));
            }
            } catch (SQLException ex) {
            System.out.println("mierda-> " + ex.getMessage());
        }
        return usuarios;
    }

    @Override
    public int contar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void registrar(UsuarioDTO o) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actulizar(UsuarioDTO o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(int PK) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
