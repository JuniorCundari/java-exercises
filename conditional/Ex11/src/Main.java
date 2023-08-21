import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o salário atual: ");
        double salario = scan.nextDouble();

        if (salario <= 280) {
            System.out.println("Salário antes do reajuste: " + salario);
            System.out.println("Percentual de aumento aplicado de 20%");
            double aumento = salario * ((double) 20 / 100);
            System.out.println("Valor do aumento: " + aumento);
            double novoSalario = salario + aumento;
            System.out.println("Novo sálario: " + novoSalario);
        } else if (salario > 280 && salario <= 700) {
            System.out.println("Salário antes do reajuste: " + salario);
            System.out.println("Percentual de aumento aplicado de 15%");
            double aumento = salario * ((double) 15 / 100);
            System.out.println("Valor do aumento: " + aumento);
            double novoSalario = salario + aumento;
            System.out.println("Novo sálario: " + novoSalario);
        } else if (salario > 700 && salario <= 1500) {
            System.out.println("Salário antes do reajuste: " + salario);
            System.out.println("Percentual de aumento aplicado de 10%");
            double aumento = salario * ((double) 10 / 100);
            System.out.println("Valor do aumento: " + aumento);
            double novoSalario = salario + aumento;
            System.out.println("Novo sálario: " + novoSalario);
        } else {
            System.out.println("Salário antes do reajuste: " + salario);
            System.out.println("Percentual de aumento aplicado de 5%");
            double aumento = salario * ((double) 5 / 100);
            System.out.println("Valor do aumento: " + aumento);
            double novoSalario = salario + aumento;
            System.out.println("Novo sálario: " + novoSalario);
        }

        scan.close();
    }
}