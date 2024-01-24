public class Main {
    public static void main(String[] args) {

        int[] A = new int[15];
        double[] B = new double[A.length];

        System.out.print("Vetor A: ");
        for (int i = 0; i < A.length; i++) {
            A[i] = 2 * (i + 1);
            System.out.print(A[i] + " ");
        }

        System.out.print("\nVetor B: ");
        for (int i = 0; i < B.length; i++) {
            B[i] = Math.sqrt(A[i]);
            System.out.printf("%.2f ", B[i]);
        }
    }
}
