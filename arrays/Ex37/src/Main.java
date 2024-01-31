import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Inform o " + (i + 1) + " número: ");
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = 1;
            System.out.print(vetorA[i] + "! = ");

            for (int j = vetorA[i]; j > 0; j--) {
                vetorB[i] *= j;
            }

            System.out.println(vetorB[i]);
        }

    }
}