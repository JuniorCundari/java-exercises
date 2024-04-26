package com.junior.ex2;

public abstract class Taxpayer {
    private String name;
    private double grossIncome;
    private int tax;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossIncome() {
        return grossIncome;
    }

    public void setGrossIncome(double grossIncome) {
        this.grossIncome = grossIncome;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Taxpayer{" +
                "name='" + name + '\'' +
                ", grossIncome=" + grossIncome +
                '}';
    }

    public abstract double calculateTax(int tax);
}
