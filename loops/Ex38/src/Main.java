import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o salário inicial: ");
        float salary = scan.nextFloat();

        System.out.print("Qual o ano inicial: ");
        int yearIni = scan.nextInt();

        System.out.print("Qual o ano atual? ");
        int yearCurrent = scan.nextInt();

        System.out.print("Qual a porcentagem de aumento? (%) ");
        double percent = scan.nextDouble() / 100;

        for (int i = yearIni; i <= yearCurrent; i++) {
            if (i > yearIni) {
                salary = (float) (salary * percent) + salary;
                percent *= 2;
            }

            System.out.println("Ano: " + i + " --> Salário: R$ " + salary);
        }
    }
}