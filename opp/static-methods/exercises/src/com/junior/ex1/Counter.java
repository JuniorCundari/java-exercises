package com.junior.ex1;

public class Counter {
    private static int counter;

    public Counter() {
        counter++;
    }

    public static void resetCounter() {
        counter = 0;
    }

    public static void inclementCounter() {
        counter++;
    }

    public static int showCounter() {
        return counter;
    }
}
