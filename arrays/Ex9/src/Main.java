public class Main {
    public static void main(String[] args) {

        int[] A = new int[10];
        int[] B = new int[A.length];
        float[] C = new float[A.length];

        System.out.print("Vetor A: ");
        for (int i = 0; i < A.length; i++) {
            A[i] = i + (i + 5);
            System.out.print(A[i] + "  ");
        }

        System.out.print("\nVetor B: ");
        for (int i = 0; i < A.length; i++) {
            B[i] = i + 2;
            System.out.print(B[i] + "  ");
        }

        System.out.print("\nVetor C: ");
        for (int i = 0; i < A.length; i++) {
            C[i] = (float) A[i] / B[i];
            System.out.print(C[i] + "  ");
        }
    }
}