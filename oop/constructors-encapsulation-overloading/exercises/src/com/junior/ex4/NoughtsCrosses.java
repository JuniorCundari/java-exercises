package com.junior.ex4;

public class NoughtsCrosses {
    private char[][] board;
    private int round;

    private int matches;
    private int winsPlayer1;
    private int winsPlayer2;
    private int tied;

    public NoughtsCrosses() {
        board = new char[3][3];
        round = 1;
        matches = 0;
    }

    public char[][] getBoard() {
        return board;
    }

    public void setBoard(char[][] board) {
        this.board = board;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public int getMatches() {
        return matches;
    }

    public void setMatches(int matches) {
        this.matches = matches + 1;
    }

    public int getWinsPlayer1() {
        return winsPlayer1;
    }

    public void setWinsPlayer1(int winsPlayer1) {
        this.winsPlayer1 = winsPlayer1 + 1;
    }

    public int getWinsPlayer2() {
        return winsPlayer2;
    }

    public void setWinsPlayer2(int winsPlayer2) {
        this.winsPlayer2 = winsPlayer2 + 1;
    }

    public int getTied() {
        return tied;
    }

    public void setTied(int tied) {
        this.tied = tied + 1;
    }

    public boolean validateMove(int row, int col, char signal) {
        if (board[row][col] == 'X' || board[row][col] == 'O') {
            return false;
        } else {
            board[row][col] = signal;
            round++;
            return true;
        }
    }

    public void printsBoard() {
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

    public void resetBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }

        round = 1;
    }

    public boolean checkWinner(char signal) {
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

    public boolean turnPlayer() {
        if (round % 2 == 1) {
            return true;
        }

        return false;
    }

    public int calculateRow(int position) {
        return position / 3;
    }

    public int calculateCol(int position) {
        return position % 3;
    }

    public boolean validatePositionBoard(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0) {
            return true;
        }

        return false;
    }

    public void printsResult() {
        System.out.println("------------------------------------------");
        System.out.println("Total de partidas jogadas: " + matches);
        System.out.println("------------------------------------------");
        System.out.println("Número de vitórias do Jogador 1: " + winsPlayer1);
        System.out.println("------------------------------------------");
        System.out.println("Número de vitórias do Jogador 2: " + winsPlayer2);
        System.out.println("------------------------------------------");
        System.out.println("Número de empates: " + tied);
        System.out.println("------------------------------------------");
        System.out.println("Obrigado por jogar!");
    }
}
