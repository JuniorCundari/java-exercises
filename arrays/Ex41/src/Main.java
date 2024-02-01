import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] A = {12, 39, 76, 90, 64, 10, 2};

        int next = 0;

        while (next == 0) {
            System.out.print("Informe o número: ");
            int number = scan.nextInt();

            boolean found = false; // Inicialmente definido como falso

            for (int i = 0; i < A.length; i++) {
                if (A[i] == number) {
                    found = true; // Se encontrado, definir como verdadeiro
                    break;
                }
            }

            if (found) {
                System.out.println("Número " + number + " encontrado");
            } else {
                System.out.println("Número " + number + " não encontrado");
            }

            System.out.print("Deseja continuar com a busca? (0 - SIM / 1 - NÃO) ");
            next = scan.nextInt();
        }
    }
}