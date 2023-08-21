import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.print("Informe a segunda nota: ");
        double nota2 = scan.nextDouble();

        System.out.print("Informe a terceira nota: ");
        double nota3 = scan.nextDouble();

        DecimalFormat mediaFormat = new DecimalFormat("#.##");

        double media = (nota1 + nota2 + nota3) / 3;

        media = Double.parseDouble(mediaFormat.format(media));

        if (media == 10) {
            System.out.println("Aprovado com Distinção! " + media);
        } else if (media >= 7) {
            System.out.println("Aprovado! " + media);
        } else {
            System.out.println("Reprovado! " + media);
        }
    }
}