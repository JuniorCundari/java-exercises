import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int albums;
        float total = 0;

        do {
            System.out.print("Informe a quantidade de CDs: ");
            albums = scan.nextInt();
        } while (albums <= 0);

        for (int i = 1; i <= albums; i++) {
            float amountPaid;

            do {
                System.out.print("Qual o valor pago no " + i + "° CD: ");
                amountPaid = scan.nextFloat();
            } while (amountPaid <= 0);

            total = total + amountPaid;
        }

        float average = total / albums;
        average = (float) (Math.round(average * 100.0) / 100.0);

        System.out.println("-----------------------------");

        System.out.println("Total gasto: " + total);
        System.out.println("Valor médio: " + average);
    }
}