import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o número inteiro: ");
        int number = scan.nextInt();

        boolean isPrime = true; // Assumimos que o número é primo inicialmente
        StringBuilder dividers = new StringBuilder(); // String para armazenar os divisores

        if (number <= 1) {
            isPrime = false; // 0 e 1 não são primos
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false; // Encontrou um divisor, não é primo
                    dividers.append(i).append(" "); // Adiciona o divisor à lista
                }
            }
        }

        System.out.println("----------------------------------------");
        if (isPrime) {
            System.out.println("O número " + number + " é um número primo!");
        } else {
            System.out.println("O número " + number + " NÃO é um número primo!");
            System.out.println("É divisível por: " + dividers);
        }
    }
}
