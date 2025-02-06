package Projects.TicTacToe;

import java.util.Scanner;

public class TicTacToe {

    // Board
    static  char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    // The first player is always 'X'
    static char currentPlayer = 'X';

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n<------------ TIC-TAC-TOE ------------>\n");

        System.out.println("Rules:-");
        System.out.println("1. The goal is to place three marks (X or O) in a row, column, or diagonal to win a game");
        System.out.println("2. Winning: A player wins if they have three marks in a row, column, or diagonal.");
        System.out.println("3. Tie: If all cells are filled and no player has won, it's a tie.\n");

        // Loop until the game ends
        while(true){
            printBoard();
            printPlayerMove(scanner);

            if (isWinner()){
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }

            if (isBoardFull()){
                printBoard();
                System.out.println("It's a tie!");
                break;
            }

            // Switch Player
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
        
        scanner.close();
    }

    private static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i<3; i++){
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    // Handle player's move
    private static void printPlayerMove(Scanner scanner) {
        int row, col;

        // Keep asking until valid input
        while (true) {
            System.out.print("Player " + currentPlayer + ", enter your move (row and column from 1 to 3): ");
            row = scanner.nextInt() - 1; // Convert to 0-indexed
            col = scanner.nextInt() - 1; // Convert to 0-indexed

            // Check if the position is valid
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                break;
            } else {
                System.out.println("This position is invalid or already taken. Try again.");
            }
        }
    }

    // Check if there's a winner
    private static boolean isWinner() {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        return board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer;
    }

    // Check if the board is full (no more empty spaces)
    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}