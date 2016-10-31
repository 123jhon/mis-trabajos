/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.crudbasico.modelo.persistencia.DAO;

import edu.crudbasico.modelo.dto.UsuarioDTO;

/**
 *
 * @author jhone
 */
public abstract class usuarioDAO implements DAO<Integer, UsuarioDTO>{
    public abstract UsuarioDTO login(long documento,String clave);
}
