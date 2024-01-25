import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] vetorA = new double[20];

        System.out.print("Digite a cotação do dólar em relação ao real (R$): ");
        double cotacaoDolar = scan.nextDouble();

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = cotacaoDolar * (i + 1);
            System.out.println("Conversão: " + (i + 1) + " dólar -> " + vetorA[i] + " reais");
        }
    }
}