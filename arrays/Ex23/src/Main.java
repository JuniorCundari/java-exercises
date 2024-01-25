import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        boolean todosPares = true;

        for (int i = 0; i < A.length; i++) {
            System.out.print("Informe o " + (i + 1) + "° número: ");
            A[i] = scan.nextInt();

            if (A[i] % 2 != 0) {
                todosPares = false;
                break;
            }
        }

        if (todosPares) {
            System.out.println("Todos os elementos do vetor são pares.");
        } else {
            System.out.println("Pelo menos um elemento do vetor não é par.");
        }
    }
}