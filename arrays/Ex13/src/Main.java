import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int sum = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o " + (i + 1) + "° número inteiro: ");
            int numbers = scan.nextInt();

            vetorA[i] = numbers;
        }

        System.out.print("\nVetor A: ");
        for (int a: vetorA) {
            System.out.print(a + " ");
        }

        System.out.print("\nNúmeros multiplos de 5: ");
        for (int j: vetorA) {
            if (j % 5 == 0) {
                System.out.print(j + " ");
                sum += j;
            }
        }

        System.out.println(" ");
        System.out.println("Soma dos números multiplos de 5: " + sum);
    }
}