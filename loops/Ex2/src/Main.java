import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome de usuário: ");
        String name = scan.next();

        System.out.print("Digite sua senha: ");
        String password = scan.next();

        while (Objects.equals(password, name)) {
            System.out.println("Inválido!");

            System.out.print("Digite seu nome de usuário: ");
            name = scan.next();

            System.out.print("Digite sua senha: ");
            password = scan.next();
        }

    }
}