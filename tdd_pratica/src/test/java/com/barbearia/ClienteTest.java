package com.barbearia;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Testes unitarios da classe Cliente.
 */
public class ClienteTest {
    private static final int DESCONTO_PADRAO = 10;


    /**
 * Verifica se o cliente e criado com os atributos corretos.
 */
    @Test
    public void deveCriarClienteEValidarAtributos() {
        Cliente cliente = new Cliente(1, "Carlos Silva", DESCONTO_PADRAO, "m");
        
        assertEquals(1, cliente.getId());
        assertEquals("Carlos Silva", cliente.getNome());
        assertEquals(DESCONTO_PADRAO, cliente.getDesconto());
        assertEquals("m", cliente.getGenero());
    }

 /**
 * Verifica a representacao textual do cliente.
 */
    @Test
    public void deveValidarToStringDoCliente() {
        Cliente cliente = new Cliente(1, "Carlos Silva", DESCONTO_PADRAO, "m");
        assertEquals("Carlos Silva (1) (10%)", cliente.toString());
    }
}