import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        char[] B = new char[A.length];

        for (int i = 0; i < A.length; i++) {
            System.out.print("Preencha o " + (i + 1) + "° número do vetor A: ");
            A[i] = scan.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] < 7) {
                B[i] = 'a';
            } else if (A[i] == 7) {
                B[i] = 'b';
            } else if (A[i] > 7 && A[i] < 10) {
                B[i] = 'c';
            } else if (A[i] == 10) {
                B[i] = 'd';
            } else {
                B[i] = 'e';
            }
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