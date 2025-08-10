package org.example.FactoryMethod;

import org.example.Boleto;
import org.example.EstadoBoleto;
import org.example.Evento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Organizador extends Usuario {

    public Organizador(String nombre, String correo, String telefono) {
        super(nombre, correo, telefono);
    }

    public void cambioFechaEvento(Evento evento, LocalDate nuevaFecha) {
        List<Cliente> clientes = evento.getClientes();
        for (Cliente cliente : clientes) {
            cliente.recibirNotificacion("El evento '" + evento.getNombre() + "' ha cambiado su fecha a: " + nuevaFecha);
        }
        List<LocalDate> fechas = evento.getFechas();
        if (fechas != null && !fechas.isEmpty()) {
            fechas.clear();
        } else {
            fechas = new ArrayList<>();
        }
        fechas.add(nuevaFecha);
        evento.setFechas(fechas);
        hacerDevoluciones(evento);
    }


    public void cancelacionEvento(Evento evento) {
        List<Cliente> clientes = evento.getClientes();
        for (Cliente cliente : clientes) {
            cliente.recibirNotificacion("Se ha cancelado el evento");
        }
        hacerDevoluciones(evento);
    }


    public void hacerDevoluciones(Evento evento) {
        List<Cliente> clientes = evento.getClientes();
        for (Cliente cliente : clientes) {
            double totalDevolucion = 0.0;
            List<Boleto> boletosADevolver = cliente.getBoletosComprados();
            for (Boleto b : boletosADevolver) {
                totalDevolucion += b.getPrecio();
                b.setEstado(EstadoBoleto.CANCELADO);
            }
            boletosADevolver.clear();
            if (totalDevolucion > 0) {
                System.out.println("Devolviendo $" + totalDevolucion + " a cliente " + cliente.getNombre());
            } else {
                System.out.println("No hay boletos para devolver a cliente " + cliente.getNombre());
            }
        }
    }
}

