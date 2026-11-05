
package com.barbearia;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Testes unitarios da classe ContaCliente.
 */
public class ContaClienteTest {

    @Test
    public void deveCriarContaComSaldoInicial() {
        Cliente cliente = new Cliente(1, "Carlos Silva", 10, "m");
        ContaCliente conta = new ContaCliente(1, cliente, 100.0);

        assertEquals(1, conta.getId());
        assertEquals(cliente, conta.getCliente());
        assertEquals(100.0, conta.getSaldo(), 0.001);
    }
    
    
    /**
     * Verifica se o deposito atualiza e retorna o saldo.
     */
    @Test
    public void deveAdicionarDepositoAoSaldo() {
        Cliente cliente = new Cliente(1, "Carlos Silva", 10, "m");
        ContaCliente conta = new ContaCliente(1, cliente, 100.0);

        double novoSaldo = conta.addDeposito(50.0);

        assertEquals(150.0, novoSaldo, 0.001);
        assertEquals(150.0, conta.getSaldo(), 0.001);
    }

}
