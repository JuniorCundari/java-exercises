import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // maior que 50kg paga multa de 4 reais por quilo excedente
        Scanner scanner = new Scanner(System.in);

        int pesoMax = 50;

        System.out.println("Informe o peso total dos peixes: ");
        double pesoPeixe = scanner.nextDouble();

        if (pesoPeixe > pesoMax) {
            double excesso = pesoPeixe - pesoMax;
            double multa = excesso * 4;
            System.out.println("O excesso de peso foi: " + excesso + "kg " + "E a multa que você pagará é: " + "R$" + multa);
        } else {
            System.out.println("Não teve excesso, então não precisa pagar multa");
        }

        scanner.close();
    }
}