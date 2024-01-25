import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int sumBottom = 0, countEqual = 0;
        int sumHigher = 0, countHigher = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print((i + 1) + "° número: ");
            int numbers = scan.nextInt();

            vetorA[i] = numbers;
        }

        System.out.print("\nVetor A: ");
        for (int j: vetorA) {
            System.out.print(j + " ");
        }

        System.out.println("\n-----------------------------------");

        for (int j: vetorA) {
            if (j < 15) {
                sumBottom += j;
            }

            if (j == 15) {
                countEqual++;
            }

            if (j > 15) {
                countHigher++;
                sumHigher += j;
            }
        }

        float average = (float) sumHigher / countHigher;

        System.out.println("Soma dos valores menores que 15: " + sumBottom);
        System.out.println("Quantidade de elementos armazenados no vetor iguais a 15: " + countEqual);
        System.out.println("Média dos elementos armazenados no vetor superiores a 15: " + average);
    }
}