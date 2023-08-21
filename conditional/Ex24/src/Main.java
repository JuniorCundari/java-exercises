import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        double number1 = scan.nextDouble();

        System.out.print("Informe o segundo número: ");
        double number2 = scan.nextDouble();

        System.out.println("---------------------");
        System.out.println("Operações:");
        System.out.println("(+) Adição");
        System.out.println("(-) Subtração");
        System.out.println("(*) Multiplicação");
        System.out.println("(/) Divisão");
        System.out.println("---------------------");

        System.out.print("Qual operação deseja realizar? ");
        String operation = scan.next();

        System.out.println("---------------------");
        if (Objects.equals(operation, "+")) {
            double result = number1 + number2;

            int evenOdd = (int) (result % 2);
            if (evenOdd != 0) {
                System.out.println("O número " + evenOdd + " é ímpar");
            } else {
                System.out.println("O número " + evenOdd + " é par");
            }

            if (result > 0) {
                System.out.println("O número " + result + " é positivo");
            } else {
                System.out.println("O número " + result + " é negativo");
            }

            if (Math.floor(result) == result) {
                System.out.println("O número " + result + " é inteiro");
            } else {
                System.out.println("O número " + result + " é decimal");
            }
        } else if (Objects.equals(operation, "-")) {
            double result = number1 - number2;

            int evenOdd = (int) (result % 2);
            if (evenOdd != 0) {
                System.out.println("O número " + evenOdd + " é ímpar");
            } else {
                System.out.println("O número " + evenOdd + " é par");
            }

            if (result > 0) {
                System.out.println("O número " + result + " é positivo");
            } else {
                System.out.println("O número " + result + " é negativo");
            }

            if (Math.floor(result) == result) {
                System.out.println("O número " + result + " é inteiro");
            } else {
                System.out.println("O número " + result + " é decimal");
            }
        } else if (Objects.equals(operation, "*")) {
            double result = number1 * number2;

            int evenOdd = (int) (result % 2);
            if (evenOdd != 0) {
                System.out.println("O número " + evenOdd + " é ímpar");
            } else {
                System.out.println("O número " + evenOdd + " é par");
            }

            if (result > 0) {
                System.out.println("O número " + result + " é positivo");
            } else {
                System.out.println("O número " + result + " é negativo");
            }

            if (Math.floor(result) == result) {
                System.out.println("O número " + result + " é inteiro");
            } else {
                System.out.println("O número " + result + " é decimal");
            }
        } else {
            double result = number1 / number2;

            int evenOdd = (int) (result % 2);
            if (evenOdd != 0) {
                System.out.println("O número " + evenOdd + " é ímpar");
            } else {
                System.out.println("O número " + evenOdd + " é par");
            }

            if (result > 0) {
                System.out.println("O número " + result + " é positivo");
            } else {
                System.out.println("O número " + result + " é negativo");
            }

            if (Math.floor(result) == result) {
                System.out.println("O número " + result + " é inteiro");
            } else {
                System.out.println("O número " + result + " é decimal");
            }
        }
    }
}