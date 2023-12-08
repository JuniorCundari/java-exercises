import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int even = 0;
        int odd = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "° número: ");
            int numbers = scan.nextInt();

            if ((numbers % 2) != 0) {
                odd++;
            } else {
                even++;
            }
        }

        System.out.println("------------------");
        System.out.println("Quantidade de números ímpares: " + odd);
        System.out.println("Quantidade de números pares: " + even);
    }
}