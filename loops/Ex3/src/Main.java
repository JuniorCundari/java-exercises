import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome (min 3 caract): ");
        String name = scan.next();

        while (name.length() < 3) {
            System.out.println("Seu nome deve conter no mínimo 3 caracteres!");

            System.out.print("Digite seu nome (max 3 caract): ");
            name = scan.next();
        }

        System.out.print("Digite sua idade (0 - 150): ");
        int yearsOld = scan.nextInt();

        while (yearsOld < 0 || yearsOld > 150) {
            System.out.println("Sua idade deve estar entre 0 e 150 anos!");

            System.out.print("Digite sua idade (0 - 150): ");
            yearsOld = scan.nextInt();
        }

        System.out.print("Digite seu salário (maior que zero): ");
        double wage = scan.nextDouble();

        while (wage < 0) {
            System.out.println("Informe um salário maior que 0!");

            System.out.print("Digite seu salário (maior que zero): ");
            wage = scan.nextInt();
        }

        System.out.print("Informe seu sexo (M - F): ");
        String gender = scan.next();

        while (
                !gender.equalsIgnoreCase("M") &&
                !gender.equalsIgnoreCase("F")
        ) {
            System.out.println("Informe seu sexo corretamente!");

            System.out.print("Informe seu sexo (M - F): ");
            gender = scan.next();
        }

        System.out.println("Informe seu estado civil: ");
        System.out.println(
                "s - Solteiro(a)\n" +
                "c - Casado(a)\n" +
                "v - Viúvo(a)\n" +
                "d - Divorciado(a)"
        );
        String status = scan.next();

        while (
                !status.equalsIgnoreCase("s") &&
                !status.equalsIgnoreCase("c") &&
                !status.equalsIgnoreCase("v") &&
                !status.equalsIgnoreCase("d")
        ) {
            System.out.println("Informe seu estado civil corretamente!");

            System.out.println("Informe seu estado civil: ");
            System.out.println(
                    "s - Solteiro(a)\n" +
                    "c - Casado(a)\n" +
                    "v - Viúvo(a)\n" +
                    "d - Divorciado(a)"
            );
            status = scan.next();
        }

        System.out.println("Seu nome é: " + name);
        System.out.println("Sua idade é: " + yearsOld);
        System.out.println("Seu salário é: " + wage);
        System.out.println("Seu sexo é: " + gender);
        System.out.println("Seu estado civil é: " + status);

    }
}