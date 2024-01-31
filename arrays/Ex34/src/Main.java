public class Main {
    public static void main(String[] args) {

        int[] vetorA = {10, 15, 20, 25};

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " -> ");

            for (int j = 0; j < vetorA[i]; j++) {
                if (j % 2 == 0) {
                    System.out.print(j + " ");
                }
            }

            System.out.println(" ");
        }
    }
}