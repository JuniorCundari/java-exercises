import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o salário atual: ");
        double salario = scan.nextDouble();

        int percentual = 0;

        if (salario <= 280) {
            percentual = 20;
        } else if (salario > 280 && salario <= 700) {
            percentual = 15;
        } else if (salario > 700 && salario <= 1500) {
            percentual = 10;
        } else {
            percentual = 5;
        }
        
        double aumento = salario * ((double) percentual / 100);
        double salarioAjustado = salario + aumento;
        
        System.out.println("Percentual: " + percentual);
        System.out.println("Valor do aumento: " + aumento);
        System.out.println("Sálario ajustado: " + salarioAjustado);

        scan.close();
    }
}
