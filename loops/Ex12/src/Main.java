import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Qual número deseja ver a tabuada? ");
        int mult = scan.nextInt();

        System.out.println("--------------------------");
        System.out.println("Tabuada de " + mult + ":");

        for (int i = 1; i <= 10; i++) {
            int res = mult * i;

            System.out.println(mult + " x " + i + " = " + res);
        }
    }
}