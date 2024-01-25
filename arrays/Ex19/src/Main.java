import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] alunos = new String[5];
        int[] nota1 = new int[alunos.length];
        int[] nota2 = new int[alunos.length];
        int[] result = new int[alunos.length];

        for (int i = 0; i < alunos.length; i++) {
            System.out.print("Digite a 1° nota do " + (i + 1) + "° aluno: ");
            nota1[i] = scan.nextInt();
        }

        System.out.println("------------------------------------------------");

        for (int i = 0; i < alunos.length; i++) {
            System.out.print("Digite a 2° nota do " + (i + 1) + "° aluno: ");
            nota2[i] = scan.nextInt();
        }

        System.out.println("------------------------------------------------");

        for (int i = 0; i < alunos.length; i++) {
            result[i] = (nota1[i] + nota2[i]) / 2;

            alunos[i] = (result[i] >= 7) ? "Aprovado!" : "Reprovado!";
        }

        System.out.println("------ Nota e situação dos alunos ------");
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Aluno " + (i + 1) + ": Nota " + result[i] + " -> " + alunos[i]);
        }
    }
}