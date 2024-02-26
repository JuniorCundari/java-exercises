import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Informe seu nome: ");
        student.name = scan.next();
        scan.nextLine();

        System.out.print("Informe seu registro de matrícula: ");
        student.registration = scan.next();
        scan.nextLine();

        System.out.print("Qual seu curso? ");
        student.course = scan.next();
        scan.nextLine();

        System.out.print("Quantas materias são? ");
        int numberSubjects = scan.nextInt();

        student.subjects = new String[numberSubjects];

        for (int i = 0; i < student.subjects.length; i++) {
            System.out.print("Informe o nome da " + (i + 1) + "° materia: ");
            student.subjects[i] = scan.next();
            scan.nextLine();
        }

        System.out.println("---------------------------------------");

        System.out.print("Quantas notas são? ");
        int numberGrades = scan.nextInt();

        student.grades = new double[numberSubjects][numberGrades];

        for (int i = 0; i < student.grades.length; i++) {
            System.out.println("---------------------------------------");
            System.out.print("Nota da disciplina " + student.subjects[i]);
            System.out.println("\n---------------------------------------");

            for (int j = 0; j < student.grades[i].length; j++) {
                System.out.print("Digite a " + (j + 1) + "° nota (0 - 10): ");
                student.grades[i][j] = scan.nextDouble();

                while (student.grades[i][j] < 0 || student.grades[i][j] > 10) {
                    System.out.println("---------------------------------------");
                    System.out.println("Nota incorreta! Informe notas de 0 à 10");
                    System.out.println("---------------------------------------");
                    System.out.print("Digite a " + (j + 1) + "° nota: ");
                    student.grades[i][j] = scan.nextDouble();
                }
            }
        }

        System.out.println("---------------------------------------");

        student.showInformation();

        System.out.println("---------------------------------------");

        for (int i = 0; i < student.subjects.length; i++) {
            if (student.checkStudentApproved(i)) {
                System.out.println("Disciplina " + student.subjects[i] + " -> Aprovado");
            } else {
                System.out.println("Disciplina " + student.subjects[i] + " -> Reprovado");
            }
        }
    }
}