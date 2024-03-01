package com.junior.ex4;

// Os números de Pell são definidos pela seguinte recursão

// p(n) = { 0 se n = 0, 1 se n = 1 }
// p(n) = { 2p(n - 1) + p(n - 2) }

// Exemplo de números desta sequência são: 0, 1, 2, 5, 12, 29, 70, 169, 408, 985...
// Implemente um método recursivo que receba como entrada um número N e retorne o
// N-ésimo número de Pell.

public class NthTermPell {
    public static int pell(int num) {
        if (num == 0 || num == 1) {
            return num;
        }

        return 2 * pell(num - 1) + pell(num - 2);
    }
}