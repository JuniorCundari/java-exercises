import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double number1 = scan.nextDouble();

        System.out.println("Informe o segundo número: ");
        double number2 = scan.nextDouble();

        if (number1 > number2) {
            System.out.println("O número maior informado é: " + number1);
        } else {
            System.out.println("O número maior informado é: " + number2);
        }

        scan.close();
    }
}