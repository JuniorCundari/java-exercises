import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius que deseja converter em Farenheit: ");
        float celsius = scanner.nextFloat();

        float farenheit = celsius * ((float) 9 / 5) + 32;
        System.out.println("A conversão para Celsius é: " + farenheit + "°F");

        scanner.close();
    }
}