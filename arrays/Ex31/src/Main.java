import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        int index = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print((i + 1) + "° número: ");
            vetorA[i] = scan.nextInt();
        }

        for (int j : vetorA) {
            if (j % 2 == 0) {
                vetorB[index] = j;
                index++;
            }
        }

        for (int j : vetorA) {
            if (j % 2 != 0) {
                vetorB[index] = j;
                index++;
            }
        }

        System.out.print("\nVetor A: ");
        for (int a: vetorA) {
            System.out.print(a + " ");
        }

        System.out.print("\nVetor B: ");
        for (int b: vetorB) {
            System.out.print(b + " ");
        }
    }
}