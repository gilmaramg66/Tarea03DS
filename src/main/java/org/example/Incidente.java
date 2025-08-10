package org.example;

public class Incidente {
    private String descripcion;
    private boolean resuelto;

    public Incidente(String descripcion) {
        this.descripcion = descripcion;
        this.resuelto = false;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean estaResuelto() {
        return resuelto;
    }

    public void resolver() {
        this.resuelto = true;
    }
}

