import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor da dívida: ");
        float valorDivida = scan.nextFloat();

        float valorDividaPorParcela;
        int valorJuros = 0;
        int qtdParcelas = 1;
        float valorParcela;
        float juros = 10;

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.printf("%-20s%-20s%-27s%-20s\n",
                "Valor da dívida", "Valor do juros", "Quantidade de parcelas", "Valor da parcela");
        System.out.println("--------------------------------------------------------------------------------------");

        System.out.printf("%-20s%-20s%-27s%-20s\n", "R$ " + String.format("%.2f",valorDivida), valorJuros, qtdParcelas, "R$ " + String.format("%.2f",valorDivida));

        for (int i = 3; i <= 12; i+=3, juros+=5) {
            valorJuros = (int) (valorDivida * (juros / 100));
            valorDividaPorParcela = valorDivida + valorJuros;
            valorParcela = valorDividaPorParcela / i;

            System.out.printf("%-20s%-20s%-27s%-20s\n", "R$ " + String.format("%.2f", valorDividaPorParcela), valorJuros, i, "R$ " + String.format("%.2f", valorParcela));
        }
    }
}