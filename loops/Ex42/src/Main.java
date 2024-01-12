import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numbers = 1;
        int interval1 = 0, interval2 = 0, interval3 = 0, interval4 = 0;

        while (numbers >= 0) {
            System.out.print("Digite números positivos [0-100]: ");
            numbers = scan.nextInt();

            if (numbers >= 0) {
                if (numbers <= 25) {
                    interval1++;
                } else if (numbers <= 50) {
                    interval2++;
                } else if (numbers <= 75) {
                    interval3++;
                } else if (numbers <= 100) {
                    interval4++;
                } else {
                    System.out.println("Número máximo 100! Tente novamente");
                }
            }
        }

        System.out.println("--------------------------------------------------------");

        System.out.println("O intervalo entre [0-25] teve " + interval1 + " números");
        System.out.println("O intervalo entre [26-50] teve " + interval2 + " números");
        System.out.println("O intervalo entre [51-75] teve " + interval3 + " números");
        System.out.println("O intervalo entre [76-100] teve " + interval4 + " números");
    }
}