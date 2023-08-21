import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora?");
        double hora = scanner.nextDouble();

        System.out.println("Quanto foi o total de horas trabalhadas no mês?");
        double horaMes = scanner.nextDouble();

        double salarioBruto = hora * horaMes;
        System.out.println("Sálario bruto: " + salarioBruto);

        double inss = (salarioBruto / 100) * 11;
        System.out.println("Valor pago ao INSS: " + inss);

        double sindicato = (salarioBruto / 100) * 5;
        System.out.println("Valor pago ao Sindicato: " + sindicato);

        double salarioLiquido = salarioBruto - (inss + sindicato);
        System.out.println("Sálario liquido: " + salarioLiquido);

        scanner.close();
    }
}