import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a letra que deseja: ");
        String vowel = String.valueOf(scan.next().toLowerCase().charAt(0));

        if (Objects.equals(vowel, "a") || Objects.equals(vowel, "e") || Objects.equals(vowel, "i") || Objects.equals(vowel, "o") || Objects.equals(vowel, "u")) {
            System.out.println("A letra informada é uma vogal!");
        } else {
            System.out.println("A letra informada é uma consoante!");
        }

        scan.close();
    }
}