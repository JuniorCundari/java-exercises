package com.junior.ex2;

import java.util.Scanner;

public class TestCourse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Qual o nome do Professor? ");
        String teacherName = scan.nextLine();

        System.out.print("Qual o departamento do Professor? ");
        String teacherDepartmentName = scan.nextLine();

        System.out.print("Qual o email do Professor? ");
        String teacherEmail = scan.nextLine();

        System.out.print("Nome do curso: ");
        String courseName = scan.nextLine();

        System.out.print("Horário do curso: ");
        String courseTime = scan.nextLine();

        Teacher teacher = new Teacher();
        teacher.setName(teacherName);
        teacher.setDepartment(teacherDepartmentName);
        teacher.setEmail(teacherEmail);

        Course course = new Course();
        course.setName(courseName);
        course.setTime(courseTime);
        course.setTeacher(teacher);

        System.out.print("Números de alunos? ");
        int numberStudent = scan.nextInt();

        while (course.isValidNumber(numberStudent)) {
            System.out.print("Números de alunos? ");
            numberStudent = scan.nextInt();
        }

        Student[] students = new Student[numberStudent];

        System.out.print("Informe o número de notas por aluno: ");
        int numberGrades = scan.nextInt();

        while (course.isValidNumber(numberGrades)) {
            System.out.print("Informe o número de notas por aluno: ");
            numberGrades = scan.nextInt();
        }

        double[] grades = new double[numberGrades];

        for (int i = 0; i < students.length; i++) {
            scan.nextLine();

            System.out.print("Nome do aluno: ");
            String studentName = scan.nextLine();

            System.out.print("Matrícula do aluno: ");
            String registrationStudent = scan.nextLine();

            for (int j = 0; j < grades.length; j++) {
                System.out.print((j + 1) + "° nota: ");
                grades[j] = scan.nextDouble();
            }

            Student student = new Student();
            student.setName(studentName);
            student.setRegistration(registrationStudent);
            student.setGrades(grades);

            students[i] = student;
        }

        course.setStudents(students);

        System.out.println(course.getInfo());
    }
}
