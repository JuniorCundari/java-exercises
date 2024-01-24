public class Main {
    public static void main(String[] args) {

        int[] A = new int[10];
        int[] B = new int[A.length];
        int[] C = new int[A.length];

        System.out.print("Vetor A: ");
        for (int i = 0; i < A.length; i++) {
            A[i] = i + 2;
            System.out.print(A[i] + "  ");
        }

        System.out.print("\nVetor B: ");
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
            System.out.print(B[i] + "  ");
        }

        System.out.print("\nVetor C: ");
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] * B[i];
            System.out.print(C[i] + "  ");
        }
    }
}