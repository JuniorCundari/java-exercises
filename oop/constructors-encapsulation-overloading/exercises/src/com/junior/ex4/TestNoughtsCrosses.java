package com.junior.ex4;

import java.util.Scanner;

public class TestNoughtsCrosses {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        NoughtsCrosses noughtsCrosses = new NoughtsCrosses();

        do {
            noughtsCrosses.setMatches(noughtsCrosses.getMatches()); // Incrementa o contador de partidas
            System.out.println("Partida #" + noughtsCrosses.getMatches());

            char player1 = ' ';
            char player2 = ' ';
            boolean validChoice = false;

            while (!validChoice) {
                System.out.print("Escolha entre 'O' ou 'X': ");
                char choice = scan.next().toUpperCase().charAt(0);
                System.out.println("-----------------");

                if (choice == 'O' || choice == 'X') {
                    player1 = choice;
                    player2 = (choice == 'O') ? 'X' : 'O'; // Alternativa de atribuição de valor
                    validChoice = true;
                } else {
                    System.out.println("Escolha inválida!");
                    System.out.println("-----------------");
                }
            }

            System.out.println("Jogador 1: " + player1);
            System.out.println("Jogador 2: " + player2);
            System.out.println("------------------------------------------");

            boolean won = false;
            char signal;
            int position;

            // deixa o tabuleiro em branco para melhor visibilidade, jogatina e faz o resete para as próximas partidas
            noughtsCrosses.resetBoard();

            while (!won) {
                if (noughtsCrosses.turnPlayer()) {
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

                    int row = noughtsCrosses.calculateRow(position);
                    int col = noughtsCrosses.calculateCol(position);

                    if (noughtsCrosses.validatePositionBoard(row, col)) {
                        validPosition = true;
                    } else {
                        System.out.println("Posição inválida!");
                        System.out.println("-----------------");
                        continue;
                    }

                    if (!noughtsCrosses.validateMove(row, col, signal)) {
                        System.out.println("Posição já ocupada!");
                        System.out.println("-------------------");
                    }

                    // imprime o tabuleiro
                    noughtsCrosses.printsBoard();

                    // verifica o ganhador
                    if (noughtsCrosses.checkWinner(player1)) {
                        won = true;
                        noughtsCrosses.setWinsPlayer1(noughtsCrosses.getWinsPlayer1());
                        System.out.println("Jogador 1 venceu!!!");
                    } else if (noughtsCrosses.checkWinner(player2)) {
                        won = true;
                        noughtsCrosses.setWinsPlayer2(noughtsCrosses.getWinsPlayer2());
                        System.out.println("Jogador 2 venceu!!!");
                    } else if (noughtsCrosses.getRound() > 9) {
                        won = true;
                        noughtsCrosses.setTied(noughtsCrosses.getTied());
                        System.out.println("Não temos vencedor!!!");
                    }
                }
            }

            System.out.println("------------------------------------------");
            System.out.print("Deseja continuar? (1 - Sim, 0 - Não): ");
        } while (scan.nextInt() == 1); // Continue se o usuário digitar 1

        noughtsCrosses.printsResult();
    }
}
