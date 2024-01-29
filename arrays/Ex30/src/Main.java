import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print((i + 1) + "° número: ");
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 == 0) {
                vetorB[i] = vetorA[i];
                vetorC[i] = -1;
            } else {
                vetorC[i] = vetorA[i];
                vetorB[i] = -1;
            }
        }

        System.out.println("\nVetor A: ");
        for (int a: vetorA) {
            System.out.print(a + " ");
        }

        System.out.println("\nVetor B: ");
        for (int b: vetorB) {
            System.out.print(b + " ");
        }

        System.out.println("\nVetor C: ");
        for (int c: vetorC) {
            System.out.print(c + " ");
        }
    }
}