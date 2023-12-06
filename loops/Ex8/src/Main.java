import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sum = 0;
        float average = 0;

        for (int i = 1; i < 6; i++) {
            System.out.print("Digite o " + i + "°" +" número: ");
            int number = scan.nextInt();

            sum = sum + number;

            average = (float) sum / i;
        }

        System.out.println("-----------------------------");
        System.out.println("Soma: " + sum);
        System.out.println("Média: " + average);

        scan.close();
    }
}