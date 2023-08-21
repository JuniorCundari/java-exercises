import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int number1 = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        int number2 = scan.nextInt();

        System.out.println("Digite o terceiro número: ");
        int number3 = scan.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println("O " + number1 + " é o maior!");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("O " + number2 + " é o maior!");
        } else {
            System.out.println("O " + number3 + " é o maior!");
        }

        scan.close();
    }
}