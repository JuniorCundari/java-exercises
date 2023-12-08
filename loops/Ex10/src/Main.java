import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor inicial: ");
        int number1 = scan.nextInt();

        System.out.print("Informe o valor final: ");
        int number2 = scan.nextInt();

        for (int i = number1; i <= number2; i++) {
            System.out.println(i);
        }

        scan.close();
    }
}