package com.junior.ex1;

public class TestBankAccount {
    public static void main(String[] args) {

        System.out.println("------ Teste Conta Bancária ------");

        BankAccount bankAccount = new BankAccount();
        bankAccount.setClientName("Fulano");
        bankAccount.setAccountNumber("ABC1234");

        bankAccount.deposit(800);

        makeWithdraw(bankAccount, 800);
        makeWithdraw(bankAccount, 50);

        System.out.println(bankAccount);

        System.out.println("------ Teste Conta Poupança ------");

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setClientName("Fulano");
        savingsAccount.setAccountNumber("ABC1234");
        savingsAccount.setIncomeDay(19);

        savingsAccount.deposit(100);

        makeWithdraw(savingsAccount, 50);
        makeWithdraw(savingsAccount, 70);

        if (savingsAccount.calculateNewBalance(0.5)) {
            System.out.println("Rendimento aplicado, novo saldo é de: " + savingsAccount.getBalance());
        } else {
            System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
        }

        System.out.println(savingsAccount);

        System.out.println("------ Teste Conta Especial ------");

        SpecialAccount specialAccount = new SpecialAccount();
        specialAccount.setClientName("Fulano");
        specialAccount.setAccountNumber("ABC1234");
        specialAccount.setLimit(50);

        specialAccount.deposit(100);

        makeWithdraw(specialAccount, 50);
        makeWithdraw(specialAccount, 70);
        makeWithdraw(specialAccount, 80);

        System.out.println(specialAccount);

    }

    public static void makeWithdraw(BankAccount bankAccount, double withdrawalAmount) {
        boolean validWithdraw = bankAccount.withdraw(withdrawalAmount);

        if (validWithdraw) {
            System.out.println("Saque efetuado com sucesso!");
            System.out.println("Valor do saque: " + withdrawalAmount);
            System.out.println("Saldo: " + bankAccount.getBalance());
        } else {
            System.out.println("Saldo insuficiente!");
            System.out.println("Valor do saque: " + withdrawalAmount);
            System.out.println("Saldo: " + bankAccount.getBalance());
        }
    }
}