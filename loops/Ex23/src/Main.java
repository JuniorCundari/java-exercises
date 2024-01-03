// um número primo é quando ele é divísivel por 1 ou por ele mesmo, ou seja
// quando o número possui apenas 2 divisores
// números naturais

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar o valor de N ao usuário
        System.out.print("Digite um número inteiro N: ");
        int number = scanner.nextInt();

        // Inicializar contador de divisões
        int division = 0;

        System.out.println("-----------------------------------");
        System.out.println("Números primos entre 1 e " + number + ":");

        // Incluir 2 como número primo
        System.out.print(2 + " ");

        // Verificar apenas números ímpares a partir de 3
        for (int i = 3; i <= number; i += 2) {
            boolean isPrime = true;

            // Verificar se i é primo
            for (int j = 3; j <= i / 3; j++) {
                division++; // Contar a divisão realizada

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

        // Pular uma linha
        System.out.println();

        // Exibir o número total de divisões realizadas
        System.out.println("Número total de divisões: " + division);

        // Fechar o scanner
        scanner.close();
    }
}