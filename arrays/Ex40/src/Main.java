public class Main {
    public static void main(String[] args) {

        int[] A = {10, 58, 92, 47, 21, 62, 41, 87};
        int[] B = {90, 21, 58, 11, 7, 65, 87, 57, 37};

        int tamVetorC = A.length; // O tamanho máximo que o vetor C pode ter é o tamanho de A
        int[] C = new int[tamVetorC];

        int count = 0;

        // Iterar sobre os elementos de A
        for (int i = 0; i < A.length; i++) {
            boolean encontrado = false;
            // Verificar se o elemento de A está presente em B
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    encontrado = true;
                    break;
                }
            }
            // Se o elemento de A não está presente em B, adicionar a C
            if (!encontrado) {
                C[count] = A[i];
                count++;
            }
        }

        // Imprimir o vetor C
        System.out.print("Vetor C: ");
        for (int i = 0; i < count; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
