package com.junior.ex3;

// Implemente um método recursivo que receba como entrada dois números inteiros x e
// k e retorne o valor da operação x^k. Não utilize o método Math.pow() do Java. Utilize apenas multiplicação.

public class RaisePower {

    public static int raisePower(int base, int exp) {
        if (exp == 0) {
            return 1;
        }

        return base * raisePower(base, exp - 1);
    }
}
