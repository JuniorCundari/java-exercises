import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.print("Informe a segunda nota: ");
        double nota2 = scan.nextDouble();

        System.out.println(" ");
        System.out.println("Primeira nota: " + nota1);
        System.out.println("Segunda nota: " + nota2);

        double media = (nota1 + nota2) / 2;
        System.out.println("Média: " + media);

        if (media >= 9 && media <= 10) {
            System.out.println("Conceito A");
            System.out.println("APROVADO");
        } else if (media >= 7.5 && media < 9) {
            System.out.println("Conceito B");
            System.out.println("APROVADO");
        } else if (media >= 6 && media < 7.5) {
            System.out.println("Conceito C");
            System.out.println("APROVADO");
        } else if (media >= 4 && media < 6) {
            System.out.println("Conceito D");
            System.out.println("REPROVADO");
        } else {
            System.out.println("Conceito E");
            System.out.println("REPROVADO");
        }
    }
}