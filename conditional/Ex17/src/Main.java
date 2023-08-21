import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o ano: ");
        int ano = scan.nextInt();

        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                if (ano % 400 == 0) {
                    System.out.println("O ano " + ano + " é bissexto!");
                } else {
                    System.out.println("O ano " + ano + " não é bissexto!");
                }
            } else {
                System.out.println("O ano " + ano + " é bissexto!");
            }
        } else {
            System.out.println("O ano " + ano + " não é bissexto!");
        }
    }
}