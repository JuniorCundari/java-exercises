public class Main {
    public static void main(String[] args) {

        int[] A = new int[8];
        int[] B = new int[A.length];

        A[0] = 1;
        A[1] = 2;
        A[2] = 3;
        A[3] = 4;
        A[4] = 5;
        A[5] = 6;
        A[6] = 7;
        A[7] = 8;

        System.out.print("Vetor A: ");
        for (int vetorA: A) {
            System.out.print(vetorA + " ");
        }

        System.out.print("\nVetor B: ");
        for (int i = 0; i < B.length; i++) {
            B[i] = A[i] * 2;
            System.out.print(B[i] + " ");
        }
    }
}
