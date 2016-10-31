/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.crudbasico.modelo.persistencia.DAO;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author jhone
 */
public interface DAO<PK,E> {

    public E buscarPorPK(int pk);

    public List<E> buscarPorTodos();

    public int contar();

    public void registrar(E o) throws SQLException;

    public boolean actulizar(E o);

    public boolean eliminar(int PK);
    

}
