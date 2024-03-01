package com.junior.ex1;

public class NthTerm {
    public static int fibonacci(int num) {
        if (num == 0 || num == 1) {
            return num;
        }

        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}