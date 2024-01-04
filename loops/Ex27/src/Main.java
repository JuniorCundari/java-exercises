import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o número de classes: ");
        int classes = scan.nextInt();
        int sum = 0;

        while (classes <= 0) {
            System.out.println("O número de classes precisa ser diferente de " + classes);
            System.out.print("Informe o número de classes: ");
            classes = scan.nextInt();
        }

        System.out.println("-----------------------------");

        for (int i = 1; i <= classes; i++) {
            System.out.print("Informe o número de alunos da " + i + "° turma: ");
            int students = scan.nextInt();


            while (students > 40) {
                System.out.println("-----------------------------");
                System.out.println("Cada turma só podem ter no máximo 40 alunos!");
                System.out.print("Informe o número de alunos da " + i + "° turma: ");
                students = scan.nextInt();
            }

            sum = sum + students;
        }

        System.out.println("-----------------------------");

        float average = (float) sum / classes;

        System.out.println("O número médio de alunos: " + average);
    }
}