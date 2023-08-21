import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        float n1 = scan.nextFloat();

        System.out.println("Digite a segunda nota: ");
        float n2 = scan.nextFloat();

        System.out.println("Digite a terceira nota: ");
        float n3 = scan.nextFloat();

        System.out.println("Digite a quarta nota: ");
        float n4 = scan.nextFloat();

        float media = (n1 + n2 + n3 + n4) / 4;
        DecimalFormat format = new DecimalFormat("##.##");
        String numberFormat = format.format(media);

        System.out.println("A media das nota é: " + numberFormat);

        scan.close();

    }
}