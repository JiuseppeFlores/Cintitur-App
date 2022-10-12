package com.stisbolivia.cintiturapp.models;

public class Dormir {
    private String titulo;
    private String servicios;
    private String direccion;
    private String telefono;
    private String celular;
    private double latitud;
    private double longitud;
    private String correo;

    public Dormir(String titulo, String servicios, String direccion, String telefono, String celular, double latitud, double longitud, String correo) {
        this.titulo = titulo;
        this.servicios = servicios;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
        this.latitud = latitud;
        this.longitud = longitud;
        this.correo = correo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
