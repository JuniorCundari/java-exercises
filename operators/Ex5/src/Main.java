import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite metros: ");
        float m = scan.nextInt();

        float result = m * 100;
        System.out.println("A conversão de metro em centímetros: " + result + "cm");

        scan.close();
    }
}