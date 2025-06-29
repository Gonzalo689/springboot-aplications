package com.spring.app1.springboot_aplications.models;

public class Productos implements Cloneable{
    private long id;
    private String nombre;
    private int precio;

    
    public Productos(long id, String nombre, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    @Override
    public Object clone() {

        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return new Productos(this.id, this.nombre, this.precio);
        }
    }
    
}
