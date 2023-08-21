import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Numeração decimal: ");
        int numero = scan.nextInt();

        int centenas = numero / 100;
        int dezenas = (numero % 100) / 10;
        int unidades = (numero % 100) % 10;

        if (numero >= 100 && numero < 1000) {
            System.out.println(
                    numero
                            + " = "
                            + centenas + " centenas, "
                            + dezenas + " dezenas, "
                            + unidades + " unidades"
            );
        } else if (numero >= 10 && numero < 100) {
            System.out.println(
                    numero
                            + " = "
                            + dezenas + " dezenas, "
                            + unidades + " unidades"
            );
        } else {
            System.out.println("Informe um número menor que 1000");
        }

    }
}