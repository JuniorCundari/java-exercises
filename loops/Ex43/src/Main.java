import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("----------------------------------------------------");
        System.out.printf("%-25s%-10s%-10s\n","Espefificação", "Código", "Preço");
        System.out.println("----------------------------------------------------");

        System.out.printf("%-25s%-10s%-10s\n", "Cachorro Quente", "100", "R$ 1,20");
        System.out.printf("%-25s%-10s%-10s\n", "Bauru Simples", "101", "R$ 1,30");
        System.out.printf("%-25s%-10s%-10s\n", "Bauru com ovo", "102", "R$ 1,50");
        System.out.printf("%-25s%-10s%-10s\n", "Hambúrguer", "103", "R$ 1,20");
        System.out.printf("%-25s%-10s%-10s\n", "Cheeseburguer", "104", "R$ 1,30");
        System.out.printf("%-25s%-10s%-10s\n", "Refrigerante", "105", "R$ 1,00");

        System.out.println("--------------------------------------------------------");
        System.out.println("Obs: Para encerrar informe o número 0 no código do item!");
        System.out.println("--------------------------------------------------------");

        float total = 0;
        int totalItems = 0;
        int code = 1;

        while (code > 0) {
            System.out.print("Informe o código do item: ");
            code = scan.nextInt();

            if (code == 0) {
                break;
            }

            if (code >= 100 && code <= 105) {
                System.out.print("Qual a quantidade que você deseja? ");
                int amount = scan.nextInt();

                if (amount == 0) {
                    System.out.println("----------------------------");
                    System.out.println("A quantidade não pode ser 0!");
                    System.out.println("----------------------------");
                    continue;
                }

                if (code == 100) {
                    total = (float) (1.20 * amount) + total;
                    totalItems += amount;
                } else if (code == 101) {
                    total = (float) (1.30 * amount) + total;
                    totalItems += amount;
                } else if (code == 102) {
                    total = (float) (1.50 * amount) + total;
                    totalItems += amount;
                } else if (code == 103) {
                    total = (float) (1.20 * amount) + total;
                    totalItems += amount;
                } else if (code == 104) {
                    total = (float) (1.30 * amount) + total;
                    totalItems += amount;
                } else {
                    total = (float) (1.00 * amount) + total;
                    totalItems += amount;
                }
            } else {
                System.out.println("----------------------------------");
                System.out.println("Infome um código válido!");
                System.out.println("----------------------------------");
            }
        }

        System.out.println("----------------------------------------------------");

        System.out.println("Quantidade de itens: " + totalItems);
        System.out.println("Total à pagar: R$ " + total);
    }
}