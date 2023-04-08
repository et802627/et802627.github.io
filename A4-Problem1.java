/**
 * Ethan Yee | B00935929
 * CSCI 1105 | Section 01
 * Assignment 4 | November 18, 2022
 * This program takes in input from the user to create a Tic-Tac-Toe grid filled with the two player's marks
 */

import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        // Creating Tic-Tac-Toe grid
        int[][] grid = new int[3][3];

        // Variable used to check if either player1 or player2 go to pick and place their location and mark
        String go = "player1";

        // Loop that determines the duration of the game of Tic-Tac-Toe and the activity that takes place
        while (true){

            // Determining whether its player1 go
            if (go == "player1"){

                // Variables recieved from input to indicate name of player (player1) and location chosen to place their mark
                String playerName = in.next();
                int playerTurn = in.nextInt();

                /**
                 // Determining where player1 chose to place their mark and placing their mark in that location
                 // Or if -1 is chosen to indicate the end of game
                 */
                if (playerTurn == 1){
                    grid[0][0] = 1;
                }
                else if (playerTurn == 2){
                    grid[0][1] = 1;
                }
                else if (playerTurn == 3){
                    grid[0][2] = 1;
                }
                else if (playerTurn == 4){
                    grid[1][0] = 1;
                }
                else if (playerTurn == 5){
                    grid[1][1] = 1;
                }
                else if (playerTurn == 6){
                    grid[1][2] = 1;
                }
                else if (playerTurn == 7){
                    grid[2][0] = 1;
                }
                else if (playerTurn == 8){
                    grid[2][1] = 1;
                }
                else if (playerTurn == 9){
                    grid[2][2] = 1;
                }
                else if (playerTurn == -1){
                    break;
                }
                // Switching players turn to be player2 to continue game
                go = "player2";
            }

            // Determining whether its player2 go
            else if (go == "player2"){

                // Variables recieved from input to indicate name of player (player2) and location chosen to place their mark
                String playerName = in.next();
                int playerTurn = in.nextInt();

                /**
                 // Determining where player2 chose to place their mark and placing their mark in that location
                 // Or if -1 is chosen to indicate the end of game
                 */
                if (playerTurn == 1){
                    grid[0][0] = 2;
                }
                else if (playerTurn == 2){
                    grid[0][1] = 2;
                }
                else if (playerTurn == 3){
                    grid[0][2] = 2;
                }
                else if (playerTurn == 4){
                    grid[1][0] = 2;
                }
                else if (playerTurn == 5){
                    grid[1][1] = 2;
                }
                else if (playerTurn == 6){
                    grid[1][2] = 2;
                }
                else if (playerTurn == 7){
                    grid[2][0] = 2;
                }
                else if (playerTurn == 8){
                    grid[2][1] = 2;
                }
                else if (playerTurn == 9){
                    grid[2][2] = 2;
                }
                else if (playerTurn == -1){
                    break;
                }
                // Switching players turn to be player1 to continue game
                go = "player1";
            }
        }

        // Displaying Tic-Tac-Toe grid after all marks have been placed, r = row and c = column
        for (int r = 0; r < 3; r++){
            for (int c = 0; c < 3; c++){
                System.out.print(grid[r][c]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
