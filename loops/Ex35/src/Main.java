import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro N: ");
        int number = scan.nextInt();

        System.out.println("-----------------------------------");
        System.out.println("Números primos entre 1 e " + number + ":");

        // Incluir 2 como número primo
        System.out.print(2 + " ");

        // Verificar apenas números ímpares a partir de 3
        for (int i = 3; i <= number; i += 2) {
            boolean isPrime = true;

            // Verificar se i é primo
            for (int j = 3; j <= i / 3; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break; // Não é primo, sair do loop interno
                }
            }

            // Se i for primo, exibi-lo
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}