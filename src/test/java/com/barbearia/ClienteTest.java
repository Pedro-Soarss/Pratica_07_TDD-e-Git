package com.barbearia;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    public void deveCriarClienteEValidarAtributos() {
        Cliente cliente = new Cliente(1, "Carlos Silva", 10, "m");
        assertEquals(1, cliente.getId());
        assertEquals("Carlos Silva", cliente.getNome());
        assertEquals(10, cliente.getDesconto());
        assertEquals("m", cliente.getGenero());
    }

    @Test
    public void deveValidarToStringDoCliente() {
        Cliente cliente = new Cliente(1, "Carlos Silva", 10, "m");
        assertEquals("Carlos Silva (1) (10%)", cliente.toString());
    }
}