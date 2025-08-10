package org.example;

import org.example.ChainOfResponsability.DepartamentoAdministracion;
import org.example.FactoryMethod.Cliente;
import org.example.FactoryMethod.Organizador;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nombre;
    private String artista;
    private String tipoMusica;
    private List<Ubicacion> ubicaciones;
    private List<LocalDate> fechas;
    private List<Boleto> boletos;
    private List<Cliente> clientes;
    private Organizador organizador;
    private DepartamentoAdministracion administracion;

    public void setAdministracion(DepartamentoAdministracion d){
        this.administracion = d;
    }

    public void setOrganizador(Organizador organizador) {
        this.organizador = organizador;
    }

    public String getNombre(){
        return nombre;
    }

    public List<LocalDate> getFechas(){
        return fechas;
    }

    public Organizador getOrganizador(){
        return organizador;
    }

    public Evento(String nombre, String artista, String tipoMusica) {
        this.nombre = nombre;
        this.artista = artista;
        this.tipoMusica = tipoMusica;
        this.clientes = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Evento: ").append(nombre).append("\n")
                .append("Artista: ").append(artista).append("\n")
                .append("Tipo de música: ").append(tipoMusica).append("\n");

        // Lista de ubicaciones
        sb.append("Ubicaciones:\n");
        if (ubicaciones != null && !ubicaciones.isEmpty()) {
            for (Ubicacion u : ubicaciones) {
                sb.append("- ").append(u.toString()).append("\n");
            }
        } else {
            sb.append("- (No hay ubicaciones registradas)\n");
        }

        // Lista de fechas
        sb.append("Fechas disponibles:\n");
        if (fechas != null && !fechas.isEmpty()) {
            for (LocalDate f : fechas) {
                sb.append("- ").append(f.toString()).append("\n");
            }
        } else {
            sb.append("- (No hay fechas disponibles)\n");
        }
        return sb.toString();
    }

    public void setUbicaciones(List<Ubicacion> ubicaciones) {
        this.ubicaciones = ubicaciones;
    }
    public void setFechas(List<LocalDate> fechas) {
        this.fechas = fechas;
    }
    public void setBoletos(List<Boleto> boletos) {
        this.boletos = boletos;
    }

    public List<Boleto> getBoletosDisponibles() {
        List<Boleto> disponibles = new ArrayList<>();
        if (boletos != null) {
            for (Boleto b : boletos) {
                if (b.getEstado() == EstadoBoleto.DISPONIBLE) {
                    disponibles.add(b);
                }
            }
        }
        return disponibles;
    }

    public void setClientes(List<Cliente> clientes){
        this.clientes = clientes;
    }
    public List<Cliente> getClientes(){
        return clientes;
    }
}
