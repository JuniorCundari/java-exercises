package com.junior.ex1;

public class SpecialAccount extends BankAccount {
    private double limit;

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "SpecialAccount{" +
                "limit=" + limit +
                '}';
    }

    public boolean withdraw(double amountWithdraw) {
        double balanceLimit = this.getBalance() + limit;

        if (balanceLimit >= amountWithdraw) {
            this.setBalance(this.getBalance() - amountWithdraw);
            return true;
        }

        return false;
    }
}
