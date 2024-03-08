package com.junior.ex2;

public class Student {
    private String name;
    private String registration;
    private double[] grades;

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

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public String getInfo() {
        String info = "Nome aluno: " + name + " - ";
        info += "Matrcula: " +  registration + " - ";
        info += "Notas: ";

        double sum = 0;

        for (double grade : grades) {
            sum += grade;
            info += grade + " | ";
        }

        double average = sum / grades.length;
        info += "\n" + "Média: " + average + " - ";

        if (average >= 7) {
            info += "Aprovado";
        } else {
            info += "Reprovado";
        }

        return info;
    }

    public double getAverage() {
        double sum = 0;

        for (double grade : grades) {
            sum += grade;
        }

        return sum / grades.length;
    }
}
