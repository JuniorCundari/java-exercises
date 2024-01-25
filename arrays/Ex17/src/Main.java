import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] yearsOlds = new int[10];
        int countHigher = 0;

        for (int i = 0; i < yearsOlds.length; i++) {
            System.out.print("Informe a idade da " + (i + 1) + "° pessoa: ");
            int yearsOld = scan.nextInt();

            yearsOlds[i] = yearsOld;

            if (yearsOlds[i] > 35) {
                countHigher++;
            }
        }

        System.out.print("Quantidade de pessoas que possuem idade superior a 35 anos: " + countHigher);
    }
}