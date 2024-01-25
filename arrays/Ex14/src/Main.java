import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int sum = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print((i + 1) + "° número: ");
            int numbers = scan.nextInt();

            vetorA[i] = numbers;
        }

        System.out.print("\nVetor A: ");
        for (int j: vetorA) {
            System.out.print(j + " ");
        }

        System.out.print("\nNúmeros ímpares: ");
        for (int j: vetorA) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
                sum = sum + j;
            }
        }

        System.out.println(" ");
        System.out.println("Soma dos números ímpares: " + sum);
    }
}