import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Para o candidato1 vote -> 1");
        System.out.println("Para o candidato2 vote -> 2");
        System.out.println("Para o candidato3 vote -> 3");

        System.out.println("--------------------------------------");

        System.out.print("Informe o número total de eleitores: ");
        int voters = scan.nextInt();

        while (voters <= 0) {
            System.out.print("Informe o número total de eleitores: ");
            voters = scan.nextInt();
        }

        int candidate1 = 0, candidate2 = 0, candidate3 = 0;

        for (int i = 1; i <= voters; i++) {
            System.out.print(i + "° voto: ");
            int vote = scan.nextInt();

            while (vote < 0 || vote > 3) {
                System.out.println("Informe o número do candidato correto!");

                System.out.print(i + "° voto: ");
                vote = scan.nextInt();
            }

            if (vote == 1) {
                candidate1++;
            } else if (vote == 2) {
                candidate2++;
            } else {
                candidate3++;
            }
        }

        System.out.println("--------------------------------------");

        System.out.println("O candidato1 teve " + candidate1 + " votos!");
        System.out.println("O candidato2 teve " + candidate2 + " votos!");
        System.out.println("O candidato3 teve " + candidate3 + " votos!");

    }
}