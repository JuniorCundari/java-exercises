package com.junior.ex4;

public class TestAreaUnitsConversion {
    public static void main(String[] args) {
        showResult(AreaUnitsConversion.squareMeterToSquareFeet(10));

        showResult(AreaUnitsConversion.squareFeetToSquareCentimeters(10));

        showResult(AreaUnitsConversion.squareMileToAcre(10));

        showResult(AreaUnitsConversion.acreToSquareFeet(10));
    }

    static void showResult(double show) {
        System.out.println(show);
    }
}
