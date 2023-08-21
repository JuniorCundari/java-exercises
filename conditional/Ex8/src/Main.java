import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o preço do primeiro produto?");
        double p1 = scan.nextDouble();

        System.out.println("Qual o preço do segundo produto?");
        double p2 = scan.nextDouble();

        System.out.println("Qual o preço do terceiro produto?");
        double p3 = scan.nextDouble();

        if (p1 < p2 && p1 < p3) {
            System.out.println("Você deve comprar o primeiro produto!");
        } else if (p2 < p1 && p2 < p3) {
            System.out.println("Você deve comprar o segundo produto!");
        } else {
            System.out.println("Você deve comprar o terceiro produto!");
        }
    }
}