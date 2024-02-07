import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] numbers = new int[3][3];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.print("Digite " + (i + 1) + "° linha e " + (j + 1) + "° coluna: ");
                numbers[i][j] = scan.nextInt();
            }
        }

        int amountEven = 0;
        int amountOdd = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    amountEven++;
                }

                if (numbers[i][j] % 2 != 0) {
                    amountOdd++;
                }
            }
        }

        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.print(numbers[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("\nQuantidade de pares: " + amountEven);
        System.out.println("Quantidade de ímpares: " + amountOdd);
    }
}