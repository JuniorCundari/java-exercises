public class Main {
    public static void main(String[] args) {

        int[] A = new int[10];

        System.out.print("Vetor A: ");
        for (int i = 0; i < A.length; i++) {
            A[i] = i + 1;
            System.out.print(A[i] + " ");
        }

        System.out.print("\nNúmeros pares do Vetor A: ");
        for (int j : A) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
        }
    }
}