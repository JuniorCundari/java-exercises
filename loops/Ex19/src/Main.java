import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números deseja informar? ");
        int maxNum = scan.nextInt();

        int bigger = Integer.MIN_VALUE;
        int smaller = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 1; i <= maxNum; i++) {
            System.out.print("Digite o " + i + "°" +" número: ");
            int number = scan.nextInt();

            while (number < 0 || number > 1000) {
                System.out.println("Número fora do intervalo permitido (0 a 1000). Tente novamente.");
                System.out.print("Digite o " + i + "º número: ");
                number = scan.nextInt();
            }

            if (number > bigger) {
                bigger = number;
            }

            if (number < smaller) {
                smaller = number;
            }

            sum += number;

        }

        System.out.println("-----------------------------");
        System.out.println("O maior número é: " + bigger);

        System.out.println("-----------------------------");
        System.out.println("O menor número é: " + smaller);

        System.out.println("-----------------------------");
        System.out.println("A soma dos valores é: " + sum);

        scan.close();
    }
}