package com.junior.ex1;

public class BankAccount {
    private String clientName;
    private String accountNumber;
    private double balance;

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "clientName='" + clientName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    public boolean withdraw(double withdrawalAmount) {
        if (balance >= withdrawalAmount) {
            balance -= withdrawalAmount;
            return true;
        }

        return false;
    }

    public void deposit(double depositAmount) {
        balance += depositAmount;
    }
}
