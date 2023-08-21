import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o sexo que você se identifica: ");
        String sexo = scan.next().toUpperCase();

        switch (sexo) {
            case "M":
                System.out.println("M - Masculino");
                break;
            case "F":
                System.out.println("F - Feminino");
                break;
            default:
                System.out.println("Sexo Inválido!");
        }

        scan.close();
    }
}