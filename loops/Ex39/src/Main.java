import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int higher = Integer.MIN_VALUE, higherNumber = 0;
        int lower = Integer.MAX_VALUE, lowerNumber = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Informe o número do aluno: ");
            int studentNumber = scan.nextInt();

            System.out.print("Qual a altura? ");
            double studentHeight = scan.nextDouble() * 100;

            if (studentHeight > higher) {
                higher = (int) studentHeight;
                higherNumber = studentNumber;
            }

            if (studentHeight < lower) {
                lower = (int) studentHeight;
                lowerNumber = studentNumber;
            }
        }

        System.out.println("-----------------------------------");

        System.out.println("Aluno mais alto --> " +
                "Número: " + higherNumber + " Altura: " + higher);

        System.out.println("Aluno mais baixo --> " +
                "Número: " + lowerNumber + " Altura: " + lower);
    }
}