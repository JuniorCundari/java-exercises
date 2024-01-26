import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            System.out.print("Preencha o " + (i + 1) + "° número do vetor A: ");
            A[i] = scan.nextInt();
        }

        for (int i = 0; i < B.length; i++) {
            B[i] = A[A.length - (i + 1)];
        }

        System.out.print("\nVetor A: ");
        for (int a: A) {
            System.out.print(a + " ");
        }

        System.out.print("\nVetor B: ");
        for (int b: B) {
            System.out.print(b + " ");
        }
    }
}