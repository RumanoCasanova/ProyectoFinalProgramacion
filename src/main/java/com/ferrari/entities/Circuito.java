package com.ferrari.entities;

public class Circuito {
    private  String nombre;
    private Float longitud;
    private String ubicacion;
    private String vehiculo;

    public Circuito(String nombre, Float longitud, String ubicacion, String vehiculo) {
        this.nombre = nombre;
        this.longitud = longitud;
        this.ubicacion = ubicacion;
        this.vehiculo = vehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getLongitud() {
        return longitud;
    }

    public void setLongitud(Float longitud) {
        this.longitud = longitud;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Circuito{" +
                "nombre='" + nombre + '\'' +
                ", longitud=" + longitud +
                ", ubicacion='" + ubicacion + '\'' +
                ", vehiculo='" + vehiculo + '\'' +
                '}';
    }
}
