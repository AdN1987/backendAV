
package com.AdNVilla.AdNVilla.Dto;

import javax.validation.constraints.NotBlank;


public class dtoProyecto {
    
    @NotBlank
    private String nombre;
    @NotBlank    
    private int fecha;
    @NotBlank
    private String descripcion;
    @NotBlank
    private String page;

    public dtoProyecto() {
    }

    public dtoProyecto(String nombre, int fecha, String descripcion, String page) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.page = page;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
    
    
    
}
