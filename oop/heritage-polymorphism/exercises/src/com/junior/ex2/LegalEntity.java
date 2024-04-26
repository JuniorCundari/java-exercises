package com.junior.ex2;

public class LegalEntity extends Taxpayer {
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calculateTax(int tax) {
        return this.getGrossIncome() * ((double) tax / 100);
    }

    @Override
    public String toString() {
        return "LegalEntity{" +
                super.toString() + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", taxPay=" + calculateTax(getTax()) +
                '}';
    }
}
