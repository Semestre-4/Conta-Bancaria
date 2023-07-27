package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new  Conta();

        System.out.println("Digite o nome completo\n");
        String nome = scanner.nextLine();

        System.out.println("Digite qual operação você deseja realiza.\n");
        System.out.println("1 - Resgate\n");
        System.out.println("2 - Deposito\n");
        System.out.println("3 - Visualizar Dados\n");
        int escolha = scanner.nextInt();

        switch (escolha){

            case 1:


        }

    }
}