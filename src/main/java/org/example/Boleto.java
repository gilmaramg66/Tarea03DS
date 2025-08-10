package org.example;


public class Boleto {
    private String id;
    private TipoBoleto tipo; // General, VIP, Asiento reservado
    private double precio;
    private EstadoBoleto estado;

    public Boleto(String id, TipoBoleto tipo, double precio) {
        this.tipo = tipo;
        this.precio = precio;
        this.estado = EstadoBoleto.DISPONIBLE;
    }

    public EstadoBoleto getEstado(){
        return estado;
    }
    public TipoBoleto getTipo(){
        return tipo;
    }
    public void setEstado(EstadoBoleto estadoBoleto) {
        this.estado = estadoBoleto;
    }
    public double getPrecio(){
        return precio;
    }

}
