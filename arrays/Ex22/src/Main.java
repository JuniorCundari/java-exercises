public class Main {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int countZero = 0, countUm = 0;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random());
        }

        for (int a : vetorA) {
            if (a == 1) {
                countUm++;
            } else {
                countZero++;
            }
            System.out.print(a + " ");
        }

        float percentualUm = ((float) countUm / vetorA.length) * 100;
        float percentualZero = ((float) countZero / vetorA.length) * 100;

        System.out.printf("\nPercentual de números 0 (Zero): %.0f%%\n", percentualZero);
        System.out.printf("Percentual de números 1 (Um): %.0f%%\n", percentualUm);
    }
}