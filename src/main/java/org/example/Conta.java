package org.example;

import java.math.BigDecimal;

public class Conta {

    private String nome;

    private BigDecimal saldo;

    private void resgate(BigDecimal valor) {
        saldo = saldo.subtract(valor);
    }

    private void deposito(BigDecimal valor) {
        saldo = saldo.add(valor);
    }

    private BigDecimal consultarSaldo() {
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
        this.saldo = BigDecimal.valueOf(100);
    }
}
