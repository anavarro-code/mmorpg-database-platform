package com.biblioteca.modelo;

public class Clase {

    private int idClase;
    private String nombre;
    private String descripcion;
    private int idRol;

    public Clase(int idClase, String nombre, String descripcion, int idRol) {
        this.idClase = idClase;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idRol = idRol;
    }

    public int getIdClase() { return idClase; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public int getIdRol() { return idRol; }

    public void setIdClase(int idClase) { this.idClase = idClase; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setIdRol(int idRol) { this.idRol = idRol; }

    @Override
    public String toString() {
        return "Clase: " + nombre + " | Descripcion: " + descripcion;
    }
}