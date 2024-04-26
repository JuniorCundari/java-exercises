package com.junior.ex2;

public class PhysicalPerson extends Taxpayer {
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public double calculateTax(int tax) {
        double income = this.getGrossIncome();

        if (income <= 1400) {
            return 0;
        } else if (income >= 1400.01 && income <= 2100) {
            return income * ((double) tax / 100) - 100;
        } else if (income >= 2100.01 && income <= 2800) {
            return income * ((double) tax / 100) - 270;
        } else if (income >= 2800.01 && income <= 3600) {
            return income * ((double) tax / 100) - 500;
        }

        return income * ((double) tax / 100) - 700;
    }

    @Override
    public String toString() {
        return "PhysicalPerson{" +
                super.toString() + '\'' +
                ", cpf='" + cpf + '\'' +
                ", taxPay=" + calculateTax(getTax())  +
                '}';
    }
}
