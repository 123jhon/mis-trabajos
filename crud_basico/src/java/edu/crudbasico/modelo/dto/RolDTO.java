/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.crudbasico.modelo.dto;

import java.util.List;

/**
 *
 * @author jhone
 */
public class RolDTO {
    private int id;
    private String nombre;
    private String Descripcion;
    private List<PermisoDTO> permisos;

    public RolDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public List<PermisoDTO> getPermisos() {
        return permisos;
    }

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
        return "RolDTO{" + "id=" + id + ", nombre=" + nombre + ", Descripcion=" + Descripcion + '}';
    }
    
}
