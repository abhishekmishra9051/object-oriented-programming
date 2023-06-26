package org.inheritanceOverview;

import static java.lang.Math.abs;

public class TicTacToe {
    private final int n;
    private final int[][] board;
    private final int[] rowSum, colSum;
    private int diagSum, revDiagSum;
    private int winner;

    public TicTacToe(final int n) {
        this.n = n;
        board = new int[n][n];
        rowSum = new int[n];
        colSum = new int[n];
    }

    public int move(int player, int row, int col) throws IllegalArgumentException {
        if (row < 0 || col < 0 || row >= n || col >= n) {
            throw new IllegalArgumentException("Move out of board boundary!");
        }

        if (board[row][col] != 0) {
            throw new IllegalArgumentException("Square is already occupied!");
        }

        if (player != 0 && player != 1) {
            throw new IllegalArgumentException("Invalid player!");
        }

        if (getWinner() != 0) {
            throw new IllegalArgumentException("Board is decided!");
        }

        int playerSign = (player == 0) ? -1 : 1;
        board[row][col] = playerSign;
        rowSum[row] += playerSign;
        colSum[col] += playerSign;

        if (row == col) {
            diagSum += playerSign;
        }

        if (row == n - 1 - col) {
            revDiagSum += playerSign;
        }

        if (rowSum[row] == abs(n) || colSum[col] == abs(n) || diagSum == abs(n) || revDiagSum == abs(n)) {
            winner = player;
        }

        return 0;
    }

    public int getWinner() {
        return winner;
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe(3);  // Create a TicTacToe game with a 3x3 board

        game.move(0, 0, 0);  // Player 1 (represented by -1) moves at row 0, column 0
        game.move(1, 1, 1);  // Player 2 (represented by 1) moves at row 1, column 1
        game.move(0, 2, 2);  // Player 1 moves at row 2, column 2

        int winner = game.getWinner();  // Get the winner of the game

        if (winner == 0) {
            System.out.println("The game is still in progress.");
        } else if (winner == -1) {
            System.out.println("Player 1 wins!");
        } else if (winner == 1) {
            System.out.println("Player 2 wins!");
        }
    }
}
