import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o fatorial: ");
        int factorial = scan.nextInt();

        int result = 1;

        System.out.println("----------------------------------");
        System.out.println("Fatorial de: " + factorial);

        System.out.print(factorial + "! = ");

        for (int i = factorial; i > 0; i--) {
            result *= i;
            System.out.print(i);

            if (i > 1) {
                System.out.print(" . ");
            }
        }

        System.out.println(" = " + result);
    }
}