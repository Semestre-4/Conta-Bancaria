package org.example;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome completo\n");
        String nome = scanner.nextLine();

        Conta conta = new Conta(nome);

        int escolha;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Realizar resgate\n");
            System.out.println("2. Realizar depósito\n");
            System.out.println("3. Visualizar dados da conta e saldo\n");
            System.out.println("4. Realizar investimento\n");
            System.out.println("5. Finalizar ciclo de investimento e receber lucro");
            System.out.println("0. Sair");
            System.out.println("Digite qual operação você deseja realiza.\n");
            escolha = scanner.nextInt();

            switch (escolha) {

                case 1:
                    System.out.print("Digite o valor do resgate: ");
                    BigDecimal resgate = scanner.nextBigDecimal();
                    conta.resgate(resgate);
                    break;
                case 2:
                    System.out.print("Digite o valor do depósito: ");
                    BigDecimal deposito = scanner.nextBigDecimal();
                    conta.deposito(deposito);
                    break;
                case 3:
                    conta.visualizarDadosConta();
                    break;
                case 4:
                    System.out.print("Digite o valor do investimento: ");
                    BigDecimal investimento = scanner.nextBigDecimal();
                    conta.investimento(investimento);
                    break;
                case 5:
                    BigDecimal lucroCiclo = conta.calcularLucroInvestimentoCiclo();
                    conta.finalizarCicloInvestimento();
                    System.out.println("Lucro do ciclo atual: " + lucroCiclo + " unidades");
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;

            }

        } while (escolha != 0);
        scanner.close();
        ;
    }
}