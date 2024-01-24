public class Main {
    public static void main(String[] args) {

        int[] A = new int[10];
        int sum = 0;

        System.out.print("Vetor A: ");
        for (int i = 0; i < A.length; i++) {
            A[i] = i + 1;
            System.out.print(A[i] + " ");
            sum += A[i];

        }

        System.out.print("\nSoma de todos os elementos: " + sum);
    }
}