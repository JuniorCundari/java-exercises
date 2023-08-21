import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora?");
        float hora = scanner.nextFloat();

        System.out.println("Quantas horas você trabalhou no mês?");
        float mes = scanner.nextFloat();

        float total = hora * mes;
        System.out.println("Seu salário nesse mês será: " + "R$" + total);

        scanner.close();
    }
}