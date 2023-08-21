import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quanto você recebe por hora trabalhada? ");
        double horaTrab = scan.nextDouble();

        System.out.print("Quantas horas você trabalhou no mês? ");
        double horaTrabMes = scan.nextDouble();

        double salarioBruto = (horaTrab * horaTrabMes);
        System.out.println("Salário bruto: " + salarioBruto);

        if (salarioBruto <= 900) {
            System.out.println("Você está isento do IR.");

        } else if (salarioBruto <= 1500) {
            double impostoRenda = salarioBruto * ((double) 5 / 100);
            System.out.println("(-) IR (5%) " + " : R$ " + impostoRenda);

            double sindicato = salarioBruto * ((double) 3 / 100);
            System.out.println("(-) Sindicato (3%) " + " : R$ " + sindicato);

            double inss = salarioBruto * ((double) 10 / 100);
            System.out.println("(-) INSS (10%) " + " : R$ " + inss);

            double fgts = salarioBruto * ((double) 11 / 100);
            System.out.println("FGTS (11%) " + " : R$ " + fgts);

            double totalDesc = impostoRenda + sindicato + inss;
            System.out.println("Total de descontos : " + totalDesc);

            double salarioLiq = salarioBruto - totalDesc;
            System.out.println("Salário Liquido : " + salarioLiq);

        } else if (salarioBruto <= 2500) {
            double impostoRenda = salarioBruto * ((double) 10 / 100);
            System.out.println("(-) IR (10%) " + " : R$ " + impostoRenda);

            double sindicato = salarioBruto * ((double) 3 / 100);
            System.out.println("(-) Sindicato (3%) " + " : R$ " + sindicato);

            double inss = salarioBruto * ((double) 10 / 100);
            System.out.println("(-) INSS (10%) " + " : R$ " + inss);

            double fgts = salarioBruto * ((double) 11 / 100);
            System.out.println("FGTS (11%) " + " : R$ " + fgts);

            double totalDesc = impostoRenda + sindicato + inss;
            System.out.println("Total de descontos : " + totalDesc);

            double salarioLiq = salarioBruto - totalDesc;
            System.out.println("Salário Liquido : " + salarioLiq);

        } else {
            double impostoRenda = salarioBruto * ((double) 20 / 100);
            System.out.println("(-) IR (20%) " + " : R$ " + String.format("%.2f", impostoRenda));

            double sindicato = salarioBruto * ((double) 3 / 100);
            System.out.println("(-) Sindicato (3%) " + " : R$ " + String.format("%.2f", sindicato));

            double inss = salarioBruto * ((double) 10 / 100);
            System.out.println("(-) INSS (10%) " + " : R$ " + String.format("%.2f", inss));

            double fgts = salarioBruto * ((double) 11 / 100);
            System.out.println("FGTS (11%) " + " : R$ " + String.format("%.2f", fgts));

            double totalDesc = impostoRenda + sindicato + inss;
            System.out.println("Total de descontos : " + String.format("%.2f", totalDesc));

            double salarioLiq = salarioBruto - totalDesc;
            System.out.println("Salário Liquido : " + String.format("%.2f", salarioLiq));
        }
        scan.close();
    }
}