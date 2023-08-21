import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um lado do triângulo: ");
        double lado1 = scan.nextDouble();

        System.out.print("Informe outro lado do triângulo: ");
        double lado2 = scan.nextDouble();

        System.out.print("Informe mais um lado do triângulo: ");
        double lado3 = scan.nextDouble();

        boolean verif = (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);

        if (verif) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os lados informados não podem ser um triângulo");
        }
    }
}