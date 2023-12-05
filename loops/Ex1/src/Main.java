import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma nota entre 0 e 10: ");
        double nota = scan.nextDouble();

        while (nota > 10 || nota < 0) {

            System.out.println("Nota inválida!");

            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = scan.nextDouble();
        }
    }
}