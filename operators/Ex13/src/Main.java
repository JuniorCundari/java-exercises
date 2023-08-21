import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu sexo: ");
        System.out.println("use 'M' para Masculino e 'F' para Feminino");
        String sexo = scanner.next();

        System.out.println("Qual seu peso atual?");
        double pesoAtual = scanner.nextDouble();

        if (Objects.equals(sexo, "M")) {
            double homem = (72.7 * altura) - 58;
            System.out.println("O seu peso ideal é: " + homem);

            if (pesoAtual > homem) {
                System.out.println("Você está acima do peso, seu obeso");
            } else {
                System.out.println("Seu peso atual está ótimo");
            }
        } else {
            double mulher = (62.1 * altura) - 44.7;
            System.out.println("O seu peso ideal é: " + mulher);

            if (pesoAtual > mulher) {
                System.out.println("Você está acima do peso, seu obeso");
            } else {
                System.out.println("Seu peso atual está ótimo");
            }
        }

        scanner.close();
    }
}