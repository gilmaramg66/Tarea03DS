package org.example.FactoryMethod;

public abstract class Usuario {
    protected String nombre;
    protected String correo;
    protected String telefono;

    public Usuario(String nombre, String correo, String telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }
}
