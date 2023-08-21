import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int number1 = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        int number2 = scan.nextInt();


        int result = number1 + number2;
        System.out.println("O resultado da soma dos valores é: " + result);

        scan.close();

    }
}