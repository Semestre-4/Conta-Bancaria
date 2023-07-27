package org.example;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new  Conta();
        BigDecimal valor;
        BigDecimal saldo = conta.getSaldo();

        System.out.println("Digite o nome completo\n");
        String nome = scanner.nextLine();

        conta.setNome(nome);

        System.out.println("Digite qual operação você deseja realiza.\n");
        System.out.println("1 - Resgate\n");
        System.out.println("2 - Deposito\n");
        System.out.println("3 - Visualizar Dados\n");
        System.out.println("4 - Investimentos\n");
        int escolha = scanner.nextInt();

        switch (escolha) {

            case 1:
                System.out.println("Digite o valor do resgate:\n");
                valor = scanner.nextBigDecimal();
                conta.resgate(valor);
                break;
            case 2:
                System.out.println("Digite o valor do deposito:\n");
                valor = scanner.nextBigDecimal();
                conta.deposito(valor);
                break;
            case 3:
                System.out.println("Nome: " + nome + "\n");
                System.out.println("Saldo: " + saldo + "\n");

            case 4:
                System.out.println("Digite o valor do investimento:\n");
                BigDecimal investimento = scanner.nextBigDecimal();

                if (saldo.compareTo(investimento) < 0){
                    System.out.println("Você não possui saldo suficiente:\n");
                    break;
                }else{


                }

        }

    }
}