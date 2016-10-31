/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.crudbasico.modelo.dto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jhone
 */
public class PermisoDTO {

    private int id;
    private String nombre;
    private String url;
    private List<PermisoDTO> permisos;

    /**
     *
     */
    public PermisoDTO() {
    }

    /**
     *
     * @param id
     * @param nombre
     * @param url
     * @param permisos
     */
    public PermisoDTO(int id, String nombre, String url, List<PermisoDTO> permisos) {
        this.id = id;
        this.nombre = nombre;
        this.url = url;
        this.permisos = new ArrayList<>();
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     */
    public List<PermisoDTO> getPermisos() {
        return permisos;
    }

    /**
     *
     * @param permisos
     */
    public void setPermisos(List<PermisoDTO> permisos) {
        this.permisos = permisos;
    }
public void addPermiso(PermisoDTO p){
    this.permisos.add(p);
}
public void removPermiso(int idPermiso){
    for (int i = 0; i < permisos.size(); i++) {
        if (permisos.get(i).getId()==id) {
            permisos.remove(i);
        }
 
        
    }
}
    @Override
    public String toString() {
        return "PermisoDTO{" + "id=" + id + ", nombre=" + nombre + ", url=" + url + ", permisos=" + permisos + '}';
    }

}
