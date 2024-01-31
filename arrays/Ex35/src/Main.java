public class Main {
    public static void main(String[] args) {

        int[] vetorA = {10, 15, 20, 25};

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " -> ");

            for (int j = 1; j <= vetorA[i]; j++) {
                if (vetorA[i] % j == 0) {
                    System.out.print(j + " ");
                }
            }

            System.out.println();
        }
    }
}