/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.example;

import java.time.LocalDate;
import java.util.List;
import org.example.ChainOfResponsability.DepartamentoAdministracion;
import org.example.FactoryMethod.Cliente;
import org.example.FactoryMethod.Organizador;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author elmay
 */
public class EventoTest {
    
    public EventoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of setAdministracion method, of class Evento.
     */
    @Test
    public void testSetAdministracion() {
        System.out.println("setAdministracion");
        DepartamentoAdministracion d = null;
        Evento instance = null;
        instance.setAdministracion(d);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrganizador method, of class Evento.
     */
    @Test
    public void testSetOrganizador() {
        System.out.println("setOrganizador");
        Organizador organizador = null;
        Evento instance = null;
        instance.setOrganizador(organizador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Evento.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Evento instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechas method, of class Evento.
     */
    @Test
    public void testGetFechas() {
        System.out.println("getFechas");
        Evento instance = null;
        List<LocalDate> expResult = null;
        List<LocalDate> result = instance.getFechas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrganizador method, of class Evento.
     */
    @Test
    public void testGetOrganizador() {
        System.out.println("getOrganizador");
        Evento instance = null;
        Organizador expResult = null;
        Organizador result = instance.getOrganizador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Evento.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Evento instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUbicaciones method, of class Evento.
     */
    @Test
    public void testSetUbicaciones() {
        System.out.println("setUbicaciones");
        List<Ubicacion> ubicaciones = null;
        Evento instance = null;
        instance.setUbicaciones(ubicaciones);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechas method, of class Evento.
     */
    @Test
    public void testSetFechas() {
        System.out.println("setFechas");
        List<LocalDate> fechas = null;
        Evento instance = null;
        instance.setFechas(fechas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBoletos method, of class Evento.
     */
    @Test
    public void testSetBoletos() {
        System.out.println("setBoletos");
        List<Boleto> boletos = null;
        Evento instance = null;
        instance.setBoletos(boletos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBoletosDisponibles method, of class Evento.
     */
    @Test
    public void testGetBoletosDisponibles() {
        System.out.println("getBoletosDisponibles");
        Evento instance = null;
        List<Boleto> expResult = null;
        List<Boleto> result = instance.getBoletosDisponibles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClientes method, of class Evento.
     */
    @Test
    public void testSetClientes() {
        System.out.println("setClientes");
        List<Cliente> clientes = null;
        Evento instance = null;
        instance.setClientes(clientes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClientes method, of class Evento.
     */
    @Test
    public void testGetClientes() {
        System.out.println("getClientes");
        Evento instance = null;
        List<Cliente> expResult = null;
        List<Cliente> result = instance.getClientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
