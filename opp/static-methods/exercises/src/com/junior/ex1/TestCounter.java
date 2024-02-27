package com.junior.ex1;

public class TestCounter {

    static void showResult() {
        System.out.println(Counter.showCounter());
    }

    public static void main(String[] args) {
        showResult();

        Counter.inclementCounter();

        showResult();

        Counter.resetCounter();

        showResult();

        Counter.inclementCounter();
        Counter.inclementCounter();
        Counter.inclementCounter();

        showResult();

        Counter.resetCounter();

        Counter count1 = new Counter();
        Counter count2 = new Counter();
        Counter count3 = new Counter();

        showResult();
    }
}