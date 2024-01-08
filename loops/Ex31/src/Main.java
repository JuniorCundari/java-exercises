import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float product = 1, total = 0, money;
        int count = 1;

        System.out.println("Lojas Tabajara");

        while (true) {
            while (product > 0) {
                System.out.print("Produto " + count + ": R$ ");
                product = scan.nextFloat();

                total += product;
                count++;
            }

            System.out.println("------------------------------");

            System.out.println("Total: R$ " + total);
            System.out.print("Dinheiro: R$ ");
            money = scan.nextFloat();
            System.out.println("Troco: R$ " + (money - total));

            System.out.println("------------------------------");

            System.out.print("Deseja continuar? (0 - sim / 1 - não) ");
            int next = scan.nextInt();

            if (next == 0) {
                product = 1;
                count = 1;
            } else {
                System.out.println("Encerrado");
                break;
            }
        }
    }
}