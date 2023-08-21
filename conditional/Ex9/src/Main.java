import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo os três números
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        // Verificando a ordem decrescente usando if-else
        System.out.println(" ");
        System.out.println("Números em ordem decrescente: ");
        if (num1 >= num2 && num1 >= num3) {
            System.out.print(num1 + " ");
            if (num2 >= num3) {
                System.out.print(num2 + " " + num3);
            } else {
                System.out.print(num3 + " " + num2);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.print(num2 + " ");
            if (num1 >= num3) {
                System.out.print(num1 + " " + num3);
            } else {
                System.out.print(num3 + " " + num1);
            }
        } else {
            System.out.print(num3 + " ");
            if (num1 >= num2) {
                System.out.print(num1 + " " + num2);
            } else {
                System.out.print(num2 + " " + num1);
            }
        }
        scanner.close();
    }
}