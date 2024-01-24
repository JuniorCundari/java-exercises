public class Main {
    public static void main(String[] args) {

        int[] A = new int[5];
        int[] B = new int[A.length];

        A[0] = 1;
        A[1] = 2;
        A[2] = 3;
        A[3] = 4;
        A[4] = 5;

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
            System.out.println("Vetor A[" + i + "]: " + A[i]);
            System.out.println("Vetor B[" + i + "]: " + B[i]);
        }
    }
}