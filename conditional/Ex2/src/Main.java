import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o número: ");
        double number = scan.nextDouble();

        if (number < 0) {
            System.out.println("Este número é negativo!");
        } else {
            System.out.println("Este número é positivo!");
        }

        scan.close();
    }
}