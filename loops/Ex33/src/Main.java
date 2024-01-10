import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int count = 0;
        float bigger = Float.MIN_VALUE;
        float smaller = Float.MAX_VALUE;
        float temperature, sum = 0;

        while(true) {
            while (true) {
                System.out.print("Informe a temperatura: ");
                temperature = scan.nextFloat();

                if (temperature <= 0) {
                    break;
                }

                if (temperature > bigger) {
                    bigger = temperature;
                }

                if (temperature < smaller) {
                    smaller = temperature;
                }

                sum += temperature;

                count++;
            }

            System.out.printf("Maior: %.2f %n", bigger);
            System.out.printf("Menor: %.2f %n", smaller);
            System.out.printf("Média: %.2f %n", (sum / count));

            System.out.println("------------------------------");

            System.out.print("Deseja continuar? (0 - sim / 1 - não) ");
            int next = scan.nextInt();

            if (next == 0) {
                count = 0;
                bigger = Float.MIN_VALUE;
                smaller = Float.MAX_VALUE;
                sum = 0;
            } else {
                System.out.println("Encerrado");
                break;
            }
        }
    }
}