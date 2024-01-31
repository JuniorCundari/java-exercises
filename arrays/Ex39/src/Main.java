public class Main {
    public static void main(String[] args) {

        int[] vetorA = {10, 58, 92, 47, 21, 62, 41, 87};
        int[] vetorB = {90, 21, 58, 11, 7, 65, 87, 57, 37};

        int tamVetorC = Math.min(vetorA.length, vetorB.length);
        int[] vetorC = new int[tamVetorC];

        int count = 0;

        for (int i = 0; i < vetorA.length; i++) {
            for (int j = 0; j < vetorB.length; j++) {
                if (vetorA[i] == vetorB[j]) {
                    vetorC[count] = vetorA[i];
                    count++;
                    break;
                }
            }
        }

        System.out.print("Vetor C: ");
        for (int i = 0; i < count; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}
