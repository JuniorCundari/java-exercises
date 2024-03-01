package com.junior.ex2;

// Escreva um método recursivo e estático que receba um número inteiro positivo N e calcule o somatório dos
// números de 1 a N

public class StaticRecursive {

    public static int sum(int num) {
        if (num == 1) {
            return 1;
        }

        return num + sum(num - 1);
    }
}
