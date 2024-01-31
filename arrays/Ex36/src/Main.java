public class Main {
    public static void main(String[] args) {

        int[] A = new int[11];

        for (int i = 0; i < A.length; i++) {
            A[i] = (int) Math.pow(2, i);
            System.out.println(A[i]);
        }
    }
}