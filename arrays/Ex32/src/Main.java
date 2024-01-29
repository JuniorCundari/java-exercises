public class Main {
    public static void main(String[] args) {

        int[] vetorA = {3, 5, 4, 8, 6};

        for (int i = 0; i < vetorA.length; i++) {
            for (int k = 1; k <= 10; k++) {
                int result = vetorA[i] * k;
                System.out.println(vetorA[i] + " X " + k + " = " + result);
            }

            System.out.println("--------------------------------------------------");
        }
    }
}