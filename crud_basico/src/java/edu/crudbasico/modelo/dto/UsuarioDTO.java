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
public class UsuarioDTO {
    private int id;
    private long documento;
    private String primerNombre;
    private String segundoNombre;
    private String prinmerApellido;
    private String segundoApellido;
    private String clave;
    private List<PermisoDTO> permisos;

    

    public UsuarioDTO() {
    this.permisos = new ArrayList<>();
    }

    public UsuarioDTO(long documento, String primerNombre, String segundoNombre, String prinmerApellido, String segundoApellido, String clave) {
        this.documento = documento;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.prinmerApellido = prinmerApellido;
        this.segundoApellido = segundoApellido;
        this.clave = clave;
    }

    public UsuarioDTO(int id, long documento, String primerNombre, String segundoNombre, String prinmerApellido, String segundoApellido, String clave, List<PermisoDTO> permisos) {
        this.id = id;
        this.documento = documento;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.prinmerApellido = prinmerApellido;
        this.segundoApellido = segundoApellido;
        this.clave = clave;
        this.permisos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrinmerApellido() {
        return prinmerApellido;
    }

    public void setPrinmerApellido(String prinmerApellido) {
        this.prinmerApellido = prinmerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.id;
        hash = 83 * hash + (int) (this.documento ^ (this.documento >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UsuarioDTO other = (UsuarioDTO) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.documento != other.documento) {
            return false;
        }
        return true;
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
    
}
