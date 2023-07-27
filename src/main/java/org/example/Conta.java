package org.example;

import java.math.BigDecimal;

public class Conta {

    private String nome;
    private BigDecimal saldo;

    public Conta(String nome) {
        this.nome = nome;
        this.saldo = BigDecimal.valueOf(100); // Instanciar com 100 unidades
    }

    public void resgate(BigDecimal valor) {
        saldo = saldo.subtract(valor);
    }

    public void deposito(BigDecimal valor) {
        saldo = saldo.add(valor);
    }

    public BigDecimal consultarSaldo() {
        return saldo;
    }
}
