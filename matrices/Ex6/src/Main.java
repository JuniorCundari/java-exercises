import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int matches = 0;
        int winsPlayer1 = 0;
        int lossPlayer1 = 0;
        int winsPlayer2 = 0;
        int lossPlayer2 = 0;
        int tied = 0;

        do {
            matches++; // Incrementa o contador de partidas
            System.out.println("Partida #" + matches);

            char[][] board = new char[3][3];

            char player1 = ' ';
            char player2 = ' ';
            boolean validChoice = false;

            while (!validChoice) {
                System.out.print("Escolha entre 'O' ou 'X': ");
                char choice = scan.next().charAt(0);
                System.out.println("-----------------");

                if (choice == 'O' || choice == 'X') {
                    player1 = choice;
                    player2 = (choice == 'O') ? 'X' : 'O'; // Alternativa de atribuição de valor
                    validChoice = true;
                } else {
                    System.out.println("-----------------");
                    System.out.println("Escolha inválida!");
                    System.out.println("-----------------");
                }
            }

            System.out.println("Jogador 1: " + player1);
            System.out.println("Jogador 2: " + player2);
            System.out.println("------------------------------------------");

            boolean won = false;
            int round = 1;
            char signal;
            int position;

            while (!won) {
                if (round % 2 == 1) {
                    System.out.println("Jogador 1, sua vez!");
                    signal = player1;
                } else {
                    System.out.println("Jogador 2, agora é a sua vez!");
                    signal = player2;
                }

                boolean validPosition = false;

                while (!validPosition) {
                    System.out.print("Entre com a posição do tabuleiro (1 a 9): ");
                    position = scan.nextInt() - 1;

                    System.out.println("------------------------------------------");

                    int row = position / 3;
                    int col = position % 3;

                    if (row >= 0 && row < 3 && col >= 0) {
                        validPosition = true;
                    } else {
                        System.out.println("Posição inválida!");
                        System.out.println("-----------------");
                        continue;
                    }

                    if (board[row][col] == 'X' || board[row][col] == 'O') {
                        System.out.println("Posição já ocupada!");
                        System.out.println("-------------------");
                    } else {
                        board[row][col] = signal;
                        round++;
                    }

                    // imprime o tabuleiro
                    for (int i = 0; i < board.length; i++) {
                        for (int j = 0; j < board[i].length; j++) {
                            System.out.print(" " + board[i][j] + " ");

                            if (j < board[i].length - 1) {
                                System.out.print("|");
                            }
                        }

                        System.out.println();

                        if (i < board.length - 1) {
                            System.out.println("---|---|---");
                        }
                    }

                    // verifica o ganhador
                    if ((board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') ||
                            (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') ||
                            (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') ||
                            (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') ||
                            (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') ||
                            (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') ||
                            (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') ||
                            (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X')) {
                        won = true;
                        winsPlayer1++;
                        lossPlayer1 = matches - winsPlayer1;
                        System.out.println("Jogador 1 venceu!!!");
                    } else if ((board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') ||
                            (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') ||
                            (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') ||
                            (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') ||
                            (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') ||
                            (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') ||
                            (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') ||
                            (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O')) {
                        won = true;
                        winsPlayer2++;
                        lossPlayer2 = matches - winsPlayer2;
                        System.out.println("Jogador 2 venceu!!!");
                    } else if (round > 9) {
                        won = true;
                        tied++;
                        System.out.println("Não temos vencedor!!!");
                    }
                }
            }

            System.out.println("------------------------------------------");
            System.out.print("Deseja continuar? (1 - Sim, 0 - Não): ");
        } while (scan.nextInt() == 1); // Continue se o usuário digitar 1

        System.out.println("------------------------------------------");
        System.out.println("Total de partidas jogadas: " + matches);
        System.out.println("Número de vitórias do Jogador 1: " + winsPlayer1);
        System.out.println("Número de derrotas do Jogador 1: " + lossPlayer1);

        System.out.println("Número de vitórias do Jogador 2: " + winsPlayer2);
        System.out.println("Número de derrotas do Jogador 2: " + lossPlayer2);

        System.out.println("Número de empates: " + tied);

        System.out.println("Obrigado por jogar!");
    }
}
