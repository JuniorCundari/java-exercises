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


        double impostoRenda = 0;
        double sindicato = ((double) 3 / 100);
        double inss = ((double) 10 / 100);
        double fgts = ((double) 11 / 100);

        if (salarioBruto <= 900) {
            System.out.println("Você está isento do IR.");
        } else if (salarioBruto <= 1500) {
            impostoRenda = ((double) 5 / 100);
        } else if (salarioBruto <= 2500) {
            impostoRenda = ((double) 10 / 100);
        } else {
            impostoRenda = ((double) 20 / 100);
        }

        double descontoIR = salarioBruto * impostoRenda;
        double descontoSindicato = salarioBruto * sindicato;
        double descontoINSS = salarioBruto * inss;
        double descontoFGTS = salarioBruto * fgts;
        double totalDesc = descontoIR + descontoSindicato + descontoINSS;
        double salarioLiq = salarioBruto - totalDesc;

        System.out.println("(-) IR (" + impostoRenda + "%) " + " : R$ " + descontoIR);
        System.out.println("(-) Sindicato (3%) " + " : R$ " + descontoSindicato);
        System.out.println("(-) INSS (10%) " + " : R$ " + descontoINSS);
        System.out.println("FGTS (11%) " + " : R$ " + descontoFGTS);
        System.out.println("Total de descontos : " + String.format("%.2f", totalDesc));
        System.out.println("Salário Liquido : " + String.format("%.2f", salarioLiq));

        scan.close();
    }
}