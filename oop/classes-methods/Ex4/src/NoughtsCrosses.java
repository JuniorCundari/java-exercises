public class NoughtsCrosses {
    char[][] board = new char[3][3];
    int round = 1;

    int matches;
    int winsPlayer1;
    int lossPlayer1;
    int winsPlayer2;
    int lossPlayer2;
    int tied;

    boolean validateMove(int row, int col, char signal) {
        if (board[row][col] == 'X' || board[row][col] == 'O') {
            return false;
        } else {
            board[row][col] = signal;
            round++;
            return true;
        }
    }

    void printsBoard() {
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
    }

    void resetBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }

        round = 1;
    }

    boolean checkWinner(char signal) {
        if ((board[0][0] == signal && board[0][1] == signal && board[0][2] == signal) ||
                (board[1][0] == signal && board[1][1] == signal && board[1][2] == signal) ||
                (board[2][0] == signal && board[2][1] == signal && board[2][2] == signal) ||
                (board[0][0] == signal && board[1][0] == signal && board[2][0] == signal) ||
                (board[0][1] == signal && board[1][1] == signal && board[2][1] == signal) ||
                (board[0][2] == signal && board[1][2] == signal && board[2][2] == signal) ||
                (board[0][0] == signal && board[1][1] == signal && board[2][2] == signal) ||
                (board[0][2] == signal && board[1][1] == signal && board[2][0] == signal)) {
            return true;
        }

        return false;
    }

    boolean turnPlayer() {
        if (round % 2 == 1) {
            return true;
        }

        return false;
    }

    int calculateRow(int position) {
        return position / 3;
    }

    int calculateCol(int position) {
        return position % 3;
    }

    boolean validatePositionBoard(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0) {
            return true;
        }

        return false;
    }

    void printsResult() {
        System.out.println("------------------------------------------");
        System.out.println("Total de partidas jogadas: " + matches);
        System.out.println("------------------------------------------");
        System.out.println("Número de vitórias do Jogador 1: " + winsPlayer1);
        System.out.println("Número de derrotas do Jogador 1: " + lossPlayer1);
        System.out.println("------------------------------------------");
        System.out.println("Número de vitórias do Jogador 2: " + winsPlayer2);
        System.out.println("Número de derrotas do Jogador 2: " + lossPlayer2);
        System.out.println("------------------------------------------");
        System.out.println("Número de empates: " + tied);
        System.out.println("------------------------------------------");
        System.out.println("Obrigado por jogar!");
    }
}