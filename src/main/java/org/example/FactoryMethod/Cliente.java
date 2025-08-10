package org.example.FactoryMethod;

import org.example.*;
import org.example.Observer.CanalNotificacion;
import org.example.Strategy.MetodoPago;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario {
    private List<Boleto> boletosReservados;
    private MetodoPago metodoPago;
    private List<CanalNotificacion> canales;
    private List<Boleto> boletosComprados;
    private List<Incidente> incidentes;

    public Cliente(String nombre, String correo, String telefono) {
        super(nombre, correo, telefono);
        this.boletosReservados = new ArrayList<>();
        this.boletosComprados = new ArrayList<>();
        this.incidentes = new ArrayList<>();
    }

    public List<Incidente> getIncidentes(){
        return incidentes;
    }

    public void setIncidentes(List<Incidente> incidentes){
        this.incidentes = incidentes;
    }

    public List<Boleto> getBoletosComprados(){
        return boletosComprados;
    }

    public Evento buscarEventos(String criterio, List<Evento> todosLosEventos) {
        String criterioLower = criterio.toLowerCase();
        for (Evento evento : todosLosEventos) {
            if (evento.toString().toLowerCase().contains(criterioLower)) {
                return evento;
            }
        }
        return null;
    }


    public boolean reservarBoleto(Evento evento, int cantidad, TipoBoleto tipo) {
        List<Boleto> disponibles = new ArrayList<>();

        // Buscar boletos disponibles del tipo solicitado
        for (Boleto b : evento.getBoletosDisponibles()) {
            if (b.getTipo() == tipo && b.getEstado() == EstadoBoleto.DISPONIBLE) {
                disponibles.add(b);
                if (disponibles.size() == cantidad) {
                    break;
                }
            }
        }

        if (disponibles.size() < cantidad) {
            // No hay suficientes boletos disponibles
            return false;
        }

        // Reservar los boletos
        for (Boleto b : disponibles) {
            b.setEstado(EstadoBoleto.RESERVADO);
            boletosReservados.add(b);
        }
        return true;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void realizarPago(double monto) {
        metodoPago.pagar(monto);
    }

    public boolean pagar() {
        if (boletosReservados == null || boletosReservados.isEmpty()) {
            System.out.println("No hay boletos reservados para pagar.");
            return false;
        }
        if (metodoPago == null) {
            System.out.println("No se ha seleccionado un método de pago.");
            return false;
        }
        double total = 0.0;
        for (Boleto b : boletosReservados) {
            total += b.getPrecio();
        }
        realizarPago(total);
        for (Boleto b : boletosReservados) {
            b.setEstado(EstadoBoleto.VENDIDO);
            boletosComprados.add(b);
        }
        boletosReservados.clear();
        return true;
    }

    public List<Boleto> getBoletosReservados(){
        return boletosReservados;
    }

    public String getNombre(){
        return nombre;
    }

    public void recibirNotificacion(String mensaje) {
        for (CanalNotificacion cn : canales){
            cn.enviar(nombre, mensaje);
        }
    }

    public void setCanales(List<CanalNotificacion> canales){
        this.canales = canales;
    }
}