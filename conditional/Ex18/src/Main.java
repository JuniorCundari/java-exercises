import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a data: (dd/mm/aaaa) ");
        String data = scan.next();

        if (Integer.parseInt(data.substring(0, 2)) <= 31) {
            if (Integer.parseInt(data.substring(3, 5)) <= 12) {
                if (data.length() == 10) {
                    System.out.println("Data válida! " + data);
                } else {
                    System.out.println("Data inválida!");
                }
            } else {
                System.out.println("Data inválida!");
            }
        } else {
            System.out.println("Data inválida!");
        }
    }
}