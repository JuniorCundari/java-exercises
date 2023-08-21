import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("1 - Domingo");
        System.out.println("2 - Segunda-feira");
        System.out.println("3 - Terça-feira");
        System.out.println("4 - Quarta-feira");
        System.out.println("5 - Quinta-feira");
        System.out.println("6 - Sexta-feira");
        System.out.println("7 - Sábado");

        System.out.print("Digite o dia da semana: ");
        int diaSemana = scan.nextInt();

        switch (diaSemana) {
            case 1: System.out.println("Domingo");
            break;

            case 2: System.out.println("Segunda-feira");
            break;

            case 3: System.out.println("Terça-feira");
            break;

            case 4: System.out.println("Quarta-feira");
            break;

            case 5: System.out.println("Quinta-feira");
            break;

            case 6: System.out.println("Sexta-feira");


            case 7: System.out.println("Sábado");
            break;

            default: System.out.println("Valor inválido!");
        }
    }
}