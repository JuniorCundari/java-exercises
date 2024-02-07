import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[][] numbers = new int[10][10];

        Random randomNumbers = new Random();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                numbers[i][j] = randomNumbers.nextInt(100);
            }
        }

        int biggestLine = Integer.MIN_VALUE;
        int smallestLine = Integer.MAX_VALUE;
        int colBiggestLine = 0;
        int colSmallestLine = 0;
        int line = 5;

        for (int j = 0; j < numbers.length; j++) {
            if (numbers[line][j] > biggestLine) {
                biggestLine = numbers[line][j];
                colBiggestLine = j;
            }

            if (numbers[line][j] < smallestLine) {
                smallestLine = numbers[line][j];
                colSmallestLine = j;
            }
        }

        System.out.println("\nMaior valor da linha " + line + " é " + biggestLine + " e está na coluna " + colBiggestLine);
        System.out.println("Menor valor da linha " + line + " é " + smallestLine + " e está na coluna " + colSmallestLine);

        int biggestCol = Integer.MIN_VALUE;
        int smallestCol = Integer.MAX_VALUE;
        int lineBiggestCol = 0;
        int lineSmallestCol = 0;
        int col = 7;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i][col] > biggestCol) {
                biggestCol = numbers[i][col];
                lineBiggestCol = i;
            }

            if (numbers[i][col] < smallestCol) {
                smallestCol = numbers[i][col];
                lineSmallestCol = i;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.print(numbers[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("\nMaior valor da coluna " + col + " é " + biggestCol + " e está na linha " + lineBiggestCol);
        System.out.println("Menor valor da coluna " + col + " é " + smallestCol + " e está na linha " + lineSmallestCol);
    }
}