package org.example;

import java.math.BigDecimal;

public class Conta {
    private String nomeCompleto;
    private BigDecimal saldo;
    private BigDecimal saldoInvestimento;

    public Conta(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
        this.saldo = new BigDecimal("100.0"); // Saldo inicial com 100 unidades
        this.saldoInvestimento = BigDecimal.ZERO; // Saldo de investimento inicialmente 0
    }

    // Método para resgatar um valor da conta
    public void resgate(BigDecimal valor) {
        if (valor.compareTo(saldo) <= 0) {
            saldo = saldo.subtract(valor);
            System.out.println("Resgate de " + valor + " unidades realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para o resgate.");
        }
    }

    // Método para realizar um depósito na conta
    public void deposito(BigDecimal valor) {
        saldo = saldo.add(valor);
        System.out.println("Depósito de " + valor + " unidades realizado com sucesso.");
    }

    // Método para visualizar os dados da conta e saldo
    public void visualizarDadosConta() {
        System.out.println("Nome completo: " + nomeCompleto);
        System.out.println("Saldo disponível: " + saldo + " unidades");
        System.out.println("Saldo de investimento: " + saldoInvestimento + " unidades");
    }

    // Método para realizar um investimento
    public void investimento(BigDecimal valor) {
        if (valor.compareTo(saldo) <= 0) {
            saldo = saldo.subtract(valor);
            saldoInvestimento = saldoInvestimento.add(valor);
            System.out.println("Investimento de " + valor + " unidades realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para o investimento.");
        }
    }

    // Método para calcular o lucro do investimento
    private BigDecimal calcularLucroInvestimentoCiclo() {
        return saldoInvestimento.multiply(BigDecimal.valueOf(0.05)) ; // 5% de lucro no valor investido
    }

}
