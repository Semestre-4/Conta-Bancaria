package org.example;

import java.math.BigDecimal;

public class Conta {

    private String nome;
    private BigDecimal saldo;

    private BigDecimal saldoInvestido;

    public Conta() {
        this.saldo = BigDecimal.valueOf(100); // Instanciar com 100 unidades
    }

    public void resgate(BigDecimal valor) {
        saldo = saldo.subtract(valor);
        System.out.println(saldo);
    }

    public void deposito(BigDecimal valor) {
        saldo = saldo.add(valor);
    }

    public BigDecimal consultarSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getSaldoInvestido() {
        return saldoInvestido;
    }

    public void setSaldoInvestido(BigDecimal saldoInvestido) {
        this.saldoInvestido = saldoInvestido;
    }
}
