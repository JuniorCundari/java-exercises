import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int int1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int int2 = scanner.nextInt();

        System.out.println("Agora digite o número real: ");
        double real = scanner.nextDouble();

        // letra A
        int letraA = (int1 * 2) * (int2 / 2);
        System.out.println("O Produto é: " + letraA);

        // letra B
        double letraB = (int1 * 3) + real;
        System.out.println("A soma é: " + letraB);

        //letra C
        double letraC = Math.pow(real, 3);
        System.out.println("Ao cubo do número real é: " + letraC);

        scanner.close();
    }
}