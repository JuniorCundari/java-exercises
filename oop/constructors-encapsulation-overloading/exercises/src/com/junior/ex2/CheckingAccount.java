package com.junior.ex2;

public class CheckingAccount {
    private String number;
    private String agency;
    private double balance;
    private boolean special;
    private double limitValue;
    private double currentLimitValue;

    public CheckingAccount() {}

    public CheckingAccount(String number, String agency, double balance, boolean special, double limitValue, double currentLimitValue) {
        this.number = number;
        this.agency = agency;
        this.balance = balance;
        this.special = special;
        this.limitValue = limitValue;
        this.currentLimitValue = currentLimitValue;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCurrentLimitValue() {
        return currentLimitValue;
    }

    public void setCurrentLimitValue(double currentLimitValue) {
        this.currentLimitValue = currentLimitValue;
    }

    public double getLimitValue() {
        return limitValue;
    }

    public double setLimitValue(double limitValue) {
        this.limitValue = limitValue;
        return limitValue;
    }

    public boolean isSpecial() {
        return special;
    }

    public void setSpecial(boolean special) {
        this.special = special;
    }

    private void debit(double debitAmount) {
        balance -= debitAmount;
    }

    public boolean withdraw(double withdrawalAmount) {
        if (balance >= withdrawalAmount) {
            debit(withdrawalAmount);
            return true;
        } else {
            if (special) {
                double limit = currentLimitValue + balance;
                if (limit >= withdrawalAmount) {
                    debit(withdrawalAmount);
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    public void deposit(double depositAmount) {
        balance += depositAmount;
    }

    public void checkBalance() {
        System.out.println("Saldo: " + balance);

        overdraft();
        System.out.println("Limite: " + currentLimitValue);
    }

    private void overdraft() {
        if (balance < 0) {
            System.out.println("Você está usando o cheque especial!");
        }
    }
}
