public class Main {
    public static void main(String[] args) {

        int[] A = new int[10];
        int[] B = new int[A.length];

        System.out.print("Vetor A: ");
        for (int i = 0; i < A.length; i++) {
            A[i] = i;
            System.out.print(A[i] + " ");
        }

        System.out.print("\nVetor B: ");
        for (int i = 0; i < B.length; i++) {
            B[i] = A[i] * i;
            System.out.print(B[i] + " ");
        }
    }
}
