import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int count = 0;

        System.out.print("Qual o número de população do país A? ");
        double countryA = scan.nextDouble();

        while (countryA <= 0) {
            System.out.println("-------------------------------");
            System.out.println("Número de população não pode ser zero!");
            System.out.println("-------------------------------");

            System.out.print("Qual o número de população do país A? ");
            countryA = scan.nextDouble();
        }

        System.out.print("Qual a taxa de crescimento do páis A? ");
        float rateA = scan.nextFloat();

        System.out.print("Qual o número de população do país B? ");
        double countryB = scan.nextDouble();

        while (countryB <= 0 || countryB < countryA) {
            System.out.println("-------------------------------");
            System.out.println("Número de população não pode ser zero e número de população A não pode ser maior do que o número de população B!");
            System.out.println("-------------------------------");

            System.out.print("Qual o número de população do país B? ");
            countryB = scan.nextDouble();
        }

        System.out.print("Qual a taxa de crescimento do páis B? ");
        float rateB = scan.nextFloat();

        while (countryA < countryB) {
            countryA += countryA * (rateA / 100);
            countryB += countryB * (rateB / 100);

            count++;
        }

        System.out.println("-------------------------------");
        System.out.printf("País A: %.0f %n", countryA);
        System.out.printf("País B: %.0f %n", countryB);
        System.out.println("País A ultrapassará ou igualará o país B em " + count + " anos");
    }
}