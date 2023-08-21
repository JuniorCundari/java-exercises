import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Responda: 'S' para Sim ou 'N' para Não");

        System.out.print("Telefonou para a vítima? ");
        String res1 = scan.next();

        System.out.print("Esteve no local do crime? ");
        String res2 = scan.next();

        System.out.print("Mora perto da vítima? ");
        String res3 = scan.next();

        System.out.print("Devia para a vítima? ");
        String res4 = scan.next();

        System.out.print("Já trabalhou com a vítima? ");
        String res5 = scan.next();

        int result = 0;

        if (Objects.equals(res1, "S")) {
            result++;
        }

        if (Objects.equals(res2, "S")) {
            result++;
        }

        if (Objects.equals(res3, "S")) {
            result++;
        }

        if (Objects.equals(res4, "S")) {
            result++;
        }

        if (Objects.equals(res5, "S")) {
            result++;
        }

        if (result == 5) {
            System.out.println("Assassino");
        } else if (result == 3 || result == 4) {
            System.out.println("Cúmplice");
        } else if (result == 2) {
            System.out.println("Suspeita");
        } else {
            System.out.println("Inocente");
        }
    }
}