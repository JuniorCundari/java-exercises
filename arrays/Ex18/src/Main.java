import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] yearsOlds = new int[10];
        int olderAge = Integer.MIN_VALUE, youngerAge = Integer.MAX_VALUE;
        int positionOlderAge = 0, positionYoungerAge = 0;

        for (int i = 0; i < yearsOlds.length; i++) {
            System.out.print("Informe a idade da " + (i + 1) + "° pessoa: ");
            int yearsOld = scan.nextInt();

            yearsOlds[i] = yearsOld;

            if (yearsOlds[i] > olderAge) {
                positionOlderAge = i;
                olderAge = yearsOlds[i];
            }

            if (yearsOlds[i] < youngerAge) {
                positionYoungerAge = i;
                youngerAge = yearsOlds[i];
            }
        }

        System.out.println("Mais novo: " + youngerAge + " anos e sua posição no array é: " + positionYoungerAge);
        System.out.println("Mais velho: " + olderAge + " anos e sua posição no array é: " + positionOlderAge);
    }
}