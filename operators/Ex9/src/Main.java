import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Farenheit que deseja converter em Celsius: ");
        float farenheit = scanner.nextFloat();

        float celsius = (5 * (farenheit - 32)) / 9;
        System.out.println("A conversão para Celsius é: " + celsius + "°C");

        scanner.close();
    }
}