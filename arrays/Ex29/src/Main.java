import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[A.length];
        int[] C = new int[(A.length) + (B.length)];

        for (int i = 0; i < A.length; i++) {
            System.out.print((i + 1) + "° número do Vetor A: ");
            A[i] = scan.nextInt();
        }

        for (int i = 0; i < B.length; i++) {
            System.out.print((i + 1) + "° número do Vetor B: ");
            B[i] = scan.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            C[i] = A[i];
        }

        for (int i = 0; i < A.length; i++) {
            C[A.length + i] = B[i];
        }

        System.out.print("\nVetor A: ");
        for (int a: A) {
            System.out.print(a + " ");
        }

        System.out.print("\nVetor B: ");
        for (int b: B) {
            System.out.print(b + " ");
        }

        System.out.print("\nVetor C: ");
        for (int c: C) {
            System.out.print(c + " ");
        }
    }
}