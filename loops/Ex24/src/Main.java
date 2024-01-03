import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float sum = 0;
        int limit;

        System.out.print("Quantos números dejesa calcular? ");
        limit = scan.nextInt();

        while (limit <= 0) {
            System.out.println("-----------------------------");
            System.out.println("Informe um número válido!");

            System.out.print("Quantos números dejesa calcular? ");
            limit = scan.nextInt();
        }

        System.out.println("-----------------------------");

        for (int i = 1; i <= limit; i++) {
            System.out.print("Informe o valor: ");
            int numbers = scan.nextInt();

            sum = sum + numbers;
        }

        float result = sum / limit;

        System.out.println("-------------------------------");
        System.out.println("Média aritmética: " + result);
    }
}