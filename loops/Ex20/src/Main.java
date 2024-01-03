import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int predecessor, result = 1, again = 1;

        while (again == 1) {
            System.out.print("Digite o fatorial: ");
            int factorial = scan.nextInt();
            int fact = factorial;

            if (fact < 0 || fact > 16) {
                System.out.println("Fatorial precisa estar entre 0 e 16!");
                System.out.println("----------------------------------");

                System.out.print("Digite o fatorial: ");
                factorial = scan.nextInt();
            }

            for (; fact >= 1; fact--) {
                predecessor = fact;
                result *= predecessor;
            }

            System.out.println("----------------------------------");
            System.out.println("Fatorial de !" + factorial + " = " + result);
            System.out.println("----------------------------------");

            System.out.print("Deseja continuar? ");
            System.out.print("0 - Não / 1 - Sim ");
            again = scan.nextInt();

            System.out.println("----------------------------------");
            result = 1;
        }
    }
}