import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double n1 = scan.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double n2 = scan.nextDouble();

        double media = (n1 + n2) / 2;
        System.out.println("Sua média foi: " + media);

        if (media == 10) {
            System.out.println("Aprovado com Distinção!");

        } else if (media >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado");
        }

        scan.close();
    }
}