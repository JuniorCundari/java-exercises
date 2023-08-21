import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número inteiro: ");
        int numero = scan.nextInt();

        int resultado = numero % 2;

        if (resultado != 0) {
            System.out.println(numero + " é um número ímpar");
        } else {
            System.out.println(numero + " é um número par");
        }
    }
}