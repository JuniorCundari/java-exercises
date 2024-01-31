public class Main {
    public static void main(String[] args) {

        int[] A = {10, 15, 65, 14, 2, 98, 23, 45, 69, 10};
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                B[i] += A[j];
            }

            System.out.println(B[i]);
        }
    }
}