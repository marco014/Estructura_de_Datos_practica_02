package com.upchiapas.practica02;


public class Producto {
    String nombre;
    float precio;
    int existencia;

    public Producto(String nombreA, float precioA, int existenciaA){
        this.nombre = nombreA;
        this.precio = precioA;
        this.existencia = existenciaA;
    }
    public String getNombre(){
        return nombre;
    }
    public float getPrecio() {
        return precio;
    }
    public float getExistencia(){
        return existencia;
    }
}
