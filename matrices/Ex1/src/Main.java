import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[][] numbers = new int[4][4];

        Random randomNumbers = new Random();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                numbers[i][j] = randomNumbers.nextInt(100);
            }
        }

        int bigger = 0;
        int line = 0;
        int col = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i][j] > bigger) {
                    bigger = numbers[i][j];
                    line = i;
                    col = j;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.print(numbers[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("\nMaior valor = " + bigger);
        System.out.println("Linha = " + line);
        System.out.println("Coluna = " + col);
    }
}