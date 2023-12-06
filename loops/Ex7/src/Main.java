import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int bigger = 0;

        for (int i = 1;i <= 5;i++) {
            System.out.print("Digite o " + i + "°" +" número: ");
            int number = scan.nextInt();

            if (number > bigger) {
                bigger = number;
            }
        }

        System.out.println("-----------------------------");
        System.out.println("O maior número é: " + bigger);

        scan.close();
    }
}
