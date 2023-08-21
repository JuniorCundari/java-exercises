import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto é a área em metros quadrados a ser pintada?");
        double area = scanner.nextDouble();

        // 1 litro para cada 3 metros quadrados
        // latas de 18 litros a R$ 80
        // quantas latas de tinta? e o preço total?

        double litros = Math.pow(area, 2) / Math.pow(3, 2);
        double litroNec = litros / 18;
        double total = litroNec * 80;

        System.out.println("O número de latas necessarias é: " + litroNec);
        System.out.println("O preço total: " + total);

        scanner.close();
    }
}