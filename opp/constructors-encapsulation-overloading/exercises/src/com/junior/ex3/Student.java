package com.junior.ex3;

public class Student {
    private String name;
    private String registration;
    private String course;
    private String[] subjects;
    private double[][] grades;
    private int numberSubjects;
    private int numberGrades;

    public Student() {}

    public Student(String name, String registration, String course, String[] subjects, double[][] grades, int numberSubjects, int numberGrades) {
        this.name = name;
        this.registration = registration;
        this.course = course;
        this.subjects = subjects;
        this.grades = grades;
        this.numberSubjects = numberSubjects;
        this.numberGrades = numberGrades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public double[][] getGrades() {
        return grades;
    }

    public void setGrades(double[][] grades) {
        this.grades = grades;
    }

    public int getNumberSubjects() {
        return numberSubjects;
    }

    public void setNumberSubjects(int numberSubjects) {
        this.numberSubjects = numberSubjects;
        this.subjects = new String[numberSubjects];
    }

    public int getNumberGrades() {
        return numberGrades;
    }

    public void setNumberGrades(int numberGrades) {
        this.numberGrades = numberGrades;
        this.grades = new double[this.numberSubjects][numberGrades];
    }

    public void showInformation() {
        System.out.println("Nome: " + name);
        System.out.println("Matrícula: " + registration);
        System.out.println("Nome do curso: " + course);

        for (int i = 0; i < grades.length; i++) {
            System.out.println("------------------------");
            System.out.println("Disciplina " + subjects[i]);

            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " | ");
            }

            System.out.println();
        }
    }

    private double getAverage(int index) {
        double sum = 0, average;

        for (int i = 0; i < grades[index].length; i++) {
            sum += grades[index][i];
        }

        average = sum / grades.length;

        return average;
    }

    public boolean checkStudentApproved(int index) {
        return getAverage(index) >= 7;
    }

    public void setSubjectsPosition(int position, String subject) {
        this.subjects[position] = subject;
    }

    public void setGradePosition(int posI, int posJ, double grade) {
        this.grades[posI][posJ] = grade;
    }
}
