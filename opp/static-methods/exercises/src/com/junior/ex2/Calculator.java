package com.junior.ex2;

public class Calculator {
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    public static int raisePower(int base, int exp) {
        int pot = 1;

        for (int i = 1; i <= exp; i++) {
            pot *= base;
        }

        return pot;
    }

    public static int factorial(int fact) {
        if (fact == 0) {
            return 1;
        }

        int result = 1;

        for (int i = fact; i > 1; i--) {
            result *= i;
        }

        return result;
    }
}
