package com.junior.ex5;

public class NthTermTribonacci {
    public static int tribonacci(int num) {
        if (num <= 1) {
            return 0;
        } else if (num == 2) {
            return 1;
        }

        return tribonacci(num - 1) + tribonacci(num - 2) + tribonacci(num - 3);
    }
}