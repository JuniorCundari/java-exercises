import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print((i + 1) + "° número: ");
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            boolean primo = true;

            for (int j = 2; j < vetorA[i]; j++) {
                if (vetorA[i] % j == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo && vetorA[i] > 1) {
                System.out.println(vetorA[i] + " -> primo");
            } else {
                System.out.println(vetorA[i] + " > não primo");
            }
        }
    }
}