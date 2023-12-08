import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a base da potenciação: ");
        int base = scan.nextInt();

        System.out.print("Agora informe o expoente: ");
        int exp = scan.nextInt();

        int pot = 1;

        for (int i = 1; i <= exp; i++) {
            pot = pot * base;
        }

        System.out.println("A potência é: " + pot);

        // Forma de usar a função de potência própria do java
        /*double pot = Math.pow(base, exp);
        System.out.print(pot);*/
    }
}