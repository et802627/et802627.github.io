/*
 * CSCI 1105 - Assignment 5 - Problem 1
 * Author: <Ethan Yee>
 * Date: <December 2, 2022>
 * Banner ID: <B00935929>
 * This program takes in input from the user to create a game of battleship with a board that includes a ship/target
 */

import java.util.Scanner;
public class Problem1 {

    /**
     * Locates the board index of each target coordinate and sets it equal to 1
     * To then eventually add each target (T) to its corresponding board index in the getGrid method
     * 1 representing a situation where a board index has a target (T)
     * @param board the battleship game grid
     * @param col the column location of the target coordinate, letter
     * @param row the row location of the target coordinate, number
     */
    public static void setTarget(int[][] board, char col, char row)
    {
        String colString = "" + col;
        String rowString = "" + row;
        String columns = "ABCDEFGH";
        String rows = "12345678";
        int colIndex = columns.indexOf(colString);
        int rowIndex = rows.indexOf(rowString);

        board[rowIndex][colIndex] = 1;
    }

    /**
     * Adds a target (T) to its corresponding board index (when board index equals 1)
     * Adds an (_) to the remaining board index not equal to 1
     * Creates a string that represents the battleship game grid
     * @param board the battleship game grid
     * @return a string that represents the battleship game grid
     */
    public static String getGrid(int[][] board)
    {
        String result = "";

        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                if (board[i][j] == 1)
                {
                    result = result + " T ";
                }
                else
                {
                    result = result + " _ ";
                }
            }
            result = result + "\n";
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Reading in the amount of targets to include in the grid
        int targets = in.nextInt();

        // Creating the game grid
        int[][] board = new int [8][8];

        // Creating variable used to read in the coordinates of each target
        String coordinate = "";

        // Loop used to read in the coordinates of each target and add them to a particular cell in the grid
        for (int i = 0; i < targets; i++)
        {
            // Reading in the coordinates of each target
            coordinate = in.next();
            // Calling the setTarget method to add the coordinates of each target to a particular cell in the grid
            setTarget(board, coordinate.charAt(0), coordinate.charAt(1));
        }
        // Calling the getGrid method to display the game grid
        System.out.println(getGrid(board));
    }
}
