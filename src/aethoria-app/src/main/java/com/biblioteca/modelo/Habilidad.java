package com.biblioteca.modelo;

public class Habilidad {

    private int idHabilidad;
    private String nombre;
    private String descripcion;
    private int daño;
    private int idClase;

    public Habilidad(int idHabilidad, String nombre, String descripcion, int daño, int idClase) {
        this.idHabilidad = idHabilidad;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.daño = daño;
        this.idClase = idClase;
    }

    public int getIdHabilidad() { return idHabilidad; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public int getDaño() { return daño; }
    public int getIdClase() { return idClase; }

    public void setIdHabilidad(int idHabilidad) { this.idHabilidad = idHabilidad; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setDaño(int daño) { this.daño = daño; }
    public void setIdClase(int idClase) { this.idClase = idClase; }

    @Override
    public String toString() {
        return "Habilidad: " + nombre + " | Daño: " + daño + " | Clase: " + idClase;
    }
}