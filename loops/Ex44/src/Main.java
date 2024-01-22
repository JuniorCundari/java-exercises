import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String option1 = "José";
        String option2 = "João";
        String option3 = "Amanda";
        String option4 = "Marina";
        String option5 = "Voto nulo";
        String option6 = "Voto em branco";

        System.out.println("----------------------------------------------------");
        System.out.println("Candidatos");
        System.out.println("----------------------------------------------------");

        System.out.printf("%-2s%-2s%-2s\n","N°", "", "Nome");
        System.out.printf("%-2s%-2s%-2s\n","1", "-", option1);
        System.out.printf("%-2s%-2s%-2s\n","2", "-", option2);
        System.out.printf("%-2s%-2s%-2s\n","3", "-", option3);
        System.out.printf("%-2s%-2s%-2s\n","4", "-", option4);
        System.out.printf("%-2s%-2s%-2s\n","5", "-", option5);
        System.out.printf("%-2s%-2s%-2s\n","6", "-", option6);

        System.out.println("----------------------------------------------------");
        System.out.println("Para encerrar basta digitar 0!");
        System.out.println("----------------------------------------------------");

        int end = 1;
        int candidate1 = 0, candidate2 = 0, candidate3 = 0,
                candidate4 = 0, nullVote = 0, blankVote = 0;
        int totalVotes = 0;
        int percentageNullVote = 0, percentageBlankVote = 0;

        while (end > 0) {
            System.out.print("Qual o seu voto? ");
            int vote = scan.nextInt();
            end = vote;

            if (vote == 0) {
                break;
            }

            if (vote >= 1 && vote <= 6) {
                if (vote == 1) {
                    candidate1++;
                    totalVotes++;
                } else if (vote == 2) {
                    candidate2++;
                    totalVotes++;
                } else if (vote == 3) {
                    candidate3++;
                    totalVotes++;
                } else if (vote == 4) {
                    candidate4++;
                    totalVotes++;
                } else if (vote == 5) {
                    nullVote++;
                    totalVotes++;
                } else {
                    blankVote++;
                    totalVotes++;
                }
            } else {
                System.out.println("--------------------------------------");
                System.out.println("Informe o número do candidato correto!");
                System.out.println("--------------------------------------");
            }

            percentageNullVote = (nullVote * 100) / totalVotes;
            percentageBlankVote = (blankVote * 100) / totalVotes;
        }

        System.out.println("--------------------------------------");

        System.out.println(option1 + ": " + candidate1 + " votos!");
        System.out.println(option2 + ": " + candidate2 + " votos!");
        System.out.println(option3 + ": " + candidate3 + " votos!");
        System.out.println(option4 + ": " + candidate4 + " votos!");
        System.out.println(option5 + ": " + nullVote + " votos!");
        System.out.println(option6 + ": " + blankVote + " votos!");
        System.out.println("--------------------------------------");
        System.out.println("Total de votos: " + totalVotes + " votos!");
        System.out.println("Porcentagem de votos nulos: " + percentageNullVote + "%");
        System.out.println("Porcentagem de votos nulos: " + percentageBlankVote + "%");
    }
}