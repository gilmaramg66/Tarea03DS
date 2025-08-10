package org.example;

public class Ubicacion {
    private String direccion;
    private String ciudad;
    private String pais;
    private double latitud;
    private double longitud;

    public Ubicacion(String direccion, String ciudad, String pais, double latitud, double longitud) {
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    // Getters y Setters
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
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

    @Override
    public String toString() {
        return direccion + ", " + ciudad + ", " + pais +
                " (Lat: " + latitud + ", Lon: " + longitud + ")";
    }
}
