package com.junior.ex2;

public class TestCalculator {

    static void showResult(double result) {
        System.out.println(result);
    }

    public static void main(String[] args) {
        showResult(Calculator.add(1.5, 2));

        showResult(Calculator.subtract(10, 8.5));

        showResult(Calculator.multiply(4, 6.5));

        showResult(Calculator.divide(10, 2.5));

        showResult(Calculator.raisePower(5, 4));

        showResult(Calculator.factorial(5));
    }
}
