import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.println("Qual o tamanho de um lado do seu quadrado?");
        float quadrado = scaner.nextFloat();

        float area = (float) Math.pow(quadrado, 2);
        float dobro = area * 2;
        System.out.println("O dobro desta área é: " + dobro);

        scaner.close();
    }
}