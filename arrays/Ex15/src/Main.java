import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int countEven = 0, countOdd = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print((i + 1) + "° número: ");
            int numbers = scan.nextInt();

            vetorA[i] = numbers;
        }

        System.out.print("\nVetor A: ");
        for (int j: vetorA) {
            System.out.print(j + " ");
        }

        System.out.print("\n----------------------------------------------");

        System.out.print("\nNúmeros pares do Vetor A: ");
        for (int j: vetorA) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
                countEven++;
            }
        }

        double evenPercentage = (double) countEven / vetorA.length * 100;
        System.out.print("\nPercentual de pares armazenado no Vetor A: " + evenPercentage + "%");

        System.out.print("\n----------------------------------------------");

        System.out.print("\nNúmeros ímpares do Vetor A: ");
        for (int j: vetorA) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
                countOdd++;
            }
        }

        double oddPercentage = (double) countOdd / vetorA.length * 100;
        System.out.print("\nPercentual de ímpares armazenado no Vetor A: " + oddPercentage + "%");
    }
}