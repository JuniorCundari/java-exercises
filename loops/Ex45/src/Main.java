import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("----------------------------");
        System.out.println("Professor");
        System.out.println("----------------------------");
        System.out.print("Quantas questões tem a prova? ");
        int numberQuestions = scan.nextInt();

        System.out.println("----------------------------");

        String[] template = new String[numberQuestions];

        for (int i = 0; i < template.length; i++) {
            System.out.print("Resposta da Questão " + (i + 1) + ": ");
            template[i] = scan.next().toUpperCase();
        }

        System.out.println("----------------------------");
        System.out.println("Gabarito da prova:");
        for (int i = 0; i < template.length; i++) {
            System.out.printf("%-2s%-2s%-2s\n", (i + 1), "-", template[i]);
        }

        int end = 0;
        int bigger = Integer.MIN_VALUE, lower = Integer.MAX_VALUE;
        int totalStudent = 0;
        int sumTotalHits = 0;

        System.out.println("------------------------------");
        System.out.println("Aluno");
        System.out.println("------------------------------");

        while (end == 0) {
            int totalNumberHits = 0;

            for (int i = 0; i < template.length; i++) {
                System.out.print("Resposta da " + (i + 1) + "° questão: ");
                String resStudent = scan.next().toUpperCase();

                if (resStudent.equals("A") || resStudent.equals("B")
                                || resStudent.equals("C") || resStudent.equals("D")
                                || resStudent.equals("E")) {
                    if (resStudent.equals(template[i])) {
                        totalNumberHits++;
                    }
                } else {
                    System.out.println("---------------");
                    System.out.println("Letra inválida!");
                    System.out.println("---------------");

                    i--;
                }
            }

            if (totalNumberHits > bigger) {
                bigger = totalNumberHits;
            }

            if (totalNumberHits < lower) {
                lower = totalNumberHits;
            }

            System.out.println("---------------------");
            System.out.println("Total de acertos: " + totalNumberHits);
            System.out.println("Nota: " + totalNumberHits);
            System.out.println("---------------------");

            System.out.print("Continuar com outro aluno? (0 - Sim / 1 - Não) ");
            end = scan.nextInt();

            totalStudent++;
            sumTotalHits += totalNumberHits;
        }

        float averageClass = (float) sumTotalHits / totalStudent;

        System.out.println("----------------------------------");
        System.out.println("Maior acerto: " + bigger);
        System.out.println("Menor acerto: " + lower);
        System.out.println("Total de alunos: " + totalStudent);
        System.out.println("Média das notas da turma: " + averageClass);
        System.out.println("----------------------------------");
    }
}