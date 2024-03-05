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
    }
}
