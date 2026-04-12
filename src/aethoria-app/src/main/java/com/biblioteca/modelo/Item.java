package com.biblioteca.modelo;

public class Item {

    private int idItem;
    private String nombre;
    private String descripcion;
    private String rareza;
    private int idTipo;

    public Item(int idItem, String nombre, String descripcion, String rareza, int idTipo) {
        this.idItem = idItem;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.rareza = rareza;
        this.idTipo = idTipo;
    }

    public int getIdItem() { return idItem; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public String getRareza() { return rareza; }
    public int getIdTipo() { return idTipo; }

    public void setIdItem(int idItem) { this.idItem = idItem; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setRareza(String rareza) { this.rareza = rareza; }
    public void setIdTipo(int idTipo) { this.idTipo = idTipo; }

    @Override
    public String toString() {
        return "Item: " + nombre + " | Rareza: " + rareza + " | Descripcion: " + descripcion;
    }
}