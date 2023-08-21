import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Valor mínimo: R$ 10,00");
        System.out.println("Valor máximo: R$ 600,00");

        System.out.print("Qual o valor do saque que deseja realizar? ");
        int saque = scan.nextInt();

        System.out.println(" ");

        if (saque >= 10 && saque <= 600) {
            int cem = saque / 100;
            int restoCem = saque % 100;

            int cinquenta = restoCem / 50;
            int restoCinquenta = restoCem % 50;

            int dez = restoCinquenta / 10;
            int restoDez = restoCinquenta % 10;

            int cinco = restoDez / 5;
            int restoCinco = restoDez % 5;

            if (cem != 0) {
                System.out.println(cem + " nota de 100 reais");
            }

            if (cinquenta != 0) {
                System.out.println(cinquenta + " nota de 50 reais");
            }

            if (dez != 0) {
                System.out.println(dez + " nota de 10 reais");
            }

            if (cinco != 0) {
                System.out.println(cinco + " nota de 5 reais");
            }

            if (restoCinco != 0) {
                System.out.println(restoCinco + " nota de 1 reais");
            }
        } else {
            System.out.println("Valor inválido!");
        }
    }
}