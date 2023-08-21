import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o número: ");
        double number = scan.nextDouble();

        if (Math.floor(number) == number) {
            System.out.println("Número inteiro " + number);
        } else {
            System.out.println("Número decimal " + number);
        }
    }
}