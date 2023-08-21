import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("ax2 + bx + c");
        System.out.println("delta = b² - 4.a.c");

        System.out.print("Informe o valor de a: ");
        double a = scan.nextDouble();


        if (a != 0) {
            System.out.print("Informe o valor de b: ");
            double b = scan.nextDouble();

            System.out.print("Informe o valor de c: ");
            double c = scan.nextDouble();

            double delta = (Math.pow(b, 2)) - (4 * a * c);
            if (delta < 0) {
                System.out.println("A equação não possui raizes reais! " + delta);
            } else if (delta == 0) {
                System.out.println("A equação possui apenas uma raiz real! " + delta);
            } else {
                System.out.println("A equação possui duas raizes reais! " + delta);
            }
        } else {
            System.out.println("A equação não é de segundo grau!");
        }
    }
}