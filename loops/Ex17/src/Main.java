import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o fatorial: ");
        // variável "fact" criada apenas para conseguir usar a variável "factorial" na frase final do resultado
        int factorial = scan.nextInt();
        int fact = factorial;

        int predecessor;
        int result = 1;

        for (; fact >= 1; fact--) {
            predecessor = fact;
            result *= predecessor;

        }

        System.out.println("----------------------------------");
        System.out.print("Fatorial de !" + factorial + " = " + result);
    }
}
