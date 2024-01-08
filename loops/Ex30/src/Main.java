import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o preço do pão: ");
        float price = scan.nextFloat();

        System.out.println("--------------------------------------------");
        System.out.println("Preço do pão: R$ " + price);
        System.out.println("Panificadora Pão de Ontem - Tabela de preços");

        for (int i = 1; i <= 50; i++) {
            System.out.printf(i + " - R$ %.2f %n", (price * i));
        }
    }
}