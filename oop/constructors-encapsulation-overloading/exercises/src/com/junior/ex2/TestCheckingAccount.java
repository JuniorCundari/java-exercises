package com.junior.ex2;

import java.util.Scanner;

public class TestCheckingAccount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CheckingAccount account = new CheckingAccount();
        account.setNumber("0012345");
        account.setAgency("7894");
        account.setSpecial(true);
        account.setCurrentLimitValue(account.setLimitValue(1000));
        account.setBalance(100);

        int next;

        do {
            System.out.println("--------------------------");
            System.out.println("Menu de opções:");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Consultar saldo");

            System.out.print("Escolha a opção: ");
            int option = scan.nextInt();

            if (option < 0 || option > 3) {
                System.out.println("---------------");
                System.out.println("Opção inválida!");
                System.out.println("---------------");

                System.out.print("Escolha a opção: ");
                option = scan.nextInt();
            }

            System.out.println("--------------------------------------");

            if (option == 1) {
                System.out.print("Qual valor deseja sacar? ");
                double amountWithdraw = scan.nextInt();

                boolean makeWithdrawal = account.withdraw(amountWithdraw);

                if (makeWithdrawal) {
                    System.out.println("Saque efetuado com sucesso!");
                    account.checkBalance();
                } else {
                    System.out.println("Não foi possível realizar o saque!");
                    System.out.println("Saldo insuficiente.");
                }
            } else if (option == 2) {
                System.out.print("Qual valor deseja depositar? ");
                double depositAmount = scan.nextInt();

                account.deposit(depositAmount);
                account.checkBalance();
            } else if (option == 3) {
                account.checkBalance();
            }

            System.out.println("--------------------------------------");
            System.out.print("Deseja continuar? (0 - Não | 1 - Sim): ");
            next = scan.nextInt();

            while (next < 0 || next > 1) {
                System.out.println("---------------");
                System.out.println("Opção inválida!");
                System.out.println("---------------");

                System.out.print("Deseja continuar? (0 - Não | 1 - Sim) ");
                next = scan.nextInt();
            }
        } while (next == 1);
    }
}
