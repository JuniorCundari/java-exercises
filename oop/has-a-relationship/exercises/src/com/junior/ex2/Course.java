package com.junior.ex2;

public class Course {
    private String name;
    private String time;
    private Teacher teacher;
    private Student[] students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getInfo() {
        String info = "Nome do curso: " + name + "\n";

        if (teacher != null) {
            info += "\n";
            info += teacher.getInfo();
        }

        if (students != null) {
            System.out.println("----- Alunos -----");

            for (Student student : students) {
                if (student != null) {
                    info += student.getInfo();
                    info += "\n";
                }
            }

            info += "\nMédia da turma: " + getClassAverage();
        }

        return info;
    }

    public double getClassAverage() {
        double sum = 0;

        for (Student student : students) {
            if (student != null) {
                sum += student.getAverage();
            }
        }

        return sum / students.length;
    }

    public boolean isValidNumber(int number) {
        boolean valid = true;

        if (number < 0) {
            valid = false;
            System.out.println("-------------------------");
            System.out.println("Informe um número válido!");
            System.out.println("-------------------------");
        }

        return !valid;
    }
}
