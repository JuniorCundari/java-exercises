package com.junior.ex1;

import java.util.Calendar;

public class SavingsAccount extends BankAccount {
    private double incomeDay;

    public double getIncomeDay() {
        return incomeDay;
    }

    public void setIncomeDay(double incomeDay) {
        this.incomeDay = incomeDay;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "incomeDay=" + incomeDay +
                "| " + super.toString() +
                '}';
    }

    public boolean calculateNewBalance(double yieldRate) {
        Calendar today = Calendar.getInstance();

        if (incomeDay == today.get(Calendar.DAY_OF_MONTH)) {
            this.setBalance(this.getBalance() + (this.getBalance() * yieldRate));
            return true;
        }
        
        return false;
    }
}
