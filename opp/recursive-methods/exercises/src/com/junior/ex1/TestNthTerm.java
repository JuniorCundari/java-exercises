package com.junior.ex1;

public class TestNthTerm {
    public static void main(String[] args) {

        for (int i = 0; i < 30; i++) {
            System.out.println((i + 1) + "° " + NthTerm.fibonacci(i));
        }
    }
}
