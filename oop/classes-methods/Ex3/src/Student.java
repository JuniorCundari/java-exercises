public class Student {
    String name;
    String registration;
    String course;
    String[] subjects;
    double[][] grades;

    void showInformation() {
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

    double getAverage(int index) {
        double sum = 0, average;

        for (int i = 0; i < grades[index].length; i++) {
            sum += grades[index][i];
        }

        average = sum / grades.length;

        return average;
    }

    boolean checkStudentApproved(int index) {
        return getAverage(index) >= 7;
    }
}
