package com.junior.ex4;

public class AreaUnitsConversion {
    public static double squareMeterToSquareFeet(int squareMeter) {
        double squareFeet = 10.764;

        return squareMeter * squareFeet;
    }

    public static double squareFeetToSquareCentimeters(int squareFeet) {
        int squareCentimeters = 929;

        return squareFeet * squareCentimeters;
    }

    public static int squareMileToAcre(int squareMile) {
        int acre = 640;

        return squareMile * acre;
    }

    public static int acreToSquareFeet(int acre) {
        int squareFeet = 43560;

        return acre * squareFeet;
    }
}
