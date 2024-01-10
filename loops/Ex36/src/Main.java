import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Montar a tabuada de: ");
        int mult = scan.nextInt();

        System.out.print("Começar por: ");
        int start = scan.nextInt();

        System.out.print("Terminar em: ");
        int end = scan.nextInt();

        while (end < start) {
            System.out.println("-------------------------------------------------------");
            System.out.println("O número final não pode ser menor que o número inicial!");
            System.out.println("-------------------------------------------------------");
            System.out.print("Terminar em: ");
            end = scan.nextInt();
        }

        System.out.println(" ");
        System.out.println("Vou montar a tabuada de " + mult +
                " começando em " + start +
                " e terminando em " + end + ":");

        for (int i = start; i <= end; i++) {
            System.out.println(mult + " X " + i + " = " + (mult * i));
        }
    }
}