package com.junior.ex3;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Informe seu nome: ");
        student.setName(scan.next());

        System.out.print("Informe seu registro de matrícula: ");
        student.setRegistration(scan.next());

        System.out.print("Qual seu curso? ");
        student.setCourse(scan.next());

        System.out.print("Quantas materias são? ");
        student.setNumberSubjects(scan.nextInt());

        // student.subjects = new String[numberSubjects];

        for (int i = 0; i < student.getSubjects().length; i++) {
            System.out.print("Informe o nome da " + (i + 1) + "° materia: ");
            student.setSubjectsPosition(i, scan.next());
        }

        System.out.println("---------------------------------------");

        System.out.print("Quantas notas são? ");
        student.setNumberGrades(scan.nextInt());

        // student.grades = new double[numberSubjects][numberGrades];

        for (int i = 0; i < student.getGrades().length; i++) {
            System.out.println("---------------------------------------");
            System.out.print("Nota da disciplina " + student.getSubjects()[i]);
            System.out.println("\n---------------------------------------");

            for (int j = 0; j < student.getGrades()[i].length; j++) {
                System.out.print("Digite a " + (j + 1) + "° nota (0 - 10): ");
                student.setGradePosition(i, j, scan.nextDouble());

                while (student.getGrades()[i][j] < 0 || student.getGrades()[i][j] > 10) {
                    System.out.println("---------------------------------------");
                    System.out.println("Nota incorreta! Informe notas de 0 à 10");
                    System.out.println("---------------------------------------");
                    System.out.print("Digite a " + (j + 1) + "° nota: ");
                    student.setGradePosition(i, j, scan.nextDouble());
                }
            }
        }

        System.out.println("---------------------------------------");

        student.showInformation();

        System.out.println("---------------------------------------");

        for (int i = 0; i < student.getSubjects().length; i++) {
            if (student.checkStudentApproved(i)) {
                System.out.println("Disciplina " + student.getSubjects()[i] + " -> Aprovado");
            } else {
                System.out.println("Disciplina " + student.getSubjects()[i] + " -> Reprovado");
            }
        }
    }
}
