
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

    
    /**
     * Adiciona um deposito e retorna o novo saldo.
     *
     * @param valor valor a depositar
     * @return saldo atualizado
     */
    public double addDeposito(double valor) {
        this.saldo += valor;
        return this.saldo;
    }

/**
 * Realiza uma retirada do saldo, quando possível.
 *
 * @param valor valor a retirar
 * @return saldo atualizado
 */
public double subSaldo(double valor) {
    if (valor > 0 && valor <= saldo) {
        saldo -= valor;
    }
    return saldo;
}
/**
 * Cria uma conta informando apenas o ID.
 *
 * @param id identificador da conta
 */
public ContaCliente(int id) {
    this.id = id;
    this.cliente = null;
    this.saldo = 0.0;
}
/**
 * Cria uma conta com ID e cliente, iniciando
 * o saldo em zero.
 *
 * @param id identificador da conta
 * @param cliente cliente associado
 */
public ContaCliente(int id, Cliente cliente) {
    this.id = id;
    this.cliente = cliente;
    this.saldo = 0.0;
}
/**
 * Altera o cliente associado a conta.
 *
 * @param cliente novo cliente associado
 */
public void setCliente(Cliente cliente) {
    this.cliente = cliente;
}
}
