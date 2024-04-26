package com.junior.ex2;

import java.util.Arrays;

public class TestIncomeTax {
    public static void main(String[] args) {

        System.out.println("------ Teste Pessoa Jurídica ------");

        LegalEntity legalEntity = new LegalEntity();
        legalEntity.setName("Amanda");
        legalEntity.setCnpj("53.591.607/0001-50");
        legalEntity.setGrossIncome(5000);
        legalEntity.setTax(10);

        LegalEntity legalEntity1 = new LegalEntity();
        legalEntity1.setName("Rafael");
        legalEntity1.setCnpj("32.045.376/0001-09");
        legalEntity1.setGrossIncome(10587);
        legalEntity1.setTax(10);

        PhysicalPerson physicalPerson = new PhysicalPerson();
        physicalPerson.setName("Pedro");
        physicalPerson.setCpf("905.137.410-03");
        physicalPerson.setGrossIncome(1300);
        physicalPerson.setTax(0);

        PhysicalPerson physicalPerson1 = new PhysicalPerson();
        physicalPerson1.setName("Leandro");
        physicalPerson1.setCpf("657.248.257-75");
        physicalPerson1.setGrossIncome(3287.98);
        physicalPerson1.setTax(25);

        Taxpayer[] taxpayers = new Taxpayer[4];
        taxpayers[0] = legalEntity;
        taxpayers[1] = legalEntity1;
        taxpayers[2] = physicalPerson;
        taxpayers[3] = physicalPerson1;

        for (Taxpayer c : taxpayers) {
            System.out.println(c.toString());
        }
    }
}
