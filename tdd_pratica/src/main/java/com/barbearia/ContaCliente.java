
package com.barbearia;

/**
 * Representa a conta de um cliente da barbearia.
 */
public class ContaCliente {

    private int id;
    private Cliente cliente;
    private double saldo;

    /**
     * Cria uma conta com saldo inicial.
     *
     * @param id identificador da conta
     * @param cliente cliente associado
     * @param saldo saldo inicial
     */
    public ContaCliente(int id, Cliente cliente, double saldo) {
        this.id = id;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }
}
