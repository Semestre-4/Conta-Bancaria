package org.example;

import java.math.BigDecimal;

public class Conta {

    private String nome;

    private BigDecimal saldo;

    private void resgate() {

    }

    private void deposito(){

    }

    private void consultarSaldo(){

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
