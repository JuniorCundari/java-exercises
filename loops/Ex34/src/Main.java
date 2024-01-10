import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int number = scan.nextInt();

        boolean isPrime = number > 1; // Inicializa como true se o número for maior que 1

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false; // Encontrou um divisor, não é primo
                break; // Não é necessário continuar o loop
            }
        }

        System.out.println("----------------------------------------");
        if (isPrime) {
            System.out.println(number + " é um número primo!");
        } else {
            System.out.println(number + " NÃO é um número primo!");
        }
    }
}