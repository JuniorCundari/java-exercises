import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Calcule a idade média da sua turma!");

        float sum = 0;
        int limit;

        System.out.print("Quantas pessoas são? ");
        limit = scan.nextInt();

        for (int i = 1; i <= limit; i++) {
            System.out.print("Informe a idade: ");
            int yearsOld = scan.nextInt();

            sum = sum + yearsOld;
        }

        System.out.println("-------------------------------");

        float average = sum / limit;
        System.out.println("A média de idade é " + average + " anos!");

        System.out.println("-------------------------------");

        if (average > 0 && average < 25) {
            System.out.println("Sua turma é jovem!");
        } else if (average > 25 && average < 60) {
            System.out.println("Sua turma é adulta!");
        } else {
            System.out.println("Sua turma é idosa!");
        }
    }
}