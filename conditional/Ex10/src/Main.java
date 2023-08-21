import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o turno em que você estuda: ");
        System.out.println("M - Matutuno ou V - Vespertino ou N - Noturno");
        String turno = scan.next();

        switch (turno.toUpperCase()) {
            case "M": System.out.println("Bom dia!");
                        break;
            case "V": System.out.println("Boa tarde!");
                        break;
            case "N": System.out.println("Boa noite!");
                        break;
            default: System.out.println("Digite um turno correto!");
        }

        scan.close();
    }
}